package basic.io;

import java.io.FileWriter;
import java.io.IOException;

//파일출력하기 - 3단계
//=> FileWriter이용
public class FileWriterExam {
    public static void main(String[] args) {
    	FileWriter fw = null;
    	
        try {
            //1. 파일오픈 
            // => 출력할 파일과 연결/basicJava/src/output.txt
            // => 파일이 존재하지 않으면 파일을 생성해서 작업
            fw = new FileWriter("src/gugudan2.txt", tu);

            //2. 파일액세스
            //=> write메소드는 newline이 포함되지 않음
            //=> 출력스트림의 내부에 파일에 쓰기 위한 데이터를 쌓아놓은 것
            
            
            for(int i = 1; i <10; i++) {
            	for(int j = 1; j<10; j++) {
            		fw.write(i + "*" + j +" = " + i*j + "   ");
            	}
            	fw.write("\n");
            }
       

        
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