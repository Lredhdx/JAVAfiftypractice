package fiftypratice;
/**
 * ��Ŀ����һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...
 * ���������е�ǰ20��֮�͡�
 * 
 * */
public class Practice20 {

	public static void main(String[] args) {
            double sum=0;
            double f,m=2,n=1,t;
            for(int i=1;i<=20;i++){
            	f=m/n;
            	sum=sum+f;
            	t=m;
            	m=m+n;
            	n=t;
            }
            System.out.println("������е�ǰ20��֮��Ϊ��"+sum);
	}

}
