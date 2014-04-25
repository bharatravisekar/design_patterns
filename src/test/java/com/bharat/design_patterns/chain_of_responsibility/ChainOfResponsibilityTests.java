package com.bharat.design_patterns.chain_of_responsibility;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests
 */
public class ChainOfResponsibilityTests {
    @Test
    public void testBoy() {
        assertEquals("Boy", Welcome.welcome(new Person(10, Person.Gender.Male)), "Hi boy...");
    }

    @Test
    public void testMan() {
        assertEquals("Man", Welcome.welcome(new Person(30, Person.Gender.Male)), "Hi...");
    }

    @Test
    public void testGirl() {
        assertEquals("Girl", Welcome.welcome(new Person(10, Person.Gender.Female)), "Hi miss...");
    }

    @Test
    public void testWoman() {
        assertEquals("Woman", Welcome.welcome(new Person(40, Person.Gender.Female)), "Hi madam...");
    }

    @Test
    public void testUnknown1() {
        assertEquals("Unknown 1", Welcome.welcome(new Person(5, Person.Gender.Unknown)), "Hi...");
    }

    @Test
    public void testUnknown2() {
        assertEquals("Unknown 2", Welcome.welcome(new Person(40, Person.Gender.Unknown)), "Hi...");
    }
}
