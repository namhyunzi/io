package io4;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class App1 {

	public static void main(String[] args) throws Exception{
		
		/*
		 * URL
		 *  - URL 객체는 지정된 URL 주소가 가르키는 자원을 표현하는 객체다.
		 *  - URL 객체의 openStream()메소드는 해당 자원과 연결된 읽기 스트림을 반환한다.
		 *  - URL 객체의 openStream()메소드를 실행해서 획득한 InputStream를 활용하면 
		 *  - URL 주소가 표현하는 자원을 읽어올 수 있다.
		 */
		URL url = new URL("https://biz.chosun.com/resizer/AXtxVg2sFeRL9QgDI08RH-dxlJg=/616x0/smart/cloudfront-ap-northeast-1.images.arcpublishing.com/chosunbiz/7Q3UW6R34JBH3ACBJKES26SIQI.jpg");
		
		InputStream in = url.openStream();
		FileOutputStream out = new FileOutputStream("src/io4/sample.jpg");
		
		IOUtils.copy(in, out);
	}

}
