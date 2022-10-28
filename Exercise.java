public class Exercise{
	public static void main(String[] args) {
		//需求：假如还有59天放假，问合多少个星期和多少天？
		int days = 59;
		int weeks = days / 7;
		int leftdays = days % 7;
		System.out.println(days + "天和" + weeks +"星期零"+leftdays+"天");
		 
		//需求：定义一个变量保存华氏温度，求出华氏温度对应的摄氏温度
		//考虑公式与java语言的特性 	
		double huaShi = 234.6;
		double sheShi = 5.0 / 9 *(huaShi - 100);

		//需求：声明两个double变量并且赋值，判断第一个数大于10.0，并且第二个数小于20.0，打印两数之后
		double d1 = 35.4;
		double d2 = 10.3;
		if(d1>10.0 && d2<20.0){
			System.out.println("两数之和为："+ (d1+d2));
		}

		//需求：定义两个变量int，判断两个数的和是否能够被3整除又可以被5整除，答应提示信息
		int n1;
		int n2;
		int sum = n1+n2;
		if(sum%3==0 && sum%5==0){
			System.out.println("可以整除");
		}else{
			System.out.println("不可以整除");
		}

		//需求：判断一个年份是否为闰年（能被4整除，但不能被100整除，或者可以被400整除）
		int year;
		if((year%4==0 && year%100!=0) || year%400==0){
			System.out.println("是闰年");
		}else {
			System.out.println("不是闰年");
		}
		//需求：根据用户指定的月份，打印该月份所属的季节（345是春季，678是夏季，91011是秋季，1212是冬季）
		Scanner scanner = new Scanner();
		System.out.println("请输入一个月份");
		int month = scanner.next();
		switch(month){//此处利用switch语句的穿透原理
			case:3
			case:4
			case:5
				System.out.println("这是春季");
				break;
			case:6
			case:7
			case:8
				System.out.println("这是夏季");
				break;
			case:9
			case:10
			case:11
				System.out.println("这是秋季");
				break;
			case:12
			case:1
			case:2
				System.out.println("这是冬季");
				break;	
		}
		//需求：打印1-100内所有是9的倍数的整数，统计个数以及总和
		//思路分析：化繁为简，先死后活
		//后期优化可以将范围以及倍数都可以定义为新的变量，更加灵活
		int count = 0;
		int sum = 0;
		for(int i=0;i<=100;i++){
			if(i%9==0){
				count++;
				sum+=i;
			}
		}
		//需求：打印1-100内可以被3整除的数（使用while）
		int i = 1;
		while(i<=100){
			if(i%3==0){
				System.out.println(i);
			}
			i++;
		}

		//需求：统计三个班学生，每个班有5个学生，求出各个班级的平均分和所有班级的平均分
		//统计三个班的及格人数
		//思路1：先统计一个班的情况
		double score;//一个学生输入的成绩
		double sum = 0;//一个班级的总分
		double avg;//一个班级的平均分
		double sumMax = 0;//所有班级的成绩总和
		int passNum = 0;//及格学生的人数
		for(int i=1;i<=3;i++){
			for(int j = 1;j<=5;j++){
				System.out.println("请输入第"+i+"班第"+j+"个同学的成绩");
				score = scanner.nextDouble();//输入成绩
				if(score>=60){
					//如果输入分数满足条件，则及格人数加一
					passNum++;
				}
				sum += score;//统计一个班所有学生的成绩总和
			}
			avg = sum/5;//计算一个班的平均成绩
			sumMax += sum;//统计所有班级所有学生的成绩总和
			System.out.println("第"+i+"个班的的平均分为："+avg);
		}
		System.out.println("所有班级的平均分为："+(sumMax/15));

		//需求：打印九九乘法表
		for(int i=1;i<=9;i++){//行数
			for(int j=1;j<=i;j++){//列数
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();//每打印一行就换行一次
		}

		//需求：打印空心金字塔
		/*
			     *
			   *   *
			  *     *
			 *********
		*/
		//思路:先打印一个矩形，然后打印半个金字塔
		int level = 10;
		for(int i =1;i<=level;i++){//先打印金字塔层数
			//每一行前打印空格
			//每一行打印的空格数量为总层数减当前层数
			for(int k=1;k<=level-i;k++){
				System.out.print(" ");
			}
			//每一行打印*号
			//每一行打印*号的数量为2倍的层数减1
			for(int j=1;j<=2*i-1;j++){
				//如果是一行的第一个位置或者是最后一个位置或者是最后一行就打印*号
				if(j==1 || j==2*i-1 || i==level){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();//每一行打印完后都换行
		}
		
		//需求：实现一个登陆验证，一共有三次机会
		int chance = 3;
		String name = "";
		String password = "";
		for(int i=1;i<=3;i++){
			System.out.println("请输入名字");
			name = scanner.nextString();
			System.out.println("请输入密码");
			password = scanner.nextString();
			//比较输入的名字和密码是否正确
			if("wly".equals(name) && "123".equals(password)){
				System.out.println("登陆成功");
				break;
			}else{
				chance--;
				System.out.println("错误!还剩"+chance+"次机会");
			}
			if(chance==0){
				System.out.println("机会已用完");
				break;
			}
		}
	}
}





