public class VarParams{
	public static void main(String[] args) {
		Method m = new Method();
		m.sum(1,2,3);
	}
}
class Method{
	//可变参数的运用
	//int...表示接收的是可变参数，类型是int，可以接收多个int
	//使用可变参数时，可以当做数组来使用
	//遍历nums求和即可
	public int sum(int... nums){
		System.out.println(nums.length);
		for(int i=0;i<nums.length;i++){
			int res += nums[i];	
		}
		return res;
	}
}