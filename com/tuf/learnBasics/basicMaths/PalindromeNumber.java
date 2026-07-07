package tuf.learnBasics.basicMaths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 123;
        int n = number;
        int digit = 0;
        int reverse = 0;
        while(n>0){
            int temp = n%10;
            if(digit>0){
                reverse*=10;
            }
            reverse+=temp;
            n/=10;
            digit+=1;
        }
        if(number == reverse){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
