package com.anidea.AnIdeaWebApp.user;

import com.anidea.AnIdeaWebApp.email.EmailService;
import com.anidea.AnIdeaWebApp.user.exception.ActivationNotificationException;
import com.anidea.AnIdeaWebApp.user.exception.NotUniqueEmailException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.mail.MailException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    EmailService emailService;
    @Transactional(rollbackOn = MailException.class)
    public void save(User user) {
        try{
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setActivationToken(UUID.randomUUID().toString());
            userRepository.saveAndFlush(user);
            emailService.sendActivationEmail(user.getEmail(), user.getActivationToken());
        } catch (DataIntegrityViolationException ex){
           throw new NotUniqueEmailException();
        } catch (MailException ex){
            throw new ActivationNotificationException();
        }

    }



}
