public class Exercise2{
	public static void main(String[] args) {
		//需求：某人有100000元，每经过一次路口，需要缴费，规则如下
		//当现金大于50000元时，每次交5%
		//当现金小于等于50000元时，每次交1000元
		//计算这个人一共可以经过多少个路口
		int rmb = 100000;//总共的金额
		int count = 0;//可以经过路口的数量
		while(true){
			if(rmb>50000){
				rmb -= (int)(rmb*0.05);
				count++;
			}else if(rmb<=50000){
				rmb -= 1000;
				count++;
			}
			if(rmb==0){
				break;
			}
		}
		System.out.println("可以经过"+count+"次路口");






	}
}