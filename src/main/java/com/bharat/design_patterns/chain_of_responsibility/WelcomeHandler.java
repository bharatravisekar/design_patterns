package com.bharat.design_patterns.chain_of_responsibility;

/**
 * Handles welcome.
 */
public interface WelcomeHandler {
    public Response welcome(Person person) throws MyException;
}
