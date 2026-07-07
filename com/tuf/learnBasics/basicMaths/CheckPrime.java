package tuf.learnBasics.basicMaths;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 5;
        int prime = 1;
        for(int i = 1;i<=n;i++){
            if(n%i==0 && (i!=1 && i != n)){
                prime=-1;
                break;
            }
        }
        if(prime==1){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime");
        }
    }
}
