package fiftypratice;

import java.util.Scanner;

/**
 * 题目：一个5位数，判断它是不是回文数。
 * 即12321是回文数，个位与万位相同，十位与千位相同。  
 * 
 * */
public class Practice25 {

	public static void main(String[] args) {
            System.out.println("请输入一个五位数：");
            int n=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            if(s!=null){
            	s.close();
            }
            String ss=Integer.toString(n);//或者 String ss=String.valueOf(n);
            char []ch=ss.toCharArray();
            if((ch[0]==ch[4])&&(ch[1]==ch[3])){
            	System.out.println("该数是回文数！");
            }else{
            	System.out.println("该数不是回文数！");
            }
            //更好的方法 不需要限制位数
            /*Scanner s = new Scanner(System.in);
              boolean is =true;
             System.out.print("请输入一个正整数：");
              long a = s.nextLong();
             String ss = Long.toString(a);
              char[] ch = ss.toCharArray();
            int j=ch.length;
            for(int i=0; i<j/2; i++) {
            if(ch[i]!=ch[j-i-1]){is=false;}
   }
   if(is==true){System.out.println("这是一个回文数");}
     else {System.out.println("这不是一个回文数");}
             * */
	}

}
