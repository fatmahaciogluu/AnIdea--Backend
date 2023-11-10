package com.anidea.AnIdeaWebApp.user.exception;

import com.anidea.AnIdeaWebApp.shared.Messages;
import org.springframework.context.i18n.LocaleContextHolder;

public class ActivationNotificationException extends RuntimeException {

    public ActivationNotificationException(){
        super(Messages.getMessageForLocale("anidea.create.user.email.failure",
                LocaleContextHolder.getLocale()));
    }
}
