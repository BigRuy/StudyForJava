public class This{
	public static void main(String[] args) {
		Person p1 = new Person("jack",8);
		Person p2 = new Person("jacl",8);
		p1.compareTo(p2); 

	}
}

class Person{
	String name;
	int age;



	//判断和另外一个人是否相等
	public boolean compareTo(Person p){
		return this.name.equals(p.name) && this.age = p.age;
	}
	//构造器
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}



}