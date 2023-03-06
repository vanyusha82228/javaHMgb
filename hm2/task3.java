package hm2;

public class task3 {
    public static void main(String[] args) {
        // Можно и по другому, так мне проще)
        String input1 = "привет";
        String input2 = "абоба";
        System.out.println(input1 + " " + input2);
        System.out.println(isPalindrome(input1) + " " + isPalindrome(input2));
    }

    public static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) return false;
        }
        return true;
    }
}
