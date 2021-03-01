package de.alexa.virus.communication.transfer;

import lombok.Getter;

public class Request {
    private String reqMessage;
    private String resMessage;


    public String getReqMessage() {
        return reqMessage;
    }

    public void setReqMessage(String reqMessage) {
        this.reqMessage = reqMessage;
    }

    public String getResMessage() {
        return resMessage;
    }

    public void setResMessage(String resMessage) {
        this.resMessage = resMessage;
    }

}
