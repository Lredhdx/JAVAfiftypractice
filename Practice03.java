package fiftypratice;
/**
 * 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
 * 其各位数字立方和等于该数本身。								
 * 
 * 
 */
public class Practice03 {

	public static void main(String[] args) {
		System.out.println("三位数水仙花数有：");
		int m,n,t,j;
		for(int i=100;i<=999;i++){
			m=i%10;//得到个位数；
			j=i/10;
			n=j%10;//得到十位数；
			t=i/100;//得到百位数；
			if(i==(m*m*m+n*n*n+t*t*t)){
				System.out.print(i+" ");
			}else{
				continue;
			}
		}

	}

}
