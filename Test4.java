package controllerloop;

public class Test4 {

        public static void main(String[] args) {
            for(int i = 1; i <= 10; i++){
                if(i == 5){
                    break; // i等于5，直接跳出整个循环，不再继续
                }
                System.out.println(i);
            }
        }
    }
