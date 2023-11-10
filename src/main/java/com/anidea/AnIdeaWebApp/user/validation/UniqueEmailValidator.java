package com.anidea.AnIdeaWebApp.user.validation;

import com.anidea.AnIdeaWebApp.user.User;
import com.anidea.AnIdeaWebApp.user.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        User inDB= userRepository.findByEmail(value);
        return inDB==null;
    }
}
