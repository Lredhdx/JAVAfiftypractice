package fiftypratice;

import java.util.Scanner;

/**
 * 题目：字符串排序。 
 * 
 * */
public class Practice40 {

	public static void main(String[] args) {
		    System.out.println("请输入字符串数组字符串数：");
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
            System.out.println("请输入一个字符串数组：");
            String [] arr=new String[n+1];
            for(int i=0;i<arr.length;i++){
            	arr[i]=s.nextLine();
            }
            if(s!=null){
            	s.close();
            }
            for(int i=0;i<arr.length;i++){
            	for(int j=i+1;j<arr.length;j++){
            		if(compare(arr[i],arr[j])==false){
            			String t=arr[j];
            			arr[j]=arr[i];
            			arr[i]=t;
            		}
            	}
            }
            System.out.println("排序后：");
            for(int i=0;i<arr.length;i++){
            	System.out.println(arr[i]);
            }
	}
	public static boolean compare(String s1,String s2){
		boolean flag=true;
		for(int i=0;i<s1.length()&&i<s2.length();i++){
		if(s1.charAt(i)>s2.charAt(i)){
			flag=false;
			break;
		}else if(s1.charAt(i)<s2.charAt(i)){
			flag=true;
			break;
		}else {
		     if(s1.length() < s2.length()) {
		         flag = true;
		        } else {
		         flag = false;
		        }
		       }
		}
		return flag;
	}

}
