package looploop;

public class Test4 {
    public static void main(String[] args) {

                /*打印平行四边形
                ******
               ******
              ******
              限定：每次只能输出一个*
              */

                //外循环，3行
                for(int i = 1; i <= 3; i++){
                    //【第一步 打印前置空格】
                    for(int j = 1; j <= 3 - i; j++){
                        System.out.print(" ");
                    }
                    //【第二步 打印6个星】
                    for(int j = 1; j <= 6; j++){
                        System.out.print("*");
                    }
                    //【一行全部打完再换行！】
                    System.out.println();
                }
            }
        }
