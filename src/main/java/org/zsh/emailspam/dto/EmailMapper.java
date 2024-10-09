package org.zsh.emailspam.dto;

import org.springframework.stereotype.Component;
import org.zsh.emailspam.adapter.outRepository.entity.EmailEntity;

@Component
public class EmailMapper {

    public EmailEntity toEmailEntity( EmailDTO emailDTO ) {
        return new EmailEntity(
                emailDTO.sender(),
                emailDTO.receiver(),
                emailDTO.subject(),
                emailDTO.body());
    }
}
