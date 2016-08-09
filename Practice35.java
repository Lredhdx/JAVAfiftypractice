package fiftypratice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 题目：输入数组，最大的与第一个元素交换，
 * 最小的与最后一个元素交换，输出数组。 
 *   */
/*此题解法有误，若最大值交换的第一个元素是最小值，则条件二无法满足；
 * */
public class Practice35 {

	public static void main(String[] args) {
        System.out.println("请输入一个元素为5的数组：");
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
        	a[i]=s.nextInt();
        }
        if(s!=null){
        	s.close();
        }
        int min=a[0];
        int max=a[0];
        int index1=0;
        int index2=0;
        for(int i=0;i<a.length;i++){
        	if(a[i]>=max){
        		max=a[i];
        		index1=i;
        	}
        	if(a[i]<=min){
        		min=a[i];
        		index2=i;
        	}
        	
        }
        if(index1 != 0) {
            int temp = a[0];
            a[0] = a[index1];
            a[index1] = temp;
           }
            if(index2 != a.length-1) {
            int temp = a[a.length-1];
            a[a.length-1] = a[index2];
            a[index2] = temp;
           }
       
       String t= Arrays.toString(a);
       System.out.println(t);
	}

}
