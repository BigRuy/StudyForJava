public class MiGong{
	public static void main(String[] args) {
		//思路：先用二维数组创建迷宫
		int[][] map = new int[8][7];
		//思路：规定map数组元素的值，0表示可以走，1表示障碍物
		//将最上一行和最小一行设置为1
		for(int i=0；i<7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//将最左一列和最右一列设置为1
		for(int i=0;i<8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//单独设置障碍物
		map[3][1] = 1;
		map[3][2] = 1;

		//输出当前的迷宫
		for(int i=0;i<map.length;i++){//遍历行
			for(int j=0;j<map[i].length;j++){//遍历列
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}




class T{
	//使用递归回溯的思想来解决老鼠出迷宫
	/*
		方法用来找出走出迷宫的路径
		找到就会返回true，找不到就会返回false
		map：表示迷宫
		i：表示行号
		j：表示列号
		初始化位置为（1，1），只有当为i=6和j=5表示走出迷宫
		0表示可以走，1表示障碍物，2表示可以走，3表示走过但是走不通
		当map[6][5]=2时表示找到通路，否则继续找
		确定老鼠找路的策略为：下-右-上-左
	*/
	public boolean findWay(int[][] map,int i,int j){

	}
}







