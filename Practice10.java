package fiftypratice;
/**
 * һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
 * �����£�������     ��10�����ʱ�������������ף���10�η�����ߣ�
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
         System.out.println("������"+s+"��");
         System.out.println("��ʮ�η���"+l+"��");
	}

}
