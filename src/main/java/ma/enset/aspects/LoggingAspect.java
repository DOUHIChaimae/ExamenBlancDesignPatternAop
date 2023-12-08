package ma.enset.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @After("@annotation(Log)")
    public void log(JoinPoint joinPoint) {
        System.out.println("Action logged: " + joinPoint.getSignature().toShortString());
    }
}