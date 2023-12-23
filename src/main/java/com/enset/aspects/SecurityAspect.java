package com.enset.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import java.util.Scanner;

@Aspect
public class SecurityAspect {


    @Before("@annotation(securedBy)")
    public void checkSecurity(JoinPoint joinPoint, SecuredBy securedBy) {
        System.out.println("Checking security...");
        String[] requiredRoles = securedBy.roles();
        boolean hasRequiredRoles = checkUserRoles(requiredRoles);

        if (!hasRequiredRoles) {
            System.out.println("Access denied! User does not have required roles.");
            throw new SecurityException("Access denied! User does not have required roles.");
        }
        System.out.println("Security check passed. Proceeding with the method...");
    }

    private boolean checkUserRoles(String[] requiredRoles) {
        Scanner sc = new Scanner(System.in);
        System.out.print("username :");
        String username = sc.next();
        System.out.print("password :");
        String password = sc.next();
        User user = new User();
        if (username.equals("eraoui")) {
            if (password.equals("1234")) {
                user.addRole("role1");
            } else if (password.equals("12345")) {
                user.addRole("role1");
                user.addRole("role2");
            }
        }
        for (String requiredRole : requiredRoles) {
            if (!user.hasRole(requiredRole)) {
                return false;
            }
        }
        return true;
    }
}