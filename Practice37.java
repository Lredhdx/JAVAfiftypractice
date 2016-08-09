package fiftypratice;

import java.util.Scanner;

/**
 * 题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
 * 凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 * */
public class Practice37 {

	public static void main(String[] args) {
          System.out.println("请输入人数n:");
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          boolean []a=new boolean[n];
          for(int i=0;i<a.length;i++){
        	  a[i]=true;
          }
          int t=n;
          int index=0;
          int count=0;
          while(t>1){
        	  if(a[index]==true){
        		  count++;
        		  if(count==3){
        			  count=0;
        			  a[index]=false;
        			  t--;
        		  }
        	  }
        	  index++;
        	  if(index==n){
        		  index=0;
        	  }
          }
          for(int i=0; i<n; i++) {
        	    if(a[i] == true) {
        	     System.out.println("原排在第"+(i+1)+"位的人留下了。");
        	    }
        	   }
          if(s!=null){
                 s.close();
          }
	}

}
