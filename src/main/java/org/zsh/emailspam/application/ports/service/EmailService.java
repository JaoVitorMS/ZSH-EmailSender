package org.zsh.emailspam.application.ports.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.zsh.emailspam.adapter.outRepository.entity.EmailEntity;
import org.zsh.emailspam.application.ports.in.userCase.EmailUserCase;
import org.zsh.emailspam.application.ports.out.EmailRepositoryPort;
import org.zsh.emailspam.domain.enums.EmailStatus;
import org.zsh.emailspam.domain.model.Email;
import org.zsh.emailspam.dto.EmailDTO;
import org.zsh.emailspam.dto.EmailMapper;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class EmailService implements EmailUserCase {

    private final EmailRepositoryPort emailRepositoryPort;
    private JavaMailSender mailSender;
    private final EmailMapper emailMapper;


    @Override
    public void send ( EmailDTO emailDTO ) {
        EmailEntity emailEntity = emailMapper.toEmailEntity( emailDTO );
        emailEntity.setSentAt(LocalDateTime.now());

        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailEntity.getSender());
            message.setTo(emailEntity.getReceiver());
            message.setSubject(emailEntity.getSubject());
            message.setText(emailEntity.getBody());
            mailSender.send(message);

            emailEntity.setStatus(EmailStatus.ENVIADO);
        } catch (MailException e) {
            emailEntity.setStatus(EmailStatus.NAO_ENVIADO);
        } finally {
            emailRepositoryPort.save(emailEntity);
        }
    }


}
