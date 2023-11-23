package io3;

import java.io.PrintWriter;

public class App2 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * PrintWriter
		 *  - 캐릭터스트림의 출력 전용 스트림이다.
		 *  - print(), println() 메소드를 제공한다.
		 *  - println() 메소드를 사용하면 자동으로 줄바꿈 문자를 추가해준다.
		 *    줄바꿈 문자 추가없이 한 줄씩 출력하는게 가능하다.
		 */
		
		PrintWriter writer = new PrintWriter("src/io3/data2.csv");
		
		writer.println("김유신,100,100,100");
		writer.println("강감찬,100,100,100");
		writer.println("이순신,100,100,100");
		
		writer.flush();
		
		writer.close();
	}

}
