package fiftypratice;

import java.util.Scanner;

/**
 * 
 * "企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
 *  利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
            高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，
            可提成5%；40万到60万之间时高于40万元的部分，
            可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，
            高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润，
            求应发放奖金总数？ "								
*/
public class Practice12 {

	public static void main(String[] args) {
          int n;
          System.out.println("请输入当月利润:"+"万元。");
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
          if(s!=null){
        	 s.close();
          }
          double a=0;
          if(n<10){
        	  a=0.1*n;
          }
          else if(n>=10&&n<20){
        	  a=0.1*10+0.075*(n-10);
          }
          else if(n>=20&&n<40){
        	  a=0.1*10+10*0.075+0.05*(n-20);
          }
          else if(n>=40&&n<60){
        	  a=10*0.175+0.05*20+0.03*(n-40);
          }
          else if(n>=60&&n<100){
        	  a=10*0.175+0.05*20+0.03*20+0.015*(n-60);
          }
          else if(n>=100){
        	  a=10*0.175+0.05*20+0.03*20+0.015*40+0.01*(n-100);
          }
          System.out.println("应发奖金数为："+a+"万元");
	}

}
