package fiftypratice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��Ŀ����n��������ʹ��ǰ�����˳�������m��λ�ã�
 * ���m���������ǰ���m����   
 * */
public class Practice36 {

	public static void main(String[] args) {
		 System.out.println("������n��ֵ��");
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
         System.out.println("������m��ֵ��");
         int m=s.nextInt();
         int []a=new int[n];
         for(int i=0;i<a.length;i++){
        	 a[i]=s.nextInt();
         }
         if(s!=null){
        	 s.close();
         }
         int b[]=new int[m];
         for(int i=0;i<b.length;i++){
        	 b[i]=a[n-m+i];
         }
         for(int i=n-1;i>=m;i--){
        	 a[i]=a[i-m];
         }
         for(int i=0;i<m;i++){
        	 a[i]=b[i];
         }
         String ss=Arrays.toString(a);
         System.out.println(ss);
	}

}
