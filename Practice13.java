package fiftypratice;
/**
 *һ��������������100����һ����ȫƽ������
 *�ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�   
 * 
 * */
public class Practice13 {

	public static void main(String[] args) {
           for(int i=0;i<=100000;i++){
        	   if(Math.sqrt(i+100)%1==0){
        		   if(Math.sqrt(i+268)%1==0){
        			   System.out.println("������"+i);
        		   }
        	   }
           }
	}

}
