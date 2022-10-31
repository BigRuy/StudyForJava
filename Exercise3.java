public class Exercise3{
	public static void main(String[] args) {
		Method m = new Method();
		double[] d = {90,90,90};

		System.out.println(m.showScore("wly",d));
	}
}
class Method{
	//实现返回姓名和两门课成绩总分
	//返回姓名和三门课成绩总分
	//返回姓名和五门课成绩总分，封装成一个可变参数的方法

	public String showScore(String str,double... score){
		double total = 0;
		for(int i=0;i<score.length;i++){
			total += score[i];
		}
		return str+"有"+score.length+"门课的成绩总分="+total;
	}



}