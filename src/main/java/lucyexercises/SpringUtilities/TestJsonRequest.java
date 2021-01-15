package lucyexercises.SpringUtilities;

import java.util.Date;

public class TestJsonRequest {
    public String msg;
    public String sender;
    public Date receiveDate;

    public TestJsonRequest(String msg, String sender) {
        this.msg = msg;
        this.sender = sender;
        receiveDate = new Date();
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

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }
}
