package fiftypratice;

import java.util.Scanner;

/**
 *��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
 *����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�								

 * */
public class Practice08 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("���������֣�");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("��������Ӵ�����");
		b=s.nextInt();
		if(s!=null){
			s.close();
		}
		int sum=0;
		for(int i=1;i<=b;i++){
			sum=sum+a;
			a=10*a+a;
		}
		System.out.println(sum);

	}

}
