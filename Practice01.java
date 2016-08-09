package fiftypratice;
/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？ 								
        兔子的规律为数列1,1,2,3,5,8,13,21....斐波那契数列								
 * 
 * 
 * */
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
          System.out.println("请输入月份：");
          Scanner s=new Scanner(System.in);
          int month=s.nextInt();
          int array[]=new int[month];
          int i=0;
          if(s!=null){
        	  s.close();
          }
          if(month<3){
        	  System.out.println("该月份的兔子对数为1");
          }
          else{
        	  array[0]=1;
        	  array[1]=1;
        	  for(i=0;i<month-2;i++){
        		  array[i+2]=array[i]+array[i+1];
        	  }
        	  System.out.println("该月份的兔子对数为：");
        	  System.out.println(array[month-1]);
          }
	}

}
