package fiftypratice;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。   								
 * 
 * */
public class Practice07 {

	public static void main(String[] args) {
		System.out.println("请输入一行字符：");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
        if(s!=null){
        	s.close();
        }
        int letter=0,space=0,number=0,other=0;
        char[]ch=null;
        ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
        	if(ch[i]>='0'&&ch[i]<='9'){
        		number++;
        	}else if((ch[i]>='a'&&ch[i]<='z')||
        			(ch[i]>='A'&&ch[i]<='Z')){
        		letter++;
        	}else if(ch[i]==' '){
        		space++;
        	}else{
        		other++;
        	}
        }
        System.out.println("该段字符串的字母、数字、空格、"
        		+"其他字符的个数分别为：");
        System.out.print(letter+" ");
        System.out.print(number+" ");
        System.out.print(space+" ");
        System.out.print(other);
	}

}
