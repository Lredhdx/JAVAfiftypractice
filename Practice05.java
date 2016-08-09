package fiftypratice;

import java.util.Scanner;

/**
 * 利用条件运算符的嵌套来完成此题：
 * 学习成绩> =90分的同学用A表示，
 * 60-89分之间的用B表示，60分以下的用C表示。								

 * 
 * */
public class Practice05 {

	public static void main(String[] args) {
        System.out.println("请输入你的成绩：");
        Scanner s=new Scanner(System.in);
        int score=0;
        score=s.nextInt();
        if(s!=null){
        	s.close();
        }
        System.out.println("你的成绩等级为：");
        if(score>=60){
        	if(score>=90){
        		System.out.println("A");
        	}
        	else{System.out.println("B");}
        }
        else{
        	System.out.println("C");
        }
	}

    
}
