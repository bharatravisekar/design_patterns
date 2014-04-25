package com.bharat.design_patterns.chain_of_responsibility;

/**
 * Welcome boys.
 */
public class WelcomeBoysHandler implements WelcomeHandler {
    public Response welcome(Person person) {
        if(person.getAge() <= 12 && person.getGender() == Person.Gender.Male) {
            return new Response("Hi young man...");
        }

        return null;
    }
}
