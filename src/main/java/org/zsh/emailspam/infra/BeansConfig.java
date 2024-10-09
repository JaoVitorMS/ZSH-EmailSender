package org.zsh.emailspam.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zsh.emailspam.domain.model.Email;

@Configuration
public class BeansConfig {

    @Bean
    public Email email(){
        return new Email();
    }
}
