package com.enset.aspects;

import com.enset.entities.Agent;
import com.enset.entities.TransactionEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class CachingAspect {

    private Map<String, TransactionEntity> methodsCache = new HashMap<>();

    @Around("@annotation(Cachable)")
    public Object cacheMethodResult(ProceedingJoinPoint joinPoint) throws Throwable {
        String agentName = ((Agent)joinPoint.getThis()).getName();

        if (methodsCache.containsKey(agentName)) {
            System.out.println("Dans le cache la transaction avec le plus montant de l'agent : " + agentName);
            return methodsCache.get(agentName);
        } else {
            System.out.println("L'agent n'est dans le cache " + agentName);
            Object result = joinPoint.proceed();
            methodsCache.put(agentName, (TransactionEntity) result);
            return result;
        }
    }
}

