package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ��дһ����������һ���ַ����ĳ��ȣ���main�����������ַ�����������䳤�ȡ�   
 * */
public class Practice38 {

	public static void main(String[] args) {
        System.out.println("������һ���ַ�����");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if(s!=null){
        	s.close();
        }
        System.out.println("�ַ�������Ϊ��"+str.length());
	}

}
