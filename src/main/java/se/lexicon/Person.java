package se.lexicon;

// 1. Define the Blueprint (Class)
class Person {
    // Fields (State) — replaces firstName1/firstName2/firstName3...
    String firstName;
    String lastName;
    int    age;

    // Method (Behavior)
    void introduce() {
        IO.println("Hi, I am " + firstName + " " + lastName + ", age " + age);
    }
}