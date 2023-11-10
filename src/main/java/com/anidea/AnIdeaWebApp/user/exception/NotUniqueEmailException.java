package com.anidea.AnIdeaWebApp.user.exception;


import com.anidea.AnIdeaWebApp.shared.Messages;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Collections;
import java.util.Map;


public class NotUniqueEmailException extends RuntimeException{

    public NotUniqueEmailException(){
        super(Messages.getMessageForLocale("anidea.error.validation", LocaleContextHolder.getLocale()));
    }

    public Map<String, String> getValidationErrors(){
        return Collections.singletonMap("email", Messages.getMessageForLocale("anidea.constraint.email.notunique",
                LocaleContextHolder.getLocale()));
    }

}
