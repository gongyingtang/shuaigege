/*
	���뷽�������������������
 */
public class MethodTest01{
	public static void main(String[] args){
		/*
		int b =20;
		int c =a+b;
		System.out.println(a + "+" + b + "=" + c);
		//���ϴ�����ԭʼ��ͷ�ʽ
		*/
	//��main�����ж�sumInt�������е��ã���ɹ���
	//ע�⣺���м���static�ķ��������õ�ʱ�򶼱����ȡ�������㡱�ķ�ʽ���е���
	MethodTest01.sumInt(10,20);
	MethodTest01.sumInt(20,50);

	}
	//���巽��������������������
	//ע�⣺Ŀǰ���еķ�������Ϊpublic static
	public static void sumInt(int a,int b){
		int c =a + b;
		System.out.println(a + "+" + b + "=" + c);

	}
}