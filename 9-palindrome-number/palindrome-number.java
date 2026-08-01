public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x != 0 && x % 10 == 0) return false;

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }
        return (x == reversedHalf) || (x == reversedHalf / 10);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1 + " is palindrome? " + sol.isPalindrome(num1)); 

        int num2 = sc.nextInt();
        System.out.println(num2 + " is palindrome? " + sol.isPalindrome(num2));  

        int num3 = sc.nextInt();
        System.out.println(num3 + " is palindrome? " + sol.isPalindrome(num3));  
    }
}
