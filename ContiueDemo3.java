package controllerloop;

public class ContiueDemo3 {
    public static void main(String[] args) {
       for(int i= 1;i<=100;i++){
           if(i%4==0||i/10==4||i%10==4){
               System.out.println("过");
               continue;
           }
           System.out.println(i);
       }
    }
}
