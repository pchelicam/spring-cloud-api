package ru.pchelicam.push.aspect;

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

    @Pointcut("execution(* ru.pchelicam.push.controller.*.*(..))")
    public void pushControllerPointcut() {}

    @After("pushControllerPointcut()")
    public void logAfterSendingPush(JoinPoint point) {
        LOGGER.info("push was sent");
    }

}
