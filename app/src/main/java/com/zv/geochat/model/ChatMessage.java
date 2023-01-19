package com.zv.geochat.model;

public class ChatMessage {
    private String id;
    private String userName;
    private String body;
    private String messageDate;
    public ChatMessage() {
    }

    public ChatMessage(String userName, String body, String messageDate) {
        this.userName = userName;
        this.body = body;
        this.messageDate = messageDate;
    }

    public ChatMessage(String id, String userName, String body, String messageDate) {
        this.id = id;
        this.userName = userName;
        this.body = body;
        this.messageDate = messageDate;
    }


    public String getUserName() {
        return userName;
    }

    public String getBody() {
        return body;
    }

    public String getId() {
        return id;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", body='" + body + '\'' +
                ", messageDate='" + messageDate + '\'' +
                '}';
    }
}
