package fiftypratice;
/**
 * 题目：利用递归方法求5!。
 * 
 * */
public class Practice22 {

	public static void main(String[] args) {
            int n=5;
            
            Fac sum=new Fac();
            System.out.println("5!="+sum.Fac(n));
	}

}
class Fac{
	//public int n;
	public long Fac(int n){
		long value=0;
		if(n==1){
			value=1;
			return value;
		}
		else {
			return n*Fac(n-1);
		}
		
	}
}