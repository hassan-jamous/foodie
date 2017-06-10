package com.foodie.au.aspects;

import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;
import java.util.Objects;

@Aspect
@Log
public class LoggingAspect {
    @Pointcut("execution(@com.foodie.au.aspects.Loggable * *.*(..))")
    void annotatedMethod() {
    }

    @Pointcut("execution(* (@com.foodie.au.aspects.Loggable *).*(..))")
    void methodOfAnnotatedClass() {
    }

    @Around("annotatedMethod() || methodOfAnnotatedClass()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long start = System.currentTimeMillis();
        StringBuffer loggedMessage = new StringBuffer();
        loggedMessage.append(getMethodSignatureLogMessage(point));
        loggedMessage.append(getMethodArgumentsLogMessage(point));
        Object result;
        try {
            result = point.proceed();
        } catch (Throwable throwable) {
            loggedMessage.append(getExceptionLogMessage(throwable));
            log.info(loggedMessage.toString());
            throw throwable;
        }
        loggedMessage.append(getReturnValueLogMessage(point, result));
        loggedMessage.append(getExecutionTimeLogMessage(start));
        log.info(loggedMessage.toString());
        return result;
    }

    private String getExceptionLogMessage(Throwable throwable) {
        return String.format("exception has happened: %s", throwable.getMessage());
    }

    private String getExecutionTimeLogMessage(long start) {
        return String.format("and execution time: %s MilliSeconds", System.currentTimeMillis() - start);
    }

    private String getMethodSignatureLogMessage(ProceedingJoinPoint point) {
        return String.format("calling %s \n", point.getSignature().toLongString());
    }

    private String getReturnValueLogMessage(ProceedingJoinPoint point, Object result) {
        return String.format("return type %s and value %s. \n", point.getSignature().toLongString(),
                result != null ? result.toString() : "null");
    }

    private String getMethodArgumentsLogMessage(ProceedingJoinPoint point) {
        Object[] arguments = point.getArgs();
        StringBuffer loggedMessage = new StringBuffer();
        Arrays.stream(arguments).filter(Objects::nonNull).forEach(argument -> {
            loggedMessage.append(String.format("With argument of type %s and value %s. \n", argument.getClass().toString(), argument.toString()));
        });
        return loggedMessage.toString();
    }
}
