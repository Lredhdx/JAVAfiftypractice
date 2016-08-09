package fiftypratice;
/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在     第10次落地时，共经过多少米？第10次反弹多高？
 * 
 */
public class Practice10 {

	public static void main(String[] args) {
         float s=100.0f;
         float l=100.0f;
         for(int i=1;i<10;i++){
        	 s=s+l;
        	 l=l/2;
         }
         l=l/2;
         System.out.println("共经过"+s+"米");
         System.out.println("第十次反弹"+l+"米");
	}

}
