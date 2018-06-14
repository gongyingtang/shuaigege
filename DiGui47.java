/*
	关于方法的递归调用
		1：方法的递归调用就是方法自己调用自己
		2：以下程序因为递归没有结束条件，所以会一直压栈，没有弹栈，导致内存溢出错误。所以递归必须要有结束条件
*/
/*public class DiGui47{

	public static void main(String[] args){

		m1();

	}
	public static void m1(){
		m1();//程序运行时会报内存溢出错误
	}
}
*/	


	//使用递归方法计算1-N的和。

public class DiGui47{

	public static void main(String[] args){

		/*int n = 4;
		int fanhui=m1(n);
		System.out.println(m1(n));

	}
	public static int m1(int n){
		if(n==1){
			return 1;
		}else{
			return n + m1(n-1);
		}*/

		//N的阶乘，不使用递归方法。
		System.out.println(m1(3));
	}
	public static int m1(int n ){
		int sum = 1;
		for(int i=1;i<=n;i++){
			sum *= i;
		}	
		return sum;
	}

}

