package fiftypratice;
/**
 * 
 * ��Ŀ��809*??=800*??+9*??+1   
����??�������λ��,8*??�Ľ��Ϊ��λ����
9*??�Ľ��Ϊ3λ������??�������λ������809*??��Ľ���� 
  ��Ŀ���ˣ�809x=800x+9x+1 �����ķ����޽⡣ȥ���Ǹ�1���н��ˡ�
 * */
public class Practice42 {

	public static void main(String[] args) {
		int a=809,b,i;
		for(i=10;i<13;i++)
		{b=i*a ;
		if(8*i<100&&9*i>=100)
		System.out.println ("809*"+i+"="+"800*"+i+"+"+"9*"+i+"="+b);}// TODO Auto-generated method stub

	}

}
