//1-10之间的整数相加，得到累加值大于20的当前数字
public class Addtion20 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i =1;
		
		for(;i<=10;i++) {
			sum+=i;
			if(sum>20) {
				break;
			}
		}
		System.out.println("当前数为"+i);
	}
}
