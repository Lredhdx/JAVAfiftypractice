package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ��ĳ����˾���ù��õ绰�������ݣ�
 * ��������λ���������ڴ��ݹ������Ǽ��ܵģ����ܹ������£�
 * ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣�
 * �ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
 * */
public class Practice48 {

	public static void main(String[] args) {
          System.out.println("������һ����λ�ǣ�");
          Scanner s=new Scanner(System.in);
          int n=0;
          do{
        	  n=s.nextInt();
          }while(n<1000||n>9999);
          int[]a=new int[4];
          a[0]=n/1000;
          a[1]=(n/100)%10;
          a[2]=(n/10)%10;
          a[3]=n%10;
          for(int i=0;i<a.length;i++){
        	  a[i]=a[i]+5;
        	  a[i]=a[i]%10;
          }
          for(int j=0;j<=1;j++){
        	  int temp=a[j];
        	  a[j]=a[3-j];
        	  a[3-j]=temp;
          }
          System.out.println("���ܺ�");
          for(int t:a){
        	  System.out.print(t);
          }
          
	}

}
