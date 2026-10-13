package se.lexicon.lecture.part2;

public class FinalStaticDemo {
    void main() {
        IO.println("App: " + AppConfig.APP_NAME);
        IO.println("Tax: " + AppConfig.TAX_RATE * 100 + "%");
    }
}