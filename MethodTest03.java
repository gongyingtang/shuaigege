public class MethodTest03{
	//���������
	public static void main(String[] args){
		m1();//�ڵ�ǰ���£����÷���ʱ����ʡ�ԡ������㡱
		//m2();m2�������ڵ�ǰ�࣬���е��õ�ʱ�����ʹ��������ķ�ʽ
		a.m2();

	}
	public static void m1(){
		System.out.println("m2....");
	}
	
	}
	class a {
		public static void m2(){
			System.out.println("Hello World");
		}
	}
