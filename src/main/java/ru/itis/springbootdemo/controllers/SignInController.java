package ru.itis.springbootdemo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.springbootdemo.services.interfacies.MailService;
import ru.itis.springbootdemo.services.interfacies.SignInService;

@Controller
@RequiredArgsConstructor
public class SignInController {

    @Autowired
    private SignInService signInService;

    @Autowired
    private MailService mailService;
}