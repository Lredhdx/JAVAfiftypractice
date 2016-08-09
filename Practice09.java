package fiftypratice;
/**
 * 
 * 
 * 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
 * 例如6=1＋2＋3.   找出1000以内的所有完数并输出。								
 */
public class Practice09 {

	public static void main(String[] args) {
		System.out.println("1000以内的所有完数：");
         for(int i=1;i<=1000;i++){
        	 int sum=0;
        	 for(int j=1;j<=i/2;j++){
        		 if(i%j==0){
        			sum=sum+j; 
        		 }
        	 }
        	 if(sum==i){
        		 System.out.print(i+" ");
        	 }
         }
	}

}
