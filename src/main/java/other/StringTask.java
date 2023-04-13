package other;

public class StringTask {
    static void changeString(String someString) {
        someString = "new String";
    }

    public static void main(String[] args) {
        String string = "old String";
        System.out.println(string);
        changeString(string);
        System.out.println(string);
    }
}
