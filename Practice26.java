package fiftypratice;

import java.util.Scanner;

/**
 * 题目：请输入星期几的第一个字母来判断一下是星期几，
 * 如果第一个字母一样，则继续   判断第二个字母。   
 * 
 * */
public class Practice26 {

	public static void main(String[] args) {
           System.out.println("请输入星期数的第一个字母：");
           String c;
           String cc;
           Scanner s=new Scanner(System.in);
           c=s.nextLine();
           switch(c){
           case "M":
        	   System.out.println("周一");
        	   break;
           case "W":
        	   System.out.println("周三");
        	   break;
           case "F":
        	   System.out.println("周五");
        	   break;
           case "T":
        	   System.out.println("请输入第二个字符：");
        	   cc=s.nextLine();
        	   if(cc.equals("u")){
        		   System.out.println("周二");
        	   }else {
        		   System.out.println("周四");
        	   }
        	   break;
           case "S":
        	   System.out.println("请输入第二个字符：");
        	   cc=s.nextLine();
        	   if(cc.equals("a")){
        		   System.out.println("周六");
        	   }else {
        		   System.out.println("周日");
        	   }
        	   break;
           default:
        	   break;
           }
           if(s!=null){
        	   s.close();
           }
           
	}

}
