import java.util.Scanner
public class Exercise2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//需求：某人有100000元，每经过一次路口，需要缴费，规则如下
		//当现金大于50000元时，每次交5%
		//当现金小于等于50000元时，每次交1000元
		//计算这个人一共可以经过多少个路口
		int rmb = 100000;//总共的金额
		int count = 0;//可以经过路口的数量
		while(true){
			if(rmb>50000){
				rmb -= (int)(rmb*0.05);
				count++;
			}else if(rmb>=1000){
				rmb -= 1000;
				count++;
			}else{
				break;
			}
		}
		System.out.println("可以经过"+count+"次路口");

		//需求：判断一个数是否为水仙花数，所谓水仙花数是指一个三位数，其各个位上数字的立方和等于其本身
		int n = scanner.next();
		//得到这个整数的各个位数
		//百位：n/100
		//十位：n%100/10
		//个位：n%10
		//判断即可
		int n1 = n/100;
		int n2 = n%100/10;
		int n3 = n%10;
		if(n1*n1*n1+n2*n2*n2+n3*n3*n3=n){
			System.out.println("是");
		}else{
			System.out.println("不是 ");
		}

		//输出1-100之间不能被5整除的数，每5个一行
		for(int i=1;i<=100;i++){
			if(i % 5 != 0){
				for(int j=1;j<=5;j++){
					System.out.println();

				}
			}
		}

		//需求：输出小写的a-z和大写的A-Z
		for(char c1='a';c1<='z';c1++){
			System.out.print(c1+" ");
		}









	}
}