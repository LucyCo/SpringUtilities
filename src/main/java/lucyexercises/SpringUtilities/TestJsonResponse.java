package lucyexercises.SpringUtilities;

import java.util.Date;

public class TestJsonResponse {
    public String msg;
    public String sender;
    public Date receiveDate;

    public TestJsonResponse(String msg, String sender, Date receiveDate) {
        this.msg = msg;
        this.sender = sender;
        this.receiveDate = receiveDate;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
