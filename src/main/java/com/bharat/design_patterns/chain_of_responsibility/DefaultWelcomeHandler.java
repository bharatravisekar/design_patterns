package com.bharat.design_patterns.chain_of_responsibility;

/**
 * Default handler.
 */
public class DefaultWelcomeHandler implements WelcomeHandler {
    public Response welcome(Person person) {
        return new Response("Hi...");
    }
}
