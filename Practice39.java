package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ����дһ��������
 * ����nΪż��ʱ�����ú�����1/2+1/4+...+1/n,
 * ������nΪ����ʱ,���ú���1/1+1/3+...+1/n(����ָ�뺯��)   
 * */
public class Practice39 {

	public static void main(String[] args) {
          System.out.println("������һ��������");
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          if(n%2==0){
        	  sum1(n);
          }else {
        	  sum2(n);
          }
          if(s!=null){
        	  s.close();
          }
	}

	public  static void sum1(int n) {
           	double sum=0;
           	for(double i=2;i<=n;i=i+2){
           		sum+=1/i;
           		//i=i+2;
           	}
           	System.out.println("1/2+1/4+...+1/n="+sum);
	}

	public  static void sum2(int n) {
		double sum=0;
       	for(double i=1;i<=n;i=i+2){
       		sum+=1/i;
       		//i=i+2;
       	}
       	System.out.println("1/1+1/3+...+1/n="+sum);
		
	}

}
