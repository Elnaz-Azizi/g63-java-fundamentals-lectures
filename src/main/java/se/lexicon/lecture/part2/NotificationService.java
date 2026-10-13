package se.lexicon.lecture.part2;

public class NotificationService {
    // Send a simple notification
    public static void send(String message) {
        IO.println("Sending Notification: " + message);
    }

    // Overloaded: Send a notification to a specific email
    public static void send(String message, String email) {
        IO.println("Sending Email to " + email + ": " + message);
    }

    // Overloaded: Send a notification with a priority level
    public static void send(String message, int priority) {
        IO.println("Priority [" + priority + "] Notification: " + message);
    }

    void main() {
        send("Hello World");
        send("Hello World", "john.doe@example.com");
        send("Hello World", 1);
    }
}