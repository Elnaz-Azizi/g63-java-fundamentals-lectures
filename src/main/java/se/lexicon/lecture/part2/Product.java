package se.lexicon.lecture.part2;

public class Product {
    String name; // Class-level field

    void setName(String name) {     // Parameter 'name' shadows the field 'name'
        // name = name;             // BUG: assigns the parameter to itself — field is hidden!
        this.name = name;           // Use 'this' to reach through the shadow to the field
    }
}