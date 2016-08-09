package fiftypratice;

import java.util.Scanner;

/**
 * 题目：编写一个函数，
 * 输入n为偶数时，调用函数求1/2+1/4+...+1/n,
 * 当输入n为奇数时,调用函数1/1+1/3+...+1/n(利用指针函数)   
 * */
public class Practice39 {

	public static void main(String[] args) {
          System.out.println("请输入一个整数：");
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
