import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is my application built with Gradle!");
        AnotherClass anotherClass = new AnotherClass();
        String myString = "          Deepika            ";
        System.out.println("Trimmed string using StringUtils: " + StringUtils.trim(myString));
    }
}
