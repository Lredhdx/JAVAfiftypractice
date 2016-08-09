package fiftypratice;

import java.util.Scanner;

/**
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。   
 * */
public class Practice15 {

	public static void main(String[] args) {
            int x,y,z;
            //int min,mid,max;
            System.out.println("请输入三个整数：");
            Scanner s=new Scanner(System.in);
            x=s.nextInt();
            y=s.nextInt();
            z=s.nextInt();
            if(s!=null){
            	s.close();
            }
            //min=x;
            if(x>y){
            	int temp;
            	temp=x;
            	x=y;
            	y=temp;
            	
            }
             if(x>z){
            	int temp;
            	temp=x;
            	x=z;
            	z=temp;
            }
             if(y>z){
            	int temp;
            	temp=z;
            	z=y;
            	y=temp;
            }
            System.out.println("从小到大依次为：");
            System.out.print(x+" ");
            System.out.print(y+" ");
            System.out.print(z);
	}

}
