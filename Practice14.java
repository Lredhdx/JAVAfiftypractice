package fiftypratice;

import java.util.Scanner;

/**
 * 
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 
 * 
 * */   
public class Practice14 {

	public static void main(String[] args) {
            int year=0,month=0,day=0;
            int days=0;
            Scanner s=new Scanner(System.in);
            int  input;
            do{
            	input=0;
            System.out.println("请输入年份：");
            year=s.nextInt();
            System.out.println("请输入月份：");
            month=s.nextInt();
            System.out.println("请输入日期：");
            day=s.nextInt();
            if(year<=0||month<=0||month>=12||day<=0||day>31){
            	System.out.println("输入有误，请重新输入！");
            	input=1;
            }
            }while(input==1);
            if(s!=null){
            	s.close();
            }
            for(int i=1;i<month;i++){
            	switch(i){
            	case 1:
            	case 3:
            	case 5:
            	case 7:
            	case 8:
            	case 10:
            	case 12:
            	    days=31;
            	    break;
            	case 4:
            	case 6:
            	case 9:
            	case 11:
            		days=30;
            		break;
            	case 2:
            		if((year%400==0)||(year%4==0&&year%100!=0)){
            			days=29;
            		}else {days=28;}
            		break;	
            	}
            	day=day+days;
            }
            System.out.println("这一天是这一年的第"+day+"天");
           
	}

}
