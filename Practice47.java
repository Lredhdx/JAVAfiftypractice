package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ����ȡ7������1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ����ֵ�����ģ���
 * */
public class Practice47 {

	public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
           System.out.println("������7����1-50����������");
           for(int i=0;i<7;i++){
        	   int num=s.nextInt();
        	   for(int j=0;j<num;j++){
        		   System.out.print("*");
        	   }
        	   System.out.println();
           }
           if(s!=null){
        	   s.close();
           }
	}

}
