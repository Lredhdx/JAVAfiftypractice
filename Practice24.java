package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ����һ��������5λ����������
 * Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
 * 
 * 
 * */
public class Practice24 {

	public static void main(String[] args) {
         /*System.out.println("������һ����������λ����������");
         Scanner s=new Scanner(System.in);
         int n;
         int count=1;
         n=s.nextInt();
         int temp=n;
         if(s!=null){
        	 s.close();
         }
         while(n/10!=0){
        	 count++;
        	 n=n/10;
         }
         System.out.println("����һ��"+count+"λ��");
         System.out.println("��������Ϊ��");
         int a[]=new int[count];
         for(int i=0;i<a.length;i++){
        	 a[i]=temp%10;
        	 temp=temp/10;
        	 System.out.print(a[i]);
         }*/
		//��������
         Scanner s = new Scanner(System.in);
         System.out.print("������һ����������");
         long a = s.nextLong();
         if(s!=null){
        	 s.close();
         }
         String ss = Long.toString(a);
          char[] ch = ss.toCharArray();
          int j=ch.length;
          System.out.println(a + "��һ��"+ j +"λ����");
          System.out.print("����������ǣ�");
          for(int i=j-1; i>=0; i--) {
          System.out.print(ch[i]);
         }
         
        
	}

}
