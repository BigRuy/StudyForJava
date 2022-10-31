public class Constructor{
	public static void main(String[] args) {
		//当new一个对象时，直接通过构造器指定人的名字和年龄，完成对象属性的初始化
		Person p1 = new Person("jack",20);
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}
class Person{
	//属性
	String name;
	int age;


	//构造器
	//没有返回值，也不能写void
	//构造器的方法名必须和类名是一致的
	//形参列表的规则和方法的形参列表规则是一样的
	public Person(String pName,int pAge){
		name = pName;
		age = pAge;
	}
	//无参构造器
	public Person(){
		age = 19;
	}


}