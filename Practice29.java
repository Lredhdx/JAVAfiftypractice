package fiftypratice;

import java.util.Scanner;

/**
 * 题目：求一个3*3矩阵对角线元素之和     
 * 
 * */
public class Practice29 {

	public static void main(String[] args) {
         System.out.println("Please input 9 number:");
         Scanner s=new Scanner(System.in);
         int a[][]=new int[3][3];
         for(int i=0;i<3;i++){
        	 for(int j=0;j<3;j++){
        		 a[i][j]=s.nextInt();
        	 }
         }
         System.out.println("The array is:");
         for(int i=0;i<3;i++){
        	 for(int j=0;j<3;j++){
        		 System.out.print(a[i][j]+" ");
        	 }
        	 System.out.println();
         }
         long sum=0;
         for(int i=0;i<3;i++){
        	 for(int j=0;j<3;j++){
        		 if(i==j){
        			 sum+=a[i][j];
        		 }
        	 }
         }
         System.out.println("The sum is : "+sum);
         if(s!=null){
        	 s.close();
         }
	}

}
