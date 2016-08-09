package fiftypratice;

import java.util.Scanner;

/**
 * 题目：取一个整数a从右端开始的4～7位。
 * */
public class Practice32 {

	public static void main(String[] args) {
            System.out.println("请输入一个超过七位的整数：");
            Scanner s=new Scanner(System.in);
            long a=s.nextLong();
            if(s!=null){
            	s.close();
            }
            String ss=Long.toString(a);
            char []arr=ss.toCharArray();
            int l=arr.length;
            System.out.println(""+arr[l-7]+arr[l-6]+arr[l-5]+arr[l-4]);
	}

}
