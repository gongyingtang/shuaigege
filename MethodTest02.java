/*
	���巽�����﷨
		[���������η��б�] �����ķ���ֵ���� ������(��������ʽ����){
			java���;
		}
		1:[���������η��б�]�ǿ�ѡ���������ʱд�ɣ�public static
		2:�����ķ���ֵ���Ϳ�����java�������κ�һ����������(�����������ͺ�������������)
		3����������ʽ�����б������в�����Ҳ����û�в���������ж�������Ļ�ʹ�á���������
 
public static void m1(){
	public static:���η�
	void ���������������ʱû�з���ֵ
	m1���Ƿ�����
	û����ʽ����
	public static int m2(int a,boolean b){
	public static ���η�
	int ���Ƿ���ֵ����
	m2 ���Ƿ�����
	int a,boolean b ������ʽ�����б�
	}

	6�����һ����������ֵ����void����ô�����ͱ���ʹ��return�������������
	return���һ��ִ�У��򷽷�����

}
*/
public class MethodTest02{
	public static void main(String[] args){
		MethodTest02.println("Hello World!");
		
	}
	public static void println(String msg){
		System.out.println(msg);
	}
	public static int m3(int a,int b){
		int c = a + b;
		return c;//����ִ�е��˴�m3����������������ֵ
		//System.out.println("abc");return����²������������룬������붼��ͨ��
	}
}