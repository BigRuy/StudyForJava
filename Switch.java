import java.util.Scanner
public class Switch{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符");
		char c1 = scanner.next().charAt(0);
		//使用switch语句来完成匹配
		switch(c1){
			case 'a':
				System.out.println("今天星期一，猴子穿新衣");
				break;
			case 'b':
				System.out.println("今天星期二，猴子当小二");
				break;
			case 'c':
				System.out.println("今天星期三，猴子去爬山");
				break;		
			default:
				System.out.println("输入字符无匹配");	
		}






	}
}