package fiftypratice;
/**
 * ��Ŀ����0��7������ɵ�����������   
         ���1λ����4����
         ���2λ����7*4����
         ���3λ����7*8*4����
         ���4λ����7*8*8*4����
   ......
 * 
 * */
public class Practice43 {

	public static void main(String[] args) {
          int sum=4;
          int j;
          System.out.println("���1λ���ǣ�"+sum+"��");
          sum=sum*7;
          System.out.println("���2λ���ǣ�"+sum+"��");
          for(j=3;j<=7;j++){
        	  sum*=8;
        	  System.out.println("���"+j+"λ���ǣ�"+sum+"��");
             }
//          Scanner s=new Scanner(System.in);
	}

}
