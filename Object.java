public class Object{
	public static void main(String[] args) {
		//首先实例化一个猫对象
		Cat cat1 = new Cat();
		cat1.name = "jack";
		cat1.age  = 4;
		cat1.color = "green";
		//实例化第二个猫对象
		Cat cat2 = new Cat();
		cat2.name = "rose";
		cat2.age  = 5;
		cat2.color = "black";

		//实例化工具类
		MyTools mytools = new MyTools();
		mytools.printArr(map);

		
	}
}
//使用面向对象的方式来解决猫的问题
//首先定义一个猫类
class Cat{
	//属性
	String name;
	int age;
	String color;
	//定义成员方法
	//public表示方法是公开的
	//void表示的是方法没有返回值
	//speak()表示这个方法的名字,（）表示的是形参列表
	public void speak(){
		System.out.println("我是一个好猫");
	}

	//添加一个方法，可以接收一个数，计算1+2+。。+n的值
	public void cal(int n){
		int res = 0;
		for(int i=1;i<n;i++){
			res += i;
		}
		System.out.println(res);
	}

	//添加一个方法，可以计算两个数的和
	public int getSum(int n1,int n2){
		int res = n1+n2;
		return res;
	}
}
class Person{
	String name;
	int age;
}

//定义一个工具类
class MyTools{
	//定义一个方法用于遍历二维数组
	public void printArr(int[][] map){
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	//定义一个方法可以返回两个值
	public int[] getSumAndSub(int n1,int n2){
		int[] resArr = new int[2];//创建一个数组
		resArr[0] = n1+n2;
		resArr[1] = n1-n2;
		return resArr;
	} 
	//编写一个方法可以克隆对象
	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}


