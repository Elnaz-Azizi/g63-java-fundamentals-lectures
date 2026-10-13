package se.lexicon.lecture.part2;

public class StringMethodsDemo {
    void main() {
        String message = "Java Programming is Fun!";

        // 1. indexOf() Examples (Overloaded)
        IO.println("-- indexOf() --");
        int firstP = message.indexOf('P');          // 5 (Finds character 'P')
        int firstGram = message.indexOf("gram");    // 8 (Finds substring "gram")
        int secondA = message.indexOf('a', 2);      // 3 (Finds 'a' starting from index 2)
        int missing = message.indexOf("Python");    // -1 (Not found)

        IO.println("First 'P': " + firstP);
        IO.println("First 'gram': " + firstGram);
        IO.println("Second 'a': " + secondA);
        IO.println("Missing: " + missing);

        // 2. substring() Examples (Overloaded)
        IO.println("\n-- substring() --");
        String language = message.substring(0, 4);      // "Java" (0 to 3, 4 is exclusive)
        String topic = message.substring(5, 16);        // "Programming" (5 to 15, 16 is exclusive)
        String remainder = message.substring(17);       // "is Fun!" (17 to the very end)

        IO.println("Language: " + language);
        IO.println("Topic: " + topic);
        IO.println("Remainder: " + remainder);



        // 3. Traditional Multi-line String
        String oldWay = "This is the old way.\n" +
                "It requires concatenation\n" +
                "and manual newline characters.";

        // 4. Modern Text Block
        String newWay = """
                This is a Text Block.
                It preserves the line breaks
                and makes the code look exactly like the output.
                """;

        IO.println(oldWay);
        IO.println("---");
        IO.println(newWay);


    }

}
