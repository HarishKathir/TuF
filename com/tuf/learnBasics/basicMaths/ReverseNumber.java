package tuf.learnBasics.basicMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123;
        int n = number;
        int r = 0;
        int digits = 0;
        while(n>0){
            int temp = n%10;
            if(digits>0){
                r=r*10;
            }
            r = r+temp;
            n=n/10;
            digits+=1;
        }
        System.out.println("Reversed number of : "+number+" is : "+r);
    }
}
