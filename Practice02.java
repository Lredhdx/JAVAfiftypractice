package fiftypratice;
/**
 * 
 * 判断101-200之间有多少个素数，并输出所有素数。 								
 */
public class Practice02 {

	public static void main(String[] args) {
		int count=0;
		int m=0;
		boolean b=false;
		System.out.println("101-200之间的素数有：");
		  for(int i=101;i<=200;i++){
			  for(int j=2;j<i;j++){
				  if(i%j==0){
					  b=false;
					 break;
				  }else{
					  b=true;
				  }
			  }
			  if(b==true){
				  m++;
				  count++;
				  System.out.print(i+" ");
				  if(m%5==0){
					  System.out.println();
				  }
			  }
		  }
		  System.out.println();
		  System.out.println("共有"+count+"个");
	}

}
