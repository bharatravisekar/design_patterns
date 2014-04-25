package com.bharat.design_patterns.chain_of_responsibility;

/**
 * A response.
 */
public class Response {
    String greet;

    public Response(String greet) {
        this.greet = greet;
    }

    public String toString() {
        return this.greet;
    }
}
