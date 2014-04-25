package com.bharat.design_patterns.chain_of_responsibility;

/**
 * A person.
 */
public class Person {
    static enum Gender {
        Male,
        Female,
        Unknown
    }

    private int age;
    private Gender gender;

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Person(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return age + " " + gender;
    }
}
