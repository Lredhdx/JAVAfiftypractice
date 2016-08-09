package fiftypratice;

import java.util.Scanner;

/**
 * 题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。   
 * */
public class Practice38 {

	public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if(s!=null){
        	s.close();
        }
        System.out.println("字符串长度为："+str.length());
	}

}
