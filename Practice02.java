package fiftypratice;
/**
 * 
 * �ж�101-200֮���ж��ٸ���������������������� 								
 */
public class Practice02 {

	public static void main(String[] args) {
		int count=0;
		int m=0;
		boolean b=false;
		System.out.println("101-200֮��������У�");
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
		  System.out.println("����"+count+"��");
	}

}
