package fiftypratice;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 题目：有五个学生，每个学生有3门课的成绩，
 * 从键盘输入以上数据（包括学生号，姓名，三门课成绩），
 * 计算出平均成绩，把原有的数据和计算出的平均分数存放在磁盘文件 "stud "中。
 * */
public class Practice50 {

	public static void main(String[] args) {
          // System.out.println("请输入5个学生学号 姓名 三门课成绩");
           Scanner s=new Scanner(System.in);
           String [][]a=new String[5][6];
           for(int i=1;i<6;i++){
        	   System.out.println("请输入第"+i+"个学生的学号：");
        	   a[i-1][0]=s.nextLine();
        	   System.out.println("请输入第"+i+"个学生的姓名：");
        	   a[i-1][1]=s.nextLine();
        	   for(int j=2;j<5;j++){
        		   System.out.println("请输入第"+i+"个学生的第"+(j-1)+"门成绩：");
        		   a[i-1][j]=s.nextLine();
        	   }
           }
           System.out.println();
           float avg;
           int sum=0;
           for(int i=0;i<a.length;i++){
        	   for(int j=2;j<5;j++){
        		   sum=sum+Integer.parseInt(a[i][j]);
        	   }
        	   avg=(float)sum/3;
        	   a[i][5]=String.valueOf(avg);
           }
           String s1;
        	   try {
        		   File f=new File("F:\\t.txt");
        		   if(f.exists()){
        			   System.out.println("文件存在；");
        		   }else{
				f.createNewFile();
				}
        	BufferedWriter output=new BufferedWriter(new FileWriter(f));
        	for(int i=0;i<5;i++){
        		for(int j=0;j<6;j++){
        			s1=a[i][j]+"\r\n";
        			output.write(s1);
        		}
        	}
        	output.close();
        	System.out.println("数据已写入f盘");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//创建文件
        	   if(s!=null){
        		   s.close();
        	   }
           }
	
        		  
	}

