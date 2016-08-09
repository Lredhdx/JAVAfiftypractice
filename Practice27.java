package fiftypratice;
/**
 * 题目：求100之内的素数   

 * */
public class Practice27 {

	public static void main(String[] args) {
		//使用除sqrt(n)的方法求出的素数不包括2和3
		boolean b=false;
		System.out.print("3"+" ");
		for(int i=3;i<=100;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					b=false;
					break;
				}else {b=true;}
				
			}
			if(b==true){
				System.out.print(i+" ");
			}
		}
	}

}
