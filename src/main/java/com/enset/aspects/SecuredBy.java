package com.enset.aspects;

public @interface SecuredBy {
    String[] roles() default {};
}
