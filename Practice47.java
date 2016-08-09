package fiftypratice;

import java.util.Scanner;

/**
 * 题目：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。
 * */
public class Practice47 {

	public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
           System.out.println("请输入7个（1-50）的整数：");
           for(int i=0;i<7;i++){
        	   int num=s.nextInt();
        	   for(int j=0;j<num;j++){
        		   System.out.print("*");
        	   }
        	   System.out.println();
           }
           if(s!=null){
        	   s.close();
           }
	}

}
