package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ��һ��5λ�����ж����ǲ��ǻ�������
 * ��12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��  
 * 
 * */
public class Practice25 {

	public static void main(String[] args) {
            System.out.println("������һ����λ����");
            int n=0;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            if(s!=null){
            	s.close();
            }
            String ss=Integer.toString(n);//���� String ss=String.valueOf(n);
            char []ch=ss.toCharArray();
            if((ch[0]==ch[4])&&(ch[1]==ch[3])){
            	System.out.println("�����ǻ�������");
            }else{
            	System.out.println("�������ǻ�������");
            }
            //���õķ��� ����Ҫ����λ��
            /*Scanner s = new Scanner(System.in);
              boolean is =true;
             System.out.print("������һ����������");
              long a = s.nextLong();
             String ss = Long.toString(a);
              char[] ch = ss.toCharArray();
            int j=ch.length;
            for(int i=0; i<j/2; i++) {
            if(ch[i]!=ch[j-i-1]){is=false;}
   }
   if(is==true){System.out.println("����һ��������");}
     else {System.out.println("�ⲻ��һ��������");}
             * */
	}

}
