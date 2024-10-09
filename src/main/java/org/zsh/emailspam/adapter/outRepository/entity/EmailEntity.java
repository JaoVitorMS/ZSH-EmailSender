package org.zsh.emailspam.adapter.outRepository.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.zsh.emailspam.domain.enums.EmailStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_emails")
@Getter
@Setter
public class EmailEntity  {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String sender;

    @Column(nullable = false)
    private String receiver;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String body;

    @Column(nullable = false)
    private LocalDateTime sentAt;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EmailStatus status;

    public EmailEntity() {}
    public EmailEntity(String sender,
                       String receiver,
                       String subject,
                       String body) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.body = body;
        this.sentAt = sentAt;
        this.status = status;
    }
}
