package fiftypratice;

import java.util.Scanner;

/**
 * 题目：一个偶数总能表示为两个素数之和。   
//由于用除sqrt(n)的方法求出的素数不包括2和3，
//因此在判断是否是素数程序中人为添加了一个3。

 * */
public class Practice44 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        do{
        	System.out.print("请输入一个大于6的偶数：");
        	n=s.nextInt();
        }while(n<6||n%2!=0);
        for(int i=3;i<=n/2;i+=2){
        	if(fun(i)&&fun(n-i)){
        		System.out.println(n+"="+i+"+"+(n-i));
        	}
        }
	}
        static boolean fun(int a){
        	boolean flag=false;
        	if(a==3){
        		flag=true;
        	    return flag;
        	}
        	for(int i=2;i<=Math.sqrt(a);i++){
        		if(a%i==0){
        			flag=false;
        		    break;
        		}else {
                  return true;
        	}
        }
        	return flag;
        
	}

}
