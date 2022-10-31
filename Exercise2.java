import java.util.Scanner;
public class Exercise2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// //需求：某人有100000元，每经过一次路口，需要缴费，规则如下
		// //当现金大于50000元时，每次交5%
		// //当现金小于等于50000元时，每次交1000元
		// //计算这个人一共可以经过多少个路口
		// int rmb = 100000;//总共的金额
		// int count = 0;//可以经过路口的数量
		// while(true){
		// 	if(rmb>50000){
		// 		rmb -= (int)(rmb*0.05);
		// 		count++;
		// 	}else if(rmb>=1000){
		// 		rmb -= 1000;
		// 		count++;
		// 	}else{
		// 		break;
		// 	}
		// }
		// System.out.println("可以经过"+count+"次路口");

		// //需求：判断一个数是否为水仙花数，所谓水仙花数是指一个三位数，其各个位上数字的立方和等于其本身
		// int n = scanner.next();
		// //得到这个整数的各个位数
		// //百位：n/100
		// //十位：n%100/10
		// //个位：n%10
		// //判断即可
		// int n1 = n/100;
		// int n2 = n%100/10;
		// int n3 = n%10;
		// if(n1*n1*n1+n2*n2*n2+n3*n3*n3=n){
		// 	System.out.println("是");
		// }else{
		// 	System.out.println("不是 ");
		// }

		// //输出1-100之间不能被5整除的数，每5个一行
		// for(int i=1;i<=100;i++){
		// 	if(i % 5 != 0){
		// 		for(int j=1;j<=5;j++){
		// 			System.out.println();

		// 		}
		// 	}
		// }

		// //需求：输出小写的a-z和大写的A-Z
		// for(char c1='a';c1<='z';c1++){
		// 	System.out.print(c1+" ");
		// }

		// //需求：创建一个char类型的26个元素数组，分别放置A-Z，并且将所有元素打印出来
		// char ch[] = new ch[26];
		// for(int i=0;i<ch.length;i++){
		// 	//给数组赋值
		// 	ch[i] =(char)('A'+i);//此处需要强制转换
		// }
		// for(int i=0;i<ch.length;i++){
		// 	System.out.println(ch[i]);
		// }

		// //需求：求出一个int数组的最大值和对应的下标
		// //思路分析：先定义一个int数组
		// //假定arr[0]是最大值，maxIndex=0
		// //第一个元素依次和后面每一个元素进行比较
		// int arr[] = {1,2,4,5,6};
		// int max = arr[0];//假定第一个元素就是最大值
		// int maxIndex = 0;
		// for(int i=1;i<arr.length;i++){
		// 	if(max<arr[i]){//如果当前元素大于第一个元素
		// 		max = arr[i];//把当前值赋值给max
		// 		maxIndex = i;
		// 	}
		// }

		//需求：给定一个数组，该数组时生序，现在插入一个数据，并且保证新数组还是保持升序
		int[] arr = {1,2,4};//此处插入3这个元素
		System.out.println("插入前的数组");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("请输入要插入的数据"); 
		int addNum = scanner.nextInt();
		//数组扩容
		int[] arrNew = new int[arr.length+1];
		for(int i=0;i<arr.length;i++){//遍历旧的数组，把旧的数组元素赋值给新扩容的数组
			arrNew[i] = arr[i];
		}
		for(int j=0;j<arrNew.length-1;j++){//遍历新的数组进行数据插入
				if(addNum<arrNew[0]){//如果插入元素小于第一个元素
					//所有元素向后移一位
					 arrNew[j+1] = arrNew[j];
					 arrNew[0] = addNum;
				}else if(addNum>arrNew[arrNew.length-2]){//如果插入元素大于倒数第二个元素
					arrNew[arrNew.length-1] = addNum;
				}else if(addNum>arrNew[j] && addNum<arrNew[j+1]){
					arrNew[j+2] = arrNew[j+1];
					arrNew[j+1] = addNum;
				}
			}
		//让旧数组指向新数组
		arr = arrNew;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

		//先确定数据应该插入到哪一个位置然后再扩容


		//需求：随机生成10个1-100的整数保存到数组
		int[] arr = new int[];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
		for(int j=arr.length-1;j>=0;j-- ){//倒序打印数组
			System.out.print(arr[j]+" ");
		}













	}
}