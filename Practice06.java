package fiftypratice;

import java.util.Scanner;

/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。								
"  在循环中，只要除数不等于0，用较大数除以较小的数，
         将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，
          如此循环直到较小的数的值为0，返回较大的数，
          此数即为最大公约数，最小公倍数为两数之积除以最大公约数。"								
 * 
 * */
public class Practice06 {

	public static void main(String[] args) {
          System.out.println("请输入两个正整数：");
          int m,n;
          int max,min;
          Scanner s=new Scanner(System.in);
          m=s.nextInt();
          n=s.nextInt();
          if(s!=null){
        	  s.close();
          }
          if(m>=n){
        	  max=m;
        	  min=n;
          }
          else{
        	  max=n;
        	  min=m;
          }
          while(min!=0){
        	  int r;
        	  r=max%min;
        	  max=min;
        	  min=r;
          }
          System.out.println("它们的最大公约数为："+max);
          int d;
          d=m*n/max;
          System.out.println("它们的最小公倍数为："+d);
	}

}
