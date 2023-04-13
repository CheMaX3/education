package other;

public class PalindromeTask {
    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("amba"));
        System.out.println(isPalindrome("armra"));
        System.out.println(isPalindrome("armor"));
        System.out.println(isPalindrome(""));
    }

    public static boolean isPalindrome(String key) {
//TODO:доделать
        char[] array = key.toCharArray();
        if (array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length-i-1])
                return false;
            }
        return true;
    }
}

//TODO:сравнение arrayList и LinkedList, hashMap, лямбды, стримы, переопределение equals и hashCode