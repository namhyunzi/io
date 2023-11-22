package io3;

import java.io.BufferedReader;
import java.io.FileReader;

public class App1 {

	public static void main(String[] args) throws Exception {

		String path = "src/io3/data.csv";
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		/*
		 * BufferedReader
		 *  - 다른 Reader 와 연결해서 읽기 성능을 향상시키는 스트림이다.
		 *  - 텍스트를 한 줄씩 읽어오는 readLine() 메소드를 제공한다.
		 *  - 주요 메소드
		 *  	String readLine()
		 *  		- 텍스트 내용을 한 줄씩 읽어오는 스트림이다.
		 *  		- 스트림의 끝을 만나면 null 을 반환한다.
		 *  		- 텍스트를 읽어올 때 줄바꿈문자 바로 앞까지 읽어온다.
		 */
		String text = null;
		while ((text = reader.readLine()) != null) {
			String[] items = text.split(",");
			String name = items[0];
			int kor = Integer.parseInt(items[1]);
			int eng = Integer.parseInt(items[2]);
			int math = Integer.parseInt(items[3]);
			
			int total = kor + eng + math;
			int average = total/3;
			
			System.out.println("이름: " + name);
			System.out.println("평균: " + average);
			System.out.println();
		}
		
		reader.close();
	}

}
