package fiftypratice;

import java.util.Scanner;

/**
 * 题目：计算字符串中子串出现的次数  
 * */
public class Practice49 {

	public static void main(String[] args) {
           System.out.println("请输入一个字符串：");
           Scanner s=new Scanner(System.in);
           String str=s.nextLine();
           System.out.println("请输入子串：");
           String str2=s.nextLine();
           int count=0;
           if(str.equals("")||str2.equals("")){
        	   System.out.println("你没有输入字符串！");
        	   System.exit(0);
           }
           else {
        	   for(int i=0;i<=(str.length()-str2.length());i++){
        		   if(str2.equals(str.substring(i,str2.length()+i))){
        			   count++;
        		   }
        	   }
           }
           System.out.println("出现的次数："+count);
           if(s!=null){
        	   s.close();
           }
	}

}
