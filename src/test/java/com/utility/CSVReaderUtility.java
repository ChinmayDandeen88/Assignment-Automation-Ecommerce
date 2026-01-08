package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.ui.pojo.User;

public class CSVReaderUtility {

	public static Iterator<User> readCSVFile(String fileName) {
		
		File csvFile = new File(System.getProperty("user.dir") + "//testData//" + fileName);
		FileReader fileReader = null; // declaration should be always outside try catch block
		CSVReader csvReader;
		String[] line;
		List<User> userList = null;
		User userData;
		
		try {
			 fileReader = new FileReader(csvFile);
			 csvReader = new CSVReader(fileReader);
			 
			 csvReader.readNext(); // reads the column names -- Row 1
			 /* csvReader.readNext(); // reads Row 2
			 csvReader.readNext(); // reads row 3
			 
			 data = csvReader.readNext(); // reads Row 4 [if No ROW or we have reached the end of CSV file]*/
			 
			 userList = new ArrayList<User>();
			 
			 while((line = csvReader.readNext())!= null) { // here data is initializing & then doing null check
				 userData = new User(line[0],line[1]);
				 userList.add(userData);
			 }
			 
			 //System.out.println(Arrays.toString(data));
			/* for(User userData : userList) {
				 System.out.println(userData);
			 } */
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch (CsvValidationException | IOException e) {
			
			e.printStackTrace();
		}
		return userList.iterator();
	}
}
