package org.zsh.emailspam.application.ports.in.userCase;

import org.zsh.emailspam.domain.model.Email;
import org.zsh.emailspam.dto.EmailDTO;

public interface EmailUserCase {

    void send( EmailDTO emailDTO );

}
