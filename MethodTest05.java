/*
	��ν�������ֵ��void�ķ���
 */
public class MethodTest05{
	public static void main(String[] args){

		m1(0);
		System.out.println("�����й���");
		if(true){
			return;
		}
		System.out.println("����")��

	}
	public static void m1(int i){
		for(;i<10;i++){

			if(i==5){

				return;//������������ֵ��void�ķ���
			//break;
			}
			System.out.println(i);
		}

	}
}