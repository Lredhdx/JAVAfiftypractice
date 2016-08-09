package fiftypratice;

import java.util.Scanner;

/**
 * 题目：给一个不多于5位的正整数，
 * 要求：一、求它是几位数，二、逆序打印出各位数字。
 * 
 * 
 * */
public class Practice24 {

	public static void main(String[] args) {
         /*System.out.println("请输入一个不多于五位的正整数：");
         Scanner s=new Scanner(System.in);
         int n;
         int count=1;
         n=s.nextInt();
         int temp=n;
         if(s!=null){
        	 s.close();
         }
         while(n/10!=0){
        	 count++;
        	 n=n/10;
         }
         System.out.println("这是一个"+count+"位数");
         System.out.println("它的逆序为：");
         int a[]=new int[count];
         for(int i=0;i<a.length;i++){
        	 a[i]=temp%10;
        	 temp=temp/10;
        	 System.out.print(a[i]);
         }*/
		//方法二：
         Scanner s = new Scanner(System.in);
         System.out.print("请输入一个正整数：");
         long a = s.nextLong();
         if(s!=null){
        	 s.close();
         }
         String ss = Long.toString(a);
          char[] ch = ss.toCharArray();
          int j=ch.length;
          System.out.println(a + "是一个"+ j +"位数。");
          System.out.print("按逆序输出是：");
          for(int i=j-1; i>=0; i--) {
          System.out.print(ch[i]);
         }
         
        
	}

}
