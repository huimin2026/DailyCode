package looploop;

public class Test4 {
    public static void main(String[] args){

                // 4行，每行5个*
                for(int i = 1; i <= 4; i++){
                    // 打印空格：第1行3个空格，第2行2个，第3行1个，第4行0个
                    for(int j = 1; j <= 4-i; j++){
                        System.out.print(" ");
                    }
                    // 打印5个星号
                    for(int j = 1; j <=5; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
