package org.zsh.emailspam.adapter.in;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zsh.emailspam.dto.EmailDTO;
import org.zsh.emailspam.application.ports.service.EmailService;

@RestController
@RequestMapping("/email")
@AllArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/enviar")
    public ResponseEntity<EmailDTO> enviar( @RequestBody EmailDTO emailDTO ) {
        emailService.send(emailDTO);
        return new ResponseEntity<>(emailDTO, HttpStatus.CREATED);
    }
}
