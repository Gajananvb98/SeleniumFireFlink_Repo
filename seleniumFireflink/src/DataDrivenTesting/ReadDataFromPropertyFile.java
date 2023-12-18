package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step 1 : Create object of FileInputStream
		FileInputStream fs = new FileInputStream("./PropertyFiles/CommonData.properties");
		
		//Step 2 : Create object of property file
		Properties ps = new Properties();
		ps.load(fs);
		
		//Step 3 : Call read method
		String url = ps.getProperty("pwd");
		System.out.println(url);
	}

}
