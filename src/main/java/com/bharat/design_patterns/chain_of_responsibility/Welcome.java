package com.bharat.design_patterns.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Welcomes a person.
 */
public class Welcome {
    private static List<WelcomeHandler> welcomeHandlers = new ArrayList<>();
    static {
        welcomeHandlers = new ArrayList<>();
        welcomeHandlers.add(new WelcomeBoysHandler());
        welcomeHandlers.add(new WelcomeGirlsHandler());
        welcomeHandlers.add(new WelcomeWomenHandler());
        welcomeHandlers.add(new DefaultWelcomeHandler());
    }

    public static Response welcome(Person person) throws MyException {
        for (WelcomeHandler handler : welcomeHandlers) {
            Response response = handler.welcome(person);
            if (response != null)
                return response;
        }

        return null;
    }
}
