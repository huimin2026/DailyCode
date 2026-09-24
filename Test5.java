package looploop;

public class Test5 {
    public static void main(String[] args){
        for(int i= 1;i<=3;i++){
            //先打印第一部分，右上角红色部分，最后会把这一部分改变空格
            for(int j=1;j <=i;j++){
                System.out.print(" ");
            }
            //再打印第二部分，中间绿色部分
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //再打印第三部分，中间蓝色部分
            for(int j = 1;j<=3;j++){
                System.out.print("*");
            }
            //再打印第四部分，右边青色部分
            for(int j=i;j<=2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
