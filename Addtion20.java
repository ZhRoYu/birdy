//1-10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ����
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
		System.out.println("��ǰ��Ϊ"+i);
	}
}
