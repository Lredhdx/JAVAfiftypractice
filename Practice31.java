package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ����һ���������������
 * 
 * */
public class Practice31 {

	public static void main(String[] args) {
          System.out.println("������һ�����飺");
          int a[]=new int[5];
          Scanner s=new Scanner(System.in);
          for(int i=0;i<a.length;i++){
        	  a[i]=s.nextInt();
          }
          if(s!=null){
        	  s.close();
          }
          for(int i=a.length-1;i>=0;i--){
        	  System.out.print(a[i]+" ");
          }
	}

}
