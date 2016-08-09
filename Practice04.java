package fiftypratice;

import java.util.Scanner;

/**
 *将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 								
  *"对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：    
  *(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。    
  *(2)如果n <> k，但n能被k整除，则应打印出k的值，
         *      并用n除以k的商,作为新的正整数你n,重复执行第一步。    
  *(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。"								
 * 
 * 
 * */
public class Practice04 {

	public static void main(String[] args) {
         System.out.println("请输入一个正整数：");
         Scanner in=new Scanner(System.in);
         int n=0;
         n=in.nextInt();
         if(in!=null){
        	 in.close();
         }
         System.out.println("分解质因数的结果为：");
         System.out.print(n+"=");
         int k=2;
         while(k<=n){
        	 if(k==n){
        		 System.out.println(k);
        		 break;
        	 }
        	 else if(n%k==0){
        		 System.out.print(k+"*");
        		 n=n/k;
        	 }
        	 else{
        		 k++;
        		 }
         }
         
	}

}
