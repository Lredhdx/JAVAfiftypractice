package fiftypratice;
/**
 * ��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ����
 * ���λ���������͵��ڸ�������								
 * 
 * 
 */
public class Practice03 {

	public static void main(String[] args) {
		System.out.println("��λ��ˮ�ɻ����У�");
		int m,n,t,j;
		for(int i=100;i<=999;i++){
			m=i%10;//�õ���λ����
			j=i/10;
			n=j%10;//�õ�ʮλ����
			t=i/100;//�õ���λ����
			if(i==(m*m*m+n*n*n+t*t*t)){
				System.out.print(i+" ");
			}else{
				continue;
			}
		}

	}

}
