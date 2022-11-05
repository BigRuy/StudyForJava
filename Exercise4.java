import java.util.Scanner;
public class Exercise4{
	public static void main(String[] args) {
		//测试第一个方法
		double[] arr = {1.2,3.2,8.8};
		A a = new A();
		System.out.println(a.max(arr));

		//测试第二个方法
		String[] arr1 = {"蓝色妖姬","红色风暴","黑色沉默"};
		String s = "红色风暴";
		System.out.println(a.find(arr1,s));

		//测试第三个方法
		System.out.println(a.updatePrice(a));

		//测试第四个方法
		int[] arr3 = {1,2,3,4,5,6};
		for(int i=0;i<a.copyArr(arr3).length;i++){
			System.out.print(a.copyArr(arr3)[i]+" ");
		}

		//测试圆类
		Circle circle = new Circle(3);
		circle.showLength();
		circle.showSize();
		
		
	}
}

//编写类A
class A{
	double price = 200;
	//定义方法max，实现求某个double数组的最大值，并且返回
	public double max(double[] arr){
		//假设最大值为第一个元素
		double maxIndex = 0;
		double maxNum = arr[0];
		for(int i=1;i<arr.length;i++){
			if(maxNum<arr[i]){
				maxNum = arr[i];
				maxIndex = i;
			}
		}
		return maxNum;
	}

	//定义方法find，实现查找某个字符串数组中的元素查找，并且返回索引，如果找不到，返回-1
	public int find(String[] arr,String s){
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(s.equals(arr[i])){
				index = i;
				break;
			}
		}
		return index;
	}

	//定义方法updatePrice，实现更改某本书的价格，如果价格大于150，则更改为150，如果大于100，则更改为100，否则不变
	public double updatePrice(A a){
		if(a.price>150){
			a.price = 150;
		}else if(a.price>100){
			a.price = 100;
		}
		return a.price;
	}

	//定义方法copyArr，实现输入一个旧数组，返回一个新数组，元素和旧数组一样
	public int[] copyArr(int[] arr){
		int[] arrNew = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arrNew[i] = arr[i];
		}
		return arrNew;
	}
}
//定义一个圆类
class Circle{
	//属性圆半径
	double r;

	//方法实现显示圆周长
	public void showLength(){
		double len = 2*r*3.14;
		System.out.println("周长为"+len);
	}

	//方法实现显示圆面积
	public void showSize(){
		double s = 3.14*r*r;
		System.out.println("面积为"+s);
	}

	public void printAreas(Circle c,int times) {

	}

	//定义一个构造器
	public Circle(double r){
		this.r = r;
	}
}

//计算类
class Cale{
	double num1;
	double num2;
	//求和
	public double sum() {
		return num1+num2;
	}
	//求差
	public double minus() {
		return num1-num2;
	}
	//求乘机
	public double mul() {
		return num1*num2;
	}
	//求除法
	public Double div() {
		if(num2!=0){
			return num1/num2;
		}else{
			System.out.println("除数不能为0");
			return null;
		}
	}

	//构造器
	public Cale(double num1,double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
}

//员工类
class Employee{
	//属性
	String name;
	char gerder;
	int age;
	String job;
	double sal;

	//构造器
	public Employee(String job,double sal) {
		this.job = job;
		this.sal = sal;
	}
	public Employee(String name,int age,char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Employee(String name,int age,char gender,String job,double sal) {
		//构造器的复用
		this(name,age,gender);
		this.job = job;
		this.sal = sal;
	}
}













