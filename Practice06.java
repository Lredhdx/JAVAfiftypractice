package fiftypratice;

import java.util.Scanner;

/**
 * ��������������m��n���������Լ������С��������								
"  ��ѭ���У�ֻҪ����������0���ýϴ������Խ�С������
         ��С��һ������Ϊ��һ��ѭ���Ĵ�����ȡ�õ�������Ϊ��һ��ѭ���Ľ�С������
          ���ѭ��ֱ����С������ֵΪ0�����ؽϴ������
          ������Ϊ���Լ������С������Ϊ����֮���������Լ����"								
 * 
 * */
public class Practice06 {

	public static void main(String[] args) {
          System.out.println("������������������");
          int m,n;
          int max,min;
          Scanner s=new Scanner(System.in);
          m=s.nextInt();
          n=s.nextInt();
          if(s!=null){
        	  s.close();
          }
          if(m>=n){
        	  max=m;
        	  min=n;
          }
          else{
        	  max=n;
        	  min=m;
          }
          while(min!=0){
        	  int r;
        	  r=max%min;
        	  max=min;
        	  min=r;
          }
          System.out.println("���ǵ����Լ��Ϊ��"+max);
          int d;
          d=m*n/max;
          System.out.println("���ǵ���С������Ϊ��"+d);
	}

}
