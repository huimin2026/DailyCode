package loopdowhile;

public class DowhileDemo1 {
    public static void main(String[] args) {

    /*
    利用do...while循环，输出五行“hello,world!”
    特点：至少执行一次，先执行后判断
     */
    int i = 1;
    do{
        System.out.println("hello,world!");
        i++;
    }while(i<=5);

    }
}
