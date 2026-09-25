package looploop;

public class Test8 {
    public static void main(String[] args) {
                //上半部分4行
                for (int i = 1; i <= 4; i++) {
                    //先打印第一部分：前面空格
                    for (int j = i; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    //再打印第二部分
                    for (int j = 1; j <= i; j++) {
                        if(j == 1){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    //再打印第三部分
                    for (int j = 1; j <= i - 1; j++) {
                        if(j == i - 1){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    //再打印第四部分
                    for (int j = i; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                //下半部分3行
                for (int i = 3; i >= 1; i--) {
                    //先打印第一部分：前面空格
                    for (int j = i; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    //再打印第二部分
                    for (int j = 1; j <= i; j++) {
                        if(j == 1){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    //再打印第三部分
                    for (int j = 1; j <= i - 1; j++) {
                        if(j == i - 1){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    //再打印第四部分
                    for (int j = i; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }