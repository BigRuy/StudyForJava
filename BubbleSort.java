public class BubbleSort{
	public static void main(String[] args) {
		//实现冒泡排序
		//分析冒泡排序思路
		//例如数组{5,1,2,4,3}
		//第一轮排序需要把最大的元素放在最后的位置
		//第二乱排序需要把第二大的元素放在倒数第二个位置
		//每一次两个元素进行比较
		int[] arr = {10,1,2,3,4,5};
		int temp;//定义一个交换的中间变量
		boolean tag = false;
		for(int i=0;i<arr.length-1;i++){//需要进行4轮比较
			for(int j=0;j<arr.length-1-i;j++){//每一轮中的比较次数都会减1
				//如果是从大到小排序就是arr[j+1]>arr[j]
				//如果是从小到大排序就是arr[j]>arr[j+1]
				if(arr[j]>arr[j+1]){//前者大于后者则进行交换
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					tag = true;
				}
			}
			if(tag == false){
				System.out.println("代码已经是有序的");
				break;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}





	
	}
}