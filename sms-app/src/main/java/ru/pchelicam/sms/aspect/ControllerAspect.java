package ru.pchelicam.sms.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    @Pointcut("execution(* ru.pchelicam.sms.controller.*.*(..))")
    public void smsControllerPointcut() {}

    @After("smsControllerPointcut()")
    public void logAfterSendingSms(JoinPoint point) {
        LOGGER.info("sms was sent");
    }

}
