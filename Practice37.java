package fiftypratice;

import java.util.Scanner;

/**
 * ��Ŀ����n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������
 * ������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
 * */
public class Practice37 {

	public static void main(String[] args) {
          System.out.println("����������n:");
          Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          boolean []a=new boolean[n];
          for(int i=0;i<a.length;i++){
        	  a[i]=true;
          }
          int t=n;
          int index=0;
          int count=0;
          while(t>1){
        	  if(a[index]==true){
        		  count++;
        		  if(count==3){
        			  count=0;
        			  a[index]=false;
        			  t--;
        		  }
        	  }
        	  index++;
        	  if(index==n){
        		  index=0;
        	  }
          }
          for(int i=0; i<n; i++) {
        	    if(a[i] == true) {
        	     System.out.println("ԭ���ڵ�"+(i+1)+"λ���������ˡ�");
        	    }
        	   }
          if(s!=null){
                 s.close();
          }
	}

}
