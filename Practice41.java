package fiftypratice;
/**
 * ��Ŀ����̲����һ�����ӣ���ֻ�������֡�
 * ��һֻ���Ӱ��������ƾ�ݷ�Ϊ��ݣ�����һ����
 * ��ֻ���ӰѶ��һ�����뺣�У�������һ�ݡ�
 * �ڶ�ֻ���Ӱ�ʣ�µ�������ƽ���ֳ���ݣ��ֶ���һ����
 * ��ͬ���Ѷ��һ�����뺣�У�������һ�ݣ����������ġ�����ֻ���Ӷ����������ģ�
 * �ʺ�̲��ԭ�������ж��ٸ����ӣ�
 * 
 * */
public class Practice41 {

	public static void main(String[] args) {
//           int sum=1;
//           //int end=1;
//           for(int i=0;i<4;i++){
//        	   sum=sum+sum*5+1;
//           }
//           System.out.println(sum);
		int i,m,j=0,k,count; 
		for(i=4;i<10000;i+=4) 
		   { count=0; 
		     m=i; 
		     for(k=0;k<5;k++) 
		        { 
		         j=i/4*5+1; 
		         i=j; 
		         if(j%4==0) 
		            count++; 
		            else break; 
		       } 
		    i=m; 
		if(count==4) 
		{System.out.println("ԭ������ "+j+" ��"); 
		break;} 
		} 
	}

}
