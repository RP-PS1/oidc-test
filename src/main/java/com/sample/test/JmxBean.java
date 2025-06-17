package com.sample.test;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName = "com.sample:type=JmxBean") 
public class JmxBean {

    private String message = "Hello, JMX!";

    @ManagedAttribute
    public String getMessage() {
        return message;
    }

    @ManagedOperation
    public void setMessage(String message) {
        this.message = message;
    }

    @ManagedOperation
    public void printMessage() {
        System.out.println("Current message: " + message);
    }
}
