/*
	break��䣻
	1����������switch����У�������֧��䡣
	2:break�������Գ�����ѭ���У�Ĭ������½������������һ��ѭ����
 */
	public class Break39{
		public static void main(String[]  args){
			for(int i =0;i<10;i++){
                System.out.println(i);
				if(i == 5){
					break; //ֻ�ǽ������������һ��ѭ��
					//return; //������main����
				}
			}

			System.out.println("Hello World!");
		}
	}
	