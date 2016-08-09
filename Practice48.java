package fiftypratice;

import java.util.Scanner;

/**
 * 题目：某个公司采用公用电话传递数据，
 * 数据是四位的整数，在传递过程中是加密的，加密规则如下：
 * 每位数字都加上5,然后用和除以10的余数代替该数字，
 * 再将第一位和第四位交换，第二位和第三位交换。
 * */
public class Practice48 {

	public static void main(String[] args) {
          System.out.println("请输入一个四位是：");
          Scanner s=new Scanner(System.in);
          int n=0;
          do{
        	  n=s.nextInt();
          }while(n<1000||n>9999);
          int[]a=new int[4];
          a[0]=n/1000;
          a[1]=(n/100)%10;
          a[2]=(n/10)%10;
          a[3]=n%10;
          for(int i=0;i<a.length;i++){
        	  a[i]=a[i]+5;
        	  a[i]=a[i]%10;
          }
          for(int j=0;j<=1;j++){
        	  int temp=a[j];
        	  a[j]=a[3-j];
        	  a[3-j]=temp;
          }
          System.out.println("加密后：");
          for(int t:a){
        	  System.out.print(t);
          }
          
	}

}
