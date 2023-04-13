package other_tasks;

public class Task3 {
    public static void main(String[] args) {
        String s = "123";
        System.out.println(s);
        s = s + "22";
        System.out.println(s);

//        Integer highI = 15;
//        System.out.println(changeInteger(highI));

        int lowI = 10;
        System.out.println(lowI);
        lowI = lowI + 5;
        System.out.println(lowI);
        System.out.println(changeInt(lowI));
    }

    private static String changeString(String str) {
        str = str + "22";
        return str;
    }

    private static Integer changeInteger(Integer i) {
        i = 22;
        return i;
    }

    private static int changeInt(int i) {
        i = 5;
        return i;
    }
}
