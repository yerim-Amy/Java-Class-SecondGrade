package IOExam;
import java.io.*;
/*char단위 입출력 클래스는 클래스 이름이 Reader나 Writer로 끝이 납니다.
파일에서 한 줄씩 입력 받아서 파일에 출력
파일에서 읽기위해서 FileReader 클래스 이용
한 줄 읽어 들이기 위해서 BufferedReader 클래스 이용
BufferedReader 클래스가 가지고 있는 readLine() 메소드가 한줄씩 읽게 해준다.
readLine()메소드는 읽어낼 때 더 이상 읽어 들일 내용이 없을 때 null을 리턴한다.
파일에 쓰게하기 위해서 FileWriter 클래스 이용
편리하게 출력하기 위해서 PrintWriter 클래스 이용. PrintWriter는 close를 까먹어서는 안된다.*/
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
