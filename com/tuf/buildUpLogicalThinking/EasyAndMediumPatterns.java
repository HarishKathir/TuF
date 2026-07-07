package tuf.buildUpLogicalThinking;
public class EasyAndMediumPatterns {
    public static void main(String[] args) {
        rectangle();
        rightAngleTriangle();
        rightAngleNumberTriangle();
        rightAngleSameNumberTriangle();
        invertedRightAngleTraingle();
        invertedRightAngleNumberTraingle();
    }

    private static void invertedRightAngleNumberTraingle() {
        for(int i = 5;i>0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void invertedRightAngleTraingle() {
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    private static void rightAngleSameNumberTriangle() {
        for(int i = 1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }

    private static void rightAngleNumberTriangle() {
        for(int i = 1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    private static void rightAngleTriangle() {
        for(int i = 0;i<5;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void rectangle(){

    }
}
