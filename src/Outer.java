
public class Outer {
    private String message = "Hello from the outer class.";

    class InnerClass{
        void displayMessage() {
            System.out.println("Inner says : " + message);
        }
    }
    public static void main(String[] args) {

    }
}