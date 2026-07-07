package tuf.learnBasics.basicMaths;

import java.util.ArrayList;

public class AllDivisors {
    public static void main(String[] args) {
        int n = 8;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=n;i>0;i--){
            if(n%i==0){
                list.add(i);
            }
        }
        System.out.println(list.reversed());
    }
}
