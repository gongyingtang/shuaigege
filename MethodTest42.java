/*
	���ڷ��������أ�Overload��
	���³���ʹ�÷��������أ������ŵ�
		1������Աֻ��Ҫ���������ķ��������������
		2�������������
	ʲôʱ��ᷢ�����������أ�
		1��������ͬһ������
		2����������ͬ
		3����ʽ�����б�ͬ�����͡�������˳��
		4���ͷ���ֵ�޹أ����۷��ص���int��long����������void��
		5���ͷ��������η��б��޹أ�������public static����public��
 */
public class MethodTest42{
	public static void main(String[] args){
		System.out.println(A.sum(10,20));
		System.out.println(A.sum(3.0,2.0));
		System.out.println(A.sum(10l,20l));
	}
}
class A{
	public static int sum(int a,int b){
		return a + b;
	}
	public static double sum(double a,double b){
		return a + b;
	}
	public static long sum(long a,long b){
		return a + b;
	}

}