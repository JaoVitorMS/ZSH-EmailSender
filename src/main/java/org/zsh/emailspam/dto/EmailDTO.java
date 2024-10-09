package org.zsh.emailspam.dto;

import jakarta.validation.constraints.NotNull;
import org.zsh.emailspam.domain.enums.EmailStatus;

public record EmailDTO(@NotNull String sender,
                       @NotNull String receiver,
                       String subject,
                       @NotNull String body) {
}
