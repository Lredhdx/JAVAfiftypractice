package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ�����������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ���
 * �����һ����ĸһ���������   �жϵڶ�����ĸ��   
 * 
 * */
public class Practice26 {

	public static void main(String[] args) {
           System.out.println("�������������ĵ�һ����ĸ��");
           String c;
           String cc;
           Scanner s=new Scanner(System.in);
           c=s.nextLine();
           switch(c){
           case "M":
        	   System.out.println("��һ");
        	   break;
           case "W":
        	   System.out.println("����");
        	   break;
           case "F":
        	   System.out.println("����");
        	   break;
           case "T":
        	   System.out.println("������ڶ����ַ���");
        	   cc=s.nextLine();
        	   if(cc.equals("u")){
        		   System.out.println("�ܶ�");
        	   }else {
        		   System.out.println("����");
        	   }
        	   break;
           case "S":
        	   System.out.println("������ڶ����ַ���");
        	   cc=s.nextLine();
        	   if(cc.equals("a")){
        		   System.out.println("����");
        	   }else {
        		   System.out.println("����");
        	   }
        	   break;
           default:
        	   break;
           }
           if(s!=null){
        	   s.close();
           }
           
	}

}
