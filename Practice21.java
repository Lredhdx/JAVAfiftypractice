package fiftypratice;
/**
 * ��Ŀ����1+2!+3!+...+20!�ĺ� 
 * 
 * */
public class Practice21 {

	public static void main(String[] args) {
           long sum=0;
           long fac=1;
           for(int i=1;i<=20;i++){
        	   fac=fac*i;
        	   sum+=fac;
           }
           System.out.println("1+2!+3!+...+20!="+sum);
	}

}
