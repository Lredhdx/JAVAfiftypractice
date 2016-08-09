package fiftypratice;

import java.util.Scanner;

/**
 * 题目：判断一个素数能被几个9整除    
//题目错了吧？能被9整除的就不是素数了！所以改成整数了。
 * 
 * */
public class Practice45 {

	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int temp=n;
          int count=0;
          for(int i=0;temp%9==0;){
        	  temp=temp/9;
        	  count++;
          }
          System.out.println(count);
	}

}
