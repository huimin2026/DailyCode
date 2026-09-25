package looploop;

public class Test6 {
    public static void main(String[] args) {

    /*
    打印梯形
      ##***
      #*****
      *******
    */
        for(int i=1;i<=3;i++){
           //先打印第一部分
            for(int j =i;j<=2;j++){
                System.out.print(" ");
            }
            //再打印第二部分
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //再打印第三部分
            for(int j = 1;j<=2;j++){
                System.out.print("*");
            }
            //再打印第四部分
            for(int j = 1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
