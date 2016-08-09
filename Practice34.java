package fiftypratice;

import java.util.Scanner;

/**
 * 题目：输入3个数a,b,c，按大小顺序输出。   
 * */
public class Practice34 {

	public static void main(String[] args) {
             System.out.println("请输入三个数：");
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
