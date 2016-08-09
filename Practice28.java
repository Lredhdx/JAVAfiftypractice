package fiftypratice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目：对10个数进行排序   
 * 
 * */
public class Practice28 {

	public static void main(String[] args) {
          int arr[]=new int[10];
          System.out.println("Please input ten number:");
          Scanner s=new Scanner(System.in);
          for(int i=0;i<arr.length;i++){
        	  arr[i]=s.nextInt();
          }
          if(s!=null){
        	  s.close();
          }
          for(int j=0;j<arr.length-1;j++){
            for(int i=j+1;i<arr.length;i++){
        	  //int max=arr[i];
        	  if(arr[i]>arr[j]){
        		  int temp=arr[i];
        		  arr[i]=arr[j];
        		  arr[j]=temp;
        	  }
          }
          }
          String info=Arrays.toString(arr);
          System.out.println("The result of selecting sort:"+info);
	}

}
