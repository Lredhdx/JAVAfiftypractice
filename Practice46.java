package fiftypratice;

import java.util.Scanner;

//题目：两个字符串连接程序 
public class Practice46 {

	public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("请输入一个字符串");
            String str1=s.nextLine();
            System.out.println("请输入一个字符串");
            String str2=s.nextLine();
            String str=str1+str2;
            System.out.println(str);
            if(s!=null){
            	s.close();
            }
	}

}
