package com.enset.aspects;

import java.util.HashSet;
import java.util.Set;

public class User {
    private Set<String> roles;

    public User() {
        this.roles = new HashSet<>();
    }

    public void addRole(String role) {
        roles.add(role);
    }

    public boolean hasRole(String role) {
        return roles.contains(role);
    }
}
