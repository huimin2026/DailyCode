package test;
        import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

        public class Test6 {
            public static void main(String[] args) {
                // 模拟购买彩票，录入用户选号
                int[] userNum = buyLotteryNumber();
                // 系统随机开奖号码
                int[] sysNum = createLotteryNumber();

                System.out.println("=====您购买的彩票号码=====");
                printArr(userNum);
                System.out.println("=====开奖号码=====");
                printArr(sysNum);
            }


            // 方法1：Scanner录入，用户自己输入彩票号码【就是截图里这个方法】
            public static int[] buyLotteryNumber() {
                // 数组长度7：前区5个 + 后区2个
                int[] arr = new int[7];
                Scanner sc = new Scanner(System.in);

                // 录入前区 5个号码：1~35，不能重复
                for (int i = 0; i < 5; ) {
                    System.out.println("请输入第" + (i + 1) + "个前区彩票号码:");
                    int number = sc.nextInt();

                    // 判断范围 1~35
                    if (number < 1 || number > 35) {
                        System.out.println("当前彩票号码不在范围当中,请重新选择~");
                        continue;
                    }

                    // 判断是否重复，查找范围start=0，end=4（前区5个位置）
                    boolean isExist = contains(number, arr, 0, 4);
                    if (isExist) {
                        System.out.println("号码重复了，请重新输入！");
                        continue;
                    }

                    // 合法，存入数组，i++
                    arr[i] = number;
                    i++;
                }

                // 录入后区 2个号码：1~12，不能重复
                for (int i = 5; i < 7; ) {
                    System.out.println("请输入第" + (i - 4) + "个后区彩票号码:");
                    int number = sc.nextInt();
                    if (number < 1 || number > 12) {
                        System.out.println("号码超出后区范围(1-12)，重新输入");
                        continue;
                    }
                    // 后区查重：start=5 end=6
                    boolean isExist = contains(number, arr, 5, 6);
                    if (isExist) {
                        System.out.println("后区号码重复，请重输");
                        continue;
                    }
                    arr[i] = number;
                    i++;
                }
                sc.close();
                // 前区排序
                Arrays.sort(arr,0,5);
                Arrays.sort(arr,5,7);
                return arr;
            }


            //方法2：系统随机生成开奖号码
            public static int[] createLotteryNumber() {
                int[] arr = new int[7];
                Random r = new Random();
                //前区5个 1~35不重复
                for (int i = 0; i <5; ) {
                    int num = r.nextInt(35)+1;
                    if(!contains(num,arr,0,4)){
                        arr[i] = num;
                        i++;
                    }
                }
                //后区2个 1~12不重复
                for(int i=5;i<7;){
                    int num = r.nextInt(12)+1;
                    if(!contains(num,arr,5,6)){
                        arr[i] = num;
                        i++;
                    }
                }
                Arrays.sort(arr,0,5);
                Arrays.sort(arr,5,7);
                return arr;
            }


            // 核心方法：contains 带start、end参数，和黑马视频一模一样！
            // 在数组arr，从start索引到end索引之间查找number是否存在
            public static boolean contains(int number, int[] arr, int start, int end) {
                for (int i = start; i <= end; i++) {
                    if (arr[i] == number) {
                        return true;
                    }
                }
                return false;
            }

            //打印数组工具方法
            public static void printArr(int[] arr){
                System.out.print("前区：");
                for(int i=0;i<5;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.print("| 后区：");
                for(int i=5;i<7;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
