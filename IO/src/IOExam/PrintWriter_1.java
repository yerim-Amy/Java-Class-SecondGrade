package IOExam;
import java.io.*;
/*char���� ����� Ŭ������ Ŭ���� �̸��� Reader�� Writer�� ���� ���ϴ�.
���Ͽ��� �� �پ� �Է� �޾Ƽ� ���Ͽ� ���
���Ͽ��� �б����ؼ� FileReader Ŭ���� �̿�
�� �� �о� ���̱� ���ؼ� BufferedReader Ŭ���� �̿�
BufferedReader Ŭ������ ������ �ִ� readLine() �޼ҵ尡 ���پ� �а� ���ش�.
readLine()�޼ҵ�� �о �� �� �̻� �о� ���� ������ ���� �� null�� �����Ѵ�.
���Ͽ� �����ϱ� ���ؼ� FileWriter Ŭ���� �̿�
�����ϰ� ����ϱ� ���ؼ� PrintWriter Ŭ���� �̿�. PrintWriter�� close�� ��Ծ�� �ȵȴ�.*/
public class PrintWriter_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br= null;
		PrintWriter pw=null;
		PrintWriter pw2=null;
		try {
			br = new BufferedReader(new FileReader("src/io/PrintWriter_1.java"));
			pw = new PrintWriter(new FileWriter("src/io/pwtest.txt"));
			pw2 = new PrintWriter(System.out);
			
			String s=null;
			while((s=br.readLine())!=null)
			{
				pw.println(s);
				pw2.println(s);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			pw.close();
			pw2.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}