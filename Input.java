import java.util.Scanner;

public class Input{
	public static void main(String[] args) {
		//创建一个Scanner实例对象
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名字");
		//当程序运行至此时，会等待用户的输入
		String name = scanner.next();
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		System.out.println("请输入薪水");
		double salay = scanner.nextDouble();
		System.out.println(name);



	}
}