package se.lexicon.lecture.part2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    void main() {
        // 1. Current Date & Time
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        IO.println("Today: " + today); // 2024-02-26
        IO.println("Current Time: " + now); // 15:57:45.123

        // 2. Creating Specific Dates (of)
        LocalDate specificDate = LocalDate.of(2023, 12, 25);
        LocalDateTime appointment = LocalDateTime.of(2024, 6, 1, 10, 30);

        // 3. Manipulation (Plus/Minus)
        LocalDate tomorrow = today.plusDays(1);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate lastYear = today.minusYears(1);

        IO.println("Tomorrow: " + tomorrow);
        IO.println("Next Month: " + nextMonth);
        IO.println("Last Year: " + lastYear);

        // 4. Parsing from String
        LocalDate parsedDate = LocalDate.parse("2025-01-01");

        // 5. Custom Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, dd MMMM yyyy HH:mm"); // MM means month (With capital letters)
        String formattedTime = currentDateTime.format(formatter);

        IO.println("Formatted Date: " + formattedTime);
        // Example: Monday, 26 February 2024 15:57


        // 6. Instant
        // Current timestamp in UTC
        Instant instantNow = Instant.now();
        IO.println("Current Instant: " + instantNow);
        // Example: 2024-02-26T15:57:45.123Z (The 'Z' stands for Zulu/UTC)

        // 7. Time Zones
        // Get time in a specific zone
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        IO.println("New York Time: " + newYorkTime);

        // Get your local system's default zone
        ZoneId myZone = ZoneId.systemDefault();
        IO.println("My Zone: " + myZone);
    }
}