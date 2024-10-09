package org.zsh.emailspam.domain.model;

import org.zsh.emailspam.domain.enums.EmailStatus;

public class Email {

    private String sender;
    private String receiver;
    private String email;
    private String subject;
    private String body;
    private EmailStatus status;

    public Email(String sender, String receiver, String email, String subject, String body, EmailStatus status) {
        this.sender = sender;
        this.receiver = receiver;
        this.email = email;
        this.subject = subject;
        this.body = body;
        this.status = status;
    }

    public String getSender () {
        return sender;
    }

    public void setSender ( String sender ) {
        this.sender = sender;
    }

    public String getReceiver () {
        return receiver;
    }

    public void setReceiver ( String receiver ) {
        this.receiver = receiver;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getSubject () {
        return subject;
    }

    public void setSubject ( String subject ) {
        this.subject = subject;
    }

    public String getBody () {
        return body;
    }

    public void setBody ( String body ) {
        this.body = body;
    }

    public EmailStatus getStatus () {
        return status;
    }
    public void setStatus ( EmailStatus status ) {
        this.status = status;
    }
}
