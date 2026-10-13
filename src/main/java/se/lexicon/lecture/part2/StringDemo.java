package se.lexicon.lecture.part2;

public class StringDemo {
    void main() {
        String greeting = "Hello";
        greeting.concat(" World"); // This creates a new string but doesn't change 'greeting'
        IO.println(greeting); // Output: Hello (The original object is untouched)

       greeting = greeting.concat(" World"); // Re-assigning the variable to the new object
       IO.println(greeting); // Output: Hello World
    }
}