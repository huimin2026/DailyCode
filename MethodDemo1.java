package method;

public class MethodDemo1 {
    public static void main(String[] args) {


    /*练习：定义一个方法，求两个数的和

    定义格式：
       public static 返回值类型 方法名（参数1， 参数2....{
               方法体；
               return 返回值；
               }

     调用格式：
         方法名（参数1，参数2...);

     注意点：
          1.方法跟方法之间是平级关系，不能相互嵌套
          2.方法不会主动运行的，需要被调用才可以
          3.小括号中的参数需要一一对应（个数，类型）*/

        //调用了getsum方法求两个整数的和
        int add = getSum(10,20);
        System.out.println(add);

        System.out.println(getSum(10,20));


    }
    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }
}

