package tuf.learnBasics.basicMaths;

public class GCD {
    public static void main(String[] args) {
        int n1=25;
        int n2=12;
        int gcd = 0;
        for(int i=1;i<n1&&i<n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD of "+n1+" and "+n2+" is "+gcd);
    }
}
