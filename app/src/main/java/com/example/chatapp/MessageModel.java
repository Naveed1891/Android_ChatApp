package com.example.chatapp;

public class MessageModel {
    private String msdId;
    private String senderId;
    private String message;

    public MessageModel() {
    }

    public MessageModel(String msdId, String senderId, String message) {
        this.msdId = msdId;
        this.senderId = senderId;
        this.message = message;
    }

    public String getMsdId() {
        return msdId;
    }

    public void setMsdId(String msdId) {
        this.msdId = msdId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
