package operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        /*
        =     直接赋值
        +=    加后赋值
        -=    减后赋值
        *=    乘后赋值
        /=    除后赋值
        %=    取余后赋值
         */
        //+= 加后赋值
        int a = 10;
        int b = 20;
        a += b;
        System.out.println(a); //30
        System.out.println(b);//20

        //-= 减后赋值
        int c = 10;
        int d = 20;
        c -= d;
        System.out.println(c); //-10
        System.out.println(d);//20

        // *= 乘后赋值
        int e = 10;
        int f = 20;
        e *=f;
        System.out.println(e);//200
        System.out.println(f);//20

        // /= 除后赋值
        int g = 20;
        int h = 10;
        g /=h;
        System.out.println(g);//2
        System.out.println(h);//10

        // %= 取余后赋值
        int i = 20;
        int j = 10;
        i %=j;
        System.out.println(i);//0
        System.out.println(j);//10

    }
}
