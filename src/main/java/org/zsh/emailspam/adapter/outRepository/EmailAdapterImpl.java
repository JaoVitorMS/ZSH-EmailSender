package org.zsh.emailspam.adapter.outRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.zsh.emailspam.adapter.outRepository.entity.EmailEntity;
import org.zsh.emailspam.application.ports.out.EmailRepositoryPort;

import java.util.List;

@Repository
@AllArgsConstructor
public class EmailAdapterImpl implements EmailRepositoryPort {

    private final EmailAdapterJPA emailAdapterJPA;

    @Override
    public void save ( EmailEntity emailEntity ) {
        emailAdapterJPA.save(emailEntity);
    }

    @Override
    public List<EmailEntity> findByReceiver ( String receiver ) {
        return emailAdapterJPA.findByReceiver( receiver );
    }

    @Override
    public void delete ( EmailEntity emailEntity ) {
        emailAdapterJPA.delete( emailEntity );
    }

    @Override
    public List<EmailEntity> findAll () {
        return emailAdapterJPA.findAll();
    }
}
