package fiftypratice;
/**
 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ�
 * �������Ӷ���������ÿ���µ���������Ϊ���٣� 								
        ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21....쳲���������								
 * 
 * 
 * */
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
          System.out.println("�������·ݣ�");
          Scanner s=new Scanner(System.in);
          int month=s.nextInt();
          int array[]=new int[month];
          int i=0;
          if(s!=null){
        	  s.close();
          }
          if(month<3){
        	  System.out.println("���·ݵ����Ӷ���Ϊ1");
          }
          else{
        	  array[0]=1;
        	  array[1]=1;
        	  for(i=0;i<month-2;i++){
        		  array[i+2]=array[i]+array[i+1];
        	  }
        	  System.out.println("���·ݵ����Ӷ���Ϊ��");
        	  System.out.println(array[month-1]);
          }
	}

}
