/*
	���ڷ����ĵݹ����
		1�������ĵݹ���þ��Ƿ����Լ������Լ�
		2�����³�����Ϊ�ݹ�û�н������������Ի�һֱѹջ��û�е�ջ�������ڴ�����������Եݹ����Ҫ�н�������
*/
/*public class DiGui47{

	public static void main(String[] args){

		m1();

	}
	public static void m1(){
		m1();//��������ʱ�ᱨ�ڴ��������
	}
}
*/	


	//ʹ�õݹ鷽������1-N�ĺ͡�

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

		//N�Ľ׳ˣ���ʹ�õݹ鷽����
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

