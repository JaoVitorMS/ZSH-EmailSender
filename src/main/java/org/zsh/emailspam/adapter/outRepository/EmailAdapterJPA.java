package org.zsh.emailspam.adapter.outRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zsh.emailspam.adapter.outRepository.entity.EmailEntity;

import java.util.List;
@Repository
public interface EmailAdapterJPA extends JpaRepository<EmailEntity, Integer> {
    List<EmailEntity> findByReceiver( String receiver);
}
