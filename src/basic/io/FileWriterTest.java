package basic.io;

import java.io.FileWriter;
import java.io.IOException;

//파일출력하기 - 3단계
//=> FileWriter이용
public class FileWriterTest {
    public static void main(String[] args) {
    	FileWriter fw = null;
    	
        try {
            //1. 파일오픈 
            // => 출력할 파일과 연결/basicJava/src/output.txt
            // => 파일이 존재하지 않으면 파일을 생성해서 작업
            fw = new FileWriter("output.txt");
            System.out.println("현재 작업 디렉토리: " + System.getProperty("user.dir"));

            //2. 파일액세스
            //=> write메소드는 newline이 포함되지 않음
            //=> 출력스트림의 내부에 파일에 쓰기 위한 데이터를 쌓아놓은 것
            fw.write(97);
            fw.write('A');
            fw.write("하이 헬로우~~~~~");

        
        }catch(IOException e) {
            System.out.println("출력오류~~~~");
        }finally {
            //3. 파일의 자원을 반납
            // => 오픈된 파일을 닫고 OS에게 점유했던 파일리소스를 반납해야
            //    모든 내용이 파일에 쓰여진다.
            // => 자원반납은 무조건 실행되어야 하므로 finally블럭에서 처리
        	
        	try {
        		if(fw!=null) fw.close();
        	} catch(IOException e) {
        		
        	}
        }
    }
}