package fiftypratice;

import java.util.Scanner;

/**
 *求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 *例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。								

 * */
public class Practice08 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("请输入数字：");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("请输入相加次数：");
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
