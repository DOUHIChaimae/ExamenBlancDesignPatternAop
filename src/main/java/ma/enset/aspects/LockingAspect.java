package ma.enset.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LockingAspect {

    @Around("@annotation(Lock)")
    public Object lockMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Method locked: " + joinPoint.getSignature().toShortString());
        return null;
    }
}
