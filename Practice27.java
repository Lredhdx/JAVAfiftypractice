package fiftypratice;
/**
 * ��Ŀ����100֮�ڵ�����   

 * */
public class Practice27 {

	public static void main(String[] args) {
		//ʹ�ó�sqrt(n)�ķ������������������2��3
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
