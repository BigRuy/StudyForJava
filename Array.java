import java.util.Scanner;
public class Array{
	public static void main(String[] args) {
		//循环输入五个成绩，保存到double数组里
		//创建一个数组
		double score[] = new double[5];	
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<score.length;i++){
			System.out.println("请输入第"+(i+1)+"个成绩成绩");
			score[i] = scanner.nextDouble();
		}
		for(int i=0;i<score.length;i++){
			System.out.println(score[i]);
		}

		//数组拷贝
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			arr2[i] = arr1[i];
		}

		//数组的反转
		//第一个和最后一个进行交换
		int arr[] = {1,2,3,4,5,6};
		for(int i=0;i<arr.length/2;i++){
			int temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i];
			arr[i] = temp;
		}

		//数组的静态添加扩容
		//思路分析
		int[] arr = {1,2,3};
		int[] arrNew = new int[arr.length+1];
		for(int i=0;i<arr.length;i++){
			arrNew[i] = arr[i];
		}
		arrNew[arrNew.length-1] = 4;//把4赋给数组最后一个元素
		arr = arrNew;//让arr指向新数组arrNew

		//用户决定是否需要继续扩容
		do{
			//定义一个新的数组
			int[] arrNew = new int[arr.length+1];//新的数组为旧数组长度加1
			//遍历旧数组，将旧数组的元素值都拷贝到新数组中
			for(int i=0;i<arr.length;i++){
				arrNew[i] = arr[i];
			}
			System.out.println("请输入需要添加的元素");
			int addNum = scanner.next();
			arrNew[arrNew.length-1] = addNum;//把新添加的元素赋给数组最后一个元素
			arr = arrNew;//让arr指向新数组arrNew
			//询问用户是否继续添加
			System.out.println("是否需要继续添加");
			char key = scanner.next().chatAt(0);
			if(key == 'n'){//如果输入n就结束循环
				break;
			}
		}while(true);

		//用户决定是否缩减数组
		int[] arr = {1,2,3,4,5,6};
		do{
			//打印缩减前的数组
			System.out.println("缩减前的数组");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			//询问用户是否需要缩减数组
			System.out.println("是否需要缩减数组");
			//创建字符变量key来接收用户的输入
			char key = scanner.next().charAt(0);
			if(key=='y'){//如果用户输入‘y’，则缩减
				int[] arrNew = new int[arr.length-1];//定义一个新的数组，数组长度为原数组长度减1
				for(int i=0;i<arr.length-1;i++){//遍历到旧数组倒数第二个元素
					arrNew[i] = arr[i];//将元素拷贝给新数组
				}
				arr = arrNew;//让旧数组指向新数组
				//打印缩减后的数组
				System.out.println("缩减后的数组");
				for(int i=0;i<arr.length;i++){
					System.out.print(arr[i]+" ");
				}
			}else{
				break;
			}
			if(arr.length==1){
				System.out.println("只剩一个元素不可以再缩减");
				break;
			}
		}while(true);

		//二维数组
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				 System.out.println(arr[i][j]);  
			}
			System.out.println();
		}

		/*
		*二维数组的动态初始化
		*创建一个二维数组，有三个一维数组，每个一维数组的元素是不一样的
		*1
		*2 2
		*3 3 3
		*/
		//创建一个二维数组，只确定了二维数组中一维数组的个数，但是每个一维数组还没有开空间
		int[][] arr = new int[3][];
		for(int i=0;i<arr.length;i++){//遍历每一个一维数组
			//给每一个一维数组开空间
			//如果没有给一维数组开辟空间，则arr[i]就是null
			//第一个一维数组开辟了1个空间，第二个一维数组开辟了2个空间，第三个一维数组开辟了3个空间
			arr[i] = new int[i+1];
			for(int j=0;j<arr[i].length;j++){//遍历一维数组，并且给每一个元素赋值
				arr[i][j] = i+1;
			}
		}

		//需求：使用二维数组打印一个10行的杨辉三角
		/*
			1
			1 1
			1 2 1
			1 3 3 1
			1 4 6 4 1
			。。。。。
		*/
		int[][] arr = new int[10][];
		for(int i=0;i<arr.length;i++){//遍历数组每一个元素
			arr[i] = new arr[i+1];//给每一个一维数组开辟空间
			for(int j=0;j<arr[i].length;j++){//给每个一维数组赋值
				//每一行第一个元素和最后一个元素都是1
				if(j==0 || j==arr[i].length-1){
					arr[i][j] = 1;
				}else{//中间元素为上一行同一列的元素加上一行同一列的元素的前一个的和
					arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
				}
			}
		}







	}
}