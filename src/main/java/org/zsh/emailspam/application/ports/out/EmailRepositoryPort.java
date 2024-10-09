package org.zsh.emailspam.application.ports.out;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.zsh.emailspam.adapter.outRepository.EmailAdapterImpl;
import org.zsh.emailspam.adapter.outRepository.entity.EmailEntity;

import java.util.List;

@Component
public interface EmailRepositoryPort {
    void save( EmailEntity emailEntity );
    List<EmailEntity> findByReceiver( String receiver );
    void delete( EmailEntity emailEntity );
    List<EmailEntity> findAll();

}
