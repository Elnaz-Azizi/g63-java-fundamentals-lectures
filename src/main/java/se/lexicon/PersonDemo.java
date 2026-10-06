package se.lexicon;

// 2. Use the Blueprint to create Objects
public class PersonDemo {
    void main() {
        // Create person 1 — no more firstName1, lastName1, age1
        Person p1 = new Person();
        p1.firstName = "Erik";
        p1.lastName = "Svensson";
        p1.age = 25;

        // Create person 2
        Person p2 = new Person();
        p2.firstName = "Sofia";
        p2.lastName = "Karlsson";
        p2.age = 30;

        // Create person 3
        Person p3 = new Person();
        p3.firstName = "Lena";
        p3.lastName = "Andersson";
        p3.age = 22;

        // Call the method on each object
        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}