package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ������3����a,b,c������С˳�������   
 * */
public class Practice34 {

	public static void main(String[] args) {
             System.out.println("��������������");
             int a,b,c;
             Scanner s=new Scanner(System.in);
             a=s.nextInt();
             b=s.nextInt();
             c=s.nextInt();
             if(s!=null){
            	 s.close();
             }
             select(a,b,c);
             
	}
	public static void select(int a,int b,int c){
		  if(a>b){
			  int t=b;
			  b=a;
			  a=t;
		  } if(a>c){
			  int t=c;
			  c=a;
			  a=t;
		  } if(b>c){
			  int t=c;
			  c=b;
			  b=t;
		  }
		  System.out.println("a="+a+" "+"b="+b+" "+"c="+c);
	}

}
