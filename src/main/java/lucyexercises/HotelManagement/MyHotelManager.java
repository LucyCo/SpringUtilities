package lucyexercises.HotelManagement;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MyHotelManager implements HotelManager {
    private Room[] rooms;
    private int numberOfRooms;
    private HashMap<Integer, RoomReservation> allReservations = new HashMap<Integer, RoomReservation>();

    public MyHotelManager(int numOfRooms) {
        numberOfRooms = numOfRooms;
        rooms = new Room[numOfRooms];
        initiateRooms();
    }

    @Override
    public void setNumberOfRooms(int numRooms) {
        numberOfRooms = numRooms;
        rooms = new Room[numRooms];
        initiateRooms();
    }

    private void initiateRooms() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
        }
    }

    @Override
    public boolean makeReservation(Reservation reservation) {
        for (int i = 0; i < rooms.length; i++) {
            boolean success = rooms[i].book(reservation);
            if (success) {
                allReservations.put(reservation.getId(), new RoomReservation(i, reservation));
                return true;
            }
        }
        return false;
    }

    @Override
    public void cancelReservation(int reservationId) {
       int roomId = allReservations.get(reservationId).roomNumber;
       allReservations.remove(reservationId);
       rooms[roomId].removeReservation(reservationId);
    }

    @Override
    public Reservation getReservation(int reservationId) {
        return allReservations.get(reservationId).reservation;
    }

    @Override
    public int getNumberAvailableRooms(LocalDate dateToCheck) {
        int counter = 0;
        for (Room currRoom : rooms) {
            if (currRoom.isAvailable(dateToCheck)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int getPriceOfReservations(LocalDate from, LocalDate to) {
        int totalPrice = 0;
        for (Room currRoom : rooms) {
            List<Reservation> filteredRes = currRoom.getReservationsByDate(from, to);
            for (Reservation res : filteredRes) {
               totalPrice += res.getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public List<Reservation> getAllReservationsSortedByPrice(LocalDate from, LocalDate to) {
        return allReservations
                .values()
                .stream()
                .map(roomReservation -> roomReservation.reservation)
                .sorted(Comparator.comparingInt(Reservation::getPrice))
                .collect(Collectors.toList());
    }

    @Override
    public List<Reservation> getAllReservationsSortedByDate(LocalDate from, LocalDate to) {
        return allReservations
                .values()
                .stream()
                .sorted(Comparator.comparingLong(RoomReservation::getFromEpochDay))
                .map(roomReservation -> roomReservation.reservation)
                .collect(Collectors.toList());
    }

    class RoomReservation {
        int roomNumber;
        Reservation reservation;

        public RoomReservation(int roomNumber, Reservation reservation) {
            this.roomNumber = roomNumber;
            this.reservation = reservation;
        }

        public long getFromEpochDay() {
            return reservation.getFromDate().toEpochDay();
        }
    }

    class Room {
        private List<Reservation> reservations = new LinkedList<>();

        public void removeReservation(int reservationId) {
            reservations = reservations.stream().filter(reservation -> reservation.getId() != reservationId).collect(Collectors.toList());
        }

        public List<Reservation> getReservationsByDate(LocalDate fromDate, LocalDate toDate) {
            List<Reservation> filteredDate = new LinkedList<>();
            for (Reservation currReservation : reservations) {
                if ((currReservation.getFromDate().isAfter(fromDate)
                || currReservation.getFromDate().isEqual(fromDate))
                && (currReservation.getToDate().isBefore(toDate)
                || currReservation.getToDate().isEqual(toDate))) {
                    filteredDate.add(currReservation);
                }
            }
            return filteredDate;
        }

        public boolean book(Reservation reservation) {
            int index = getReservationIndex(reservation.getFromDate(), reservation.getToDate());
            if (index == -1) {
                return false;
            }
            this.reservations.add(index, reservation);
            return true;
        }

        private int getReservationIndex(LocalDate fromDate, LocalDate toDate) {
            int freeIndex = -1;
            for (Reservation currentRes : reservations) {
                freeIndex++;
                if (fromDate.isAfter(currentRes.getToDate())
                        || fromDate.isEqual(currentRes.getToDate())) {
                    continue;
                }
                if (toDate.isBefore(currentRes.getFromDate())
                        || toDate.isEqual(currentRes.getFromDate())) {
                    return freeIndex;
                }
                return -1;
            }
            return 0;
        }

        public boolean isAvailable(LocalDate dateToCheck) {
            return getReservationIndex(dateToCheck, dateToCheck) != -1;
        }
    }
}
