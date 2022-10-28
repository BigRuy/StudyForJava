import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		//实现顺序查找
		String[] names  = {"蓝色妖姬","红色风暴","黑色沉默","黄色至尊"};
		Scanner scanner = new Scanner(System.in);
		String findName = scanner.next();
		int index = -1;
		for(int i=0;i<names.length;i++){
			//比较字符串
			if(findName.equals(names[i])){
				System.out.println("已经找到，下标是"+i+"");
				index = i;//如果循环进入了if语句，则改变index的值
				break;
			}
		}
		if(index == -1){
			//如果index的值没有改变，则表示遍历一遍后都没有顺序查找到值
			System.out.println("没有找到");
		}
	}
}