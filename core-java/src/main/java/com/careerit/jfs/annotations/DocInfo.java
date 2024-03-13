package com.careerit.jfs.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DocInfo {

    String author();
    String createdDate();
    String description();
    String version() default "1.0";
    String[] reviewers() default {};
}
