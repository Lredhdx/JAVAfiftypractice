package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ��ȡһ������a���Ҷ˿�ʼ��4��7λ��
 * */
public class Practice32 {

	public static void main(String[] args) {
            System.out.println("������һ��������λ��������");
            Scanner s=new Scanner(System.in);
            long a=s.nextLong();
            if(s!=null){
            	s.close();
            }
            String ss=Long.toString(a);
            char []arr=ss.toCharArray();
            int l=arr.length;
            System.out.println(""+arr[l-7]+arr[l-6]+arr[l-5]+arr[l-4]);
	}

}
