package org.zsh.emailspam.domain.model;

import org.zsh.emailspam.domain.enums.EmailStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class Email {

    private String sender;
    private String receiver;
    private String email;
    private String subject;
    private String body;
    private LocalDateTime sentAt;
    private EmailStatus status;

    public Email (){}

    public Email ( String sender, String receiver, String subject, String body, LocalDateTime sentAt, EmailStatus status ) {
        this.sender = sender;
        this.receiver = receiver;

        this.subject = subject;
        this.body = body;
        this.sentAt = sentAt;
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

    public LocalDateTime getSentAt () {
        return sentAt;
    }

    public void setSentAt ( LocalDateTime sentAt ) {
        this.sentAt = sentAt;
    }

    public EmailStatus getStatus () {
        return status;
    }

    public void setStatus ( EmailStatus status ) {
        this.status = status;
    }
}
