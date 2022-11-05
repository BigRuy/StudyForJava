public class ArrayTest {
    public static void main(String[] args) {
        //创建一个对象
        Mytools mytools = new Mytools();
        //创建一个数组
        int[] arr = {1, 34, 5, 6, 21, 2};
        mytools.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//创建一个类Mytools，编写一个方法实现对int数组进行冒泡排序
class Mytools {
    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {//外层循环次数
            for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环次数
                if (arr[j] > arr[j + 1]) {//比较前后两个数，如果前面的大于后面的，就交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
