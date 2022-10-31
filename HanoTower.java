public class HanoTower{
	public static void main(String[] args) {
		
	}
}
class T{
	//汉诺塔的实现方法
	//num表示要移动盘的个数，abc表示三个塔
	public void move(int num,char a,char b,char c){
		if(num==1){//如果只有一个盘
			System.out.println(a+"->"+c);
		}else{//如果有多个盘，可以看成两个盘，最下面和上面的所有盘
			//先移动上面所有的盘到b，借助c
			move(num-1,a,c,b);
			//把最下面的盘移动到c
			System.out.println(a+"->"+c);
			//再把b塔的所有盘移动到c，借助a塔
			move(num-1,b,a,c);

		}
	}

	//八皇后问题

}