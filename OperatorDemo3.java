package operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        //1.定义变量记录秒数
        int seconds = 3661;

        //2.获取小时数
        int hours = seconds / 3600;

        //3.获取分钟数
        int minutes = (seconds % 3600) / 60;

        //4.获取秒钟数
        int secs = seconds % 60;

        //5.输出结果
        System.out.println(seconds + "秒 = " + hours + "小时" + minutes + "分钟" + secs + "秒");
    }
}
