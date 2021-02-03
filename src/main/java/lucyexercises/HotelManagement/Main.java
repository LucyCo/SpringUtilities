package lucyexercises.HotelManagement;

import java.time.LocalDate;
import java.time.Month;

public class Main {
	final static int DEF_ROOM_NUM = 10;

	static HotelManager createHotelManager() {
		return new MyHotelManager(DEF_ROOM_NUM);
	}
	
	/**
	 * This is an example use of the hotel manager and you should verify that your implementation
	 * doesn't fail on any of the assertions, but we will run additional testing to verify the implementation
	 * of the whole api so make sure you implemented correctly all the methods of the hotel manager.
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		HotelManager hotelManager = createHotelManager();
		// In this setting the hotel will have only two rooms but it may get a different number in other tests
		hotelManager.setNumberOfRooms(2);
		
		LocalDate janurarySecond = createDate(2);
		LocalDate januraryThird = createDate(3);
		
		boolean reservationSuccess = hotelManager.makeReservation(new Reservation(janurarySecond, januraryThird, 5));
		// reservationSuccess should be true
		assertTrue(reservationSuccess);
		
		Reservation secondReservation = new Reservation(janurarySecond, januraryThird, 10);
		reservationSuccess = hotelManager.makeReservation(secondReservation);
		// reservationSuccess should be true
		assertTrue(reservationSuccess);
		
		int totalReservationPrice = hotelManager.getPriceOfReservations(createDate(1), createDate(30));
		assertTrue(totalReservationPrice == 15);

		reservationSuccess = hotelManager.makeReservation(new Reservation(janurarySecond, januraryThird, 25));
		// reservationSuccess should be false since there is no more room on those dates
		assertFalse(reservationSuccess);
		
		hotelManager.cancelReservation(secondReservation.getId());
		
		reservationSuccess = hotelManager.makeReservation(new Reservation(janurarySecond, januraryThird, 25));
		// reservationSuccess should be true since we canceled one reservation and there should be a room on that date
		assertTrue(reservationSuccess);
		
		totalReservationPrice = hotelManager.getPriceOfReservations(createDate(1), createDate(30));
		assertTrue(totalReservationPrice == 30);
		
		reservationSuccess = hotelManager.makeReservation(new Reservation(createDate(10), createDate(15), 8));
		// reservationSuccess should be true
		assertTrue(reservationSuccess);
		
		totalReservationPrice = hotelManager.getPriceOfReservations(createDate(1), createDate(30));
		assertTrue(totalReservationPrice == 38);
		
		int numberAvailableRooms = hotelManager.getNumberAvailableRooms(createDate(14));
		assertTrue(numberAvailableRooms == 1);
		
	}
	
	private static LocalDate createDate(int day) {
		return LocalDate.of(2015, Month.JANUARY, day);
	}
	
	private static void assertFalse(boolean conditionToCheck) throws Exception {
		assertTrue(!conditionToCheck);
	}
	
	private static void assertTrue(boolean conditionToCheck) throws Exception {
		if (!conditionToCheck) {
			throw new Exception("Assertion failed");
		}
	}
	
}
