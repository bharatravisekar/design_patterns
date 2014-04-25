package com.bharat.design_patterns.chain_of_responsibility;

/**
 * Welcome boys.
 */
public class WelcomeGirlsHandler implements WelcomeHandler {
    public Response welcome(Person person) {
        if(person.getAge() <= 12 && person.getGender() == Person.Gender.Female) {
            return new Response("Hi miss...");
        }

        return null;
    }
}
