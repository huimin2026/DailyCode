package looploop;

public class Test7 {
    public static void main(String[] args) {
        /*
                      *
                     ***
                    *****
                   *******
                  *********
                    *****
                     ***
                      *
         */
                // 上半部分 4行 i=1~4
                for (int i = 1; i <= 4; i++) {
                    // 先打印第一部分：前面空格
                    for (int j = i; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    // 再打印第二部分
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // 再打印第三部分
                    for (int j = 1; j <= i - 1; j++) {
                        System.out.print("*");
                    }
                    // 再打印第四部分
                    for (int j = i; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                // 下半部分 3行 i=3~1
                for (int i = 3; i >= 1; i--) {
                    // 先打印第一部分：前面空格
                    for (int j = i; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    // 再打印第二部分
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // 再打印第三部分
                    for (int j = 1; j <= i - 1; j++) {
                        System.out.print("*");
                    }
                    // 再打印第四部分
                    for (int j = i; j <= 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
