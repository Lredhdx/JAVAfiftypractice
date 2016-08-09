package fiftypratice;
/**
 * 
 *  有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？								
 */
public class Practice11 {

	public static void main(String[] args) {
		int count=0;
		int number=0;
            for(int a=1;a<5;a++){
            	for(int b=1;b<5;b++){
            		for(int c=1;c<5;c++){
            			if(a!=b&&a!=c&&b!=c){
            				count++;number++;
            				System.out.print(100*a+10*b+c+" ");
            				if(number%6==0){
            					System.out.println();
            				}
            			}
            		}
            	}
            }
            //System.out.println();
            System.out.println("能组成"+count+"个互不相同且无重复数字的三位数");
	}

}
