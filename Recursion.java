public class Recursion{
	public static void main(String[] args) {
		T t = new T();
		t.test(3);
	}
}


class T{
	public void test(int n){
		if(n>2){
			test(n-1);
		}
		System.out.println(n);
	}

	//定义一个方法求出斐波那契数列 1，1，2，3，5，8，13
	/*
	当n=1时为1
	当n=2时为1
	当n>=3时，为前两个数之和
	*/
	public int Fibonacci(int n){
		if(n==1 || n==2){
			return 1;
		}else{
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	}
}








