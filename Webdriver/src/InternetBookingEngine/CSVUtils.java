package InternetBookingEngine;

//import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.regex.Pattern;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;


//public class CSVUtils {
//	final static String regex = "[,]";
//	final static String string = "Tuesday, October 4, 2016";
//	final static String subst = "";

//	final static Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//	final static Matcher matches = pattern.matcher(string);
//	// The substituted value will be contained in the result variable
//	final static String result = matches.replaceAll(subst);
//	private static String csvFile = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\TestReservation3.csv";
//	private static BufferedReader br = null;
////	private static String line = "";
//	
//	public static void main(String[] args) throws IOException{
//		System.out.println("Substitution result: " + result);
//		System.out.println(string.replace(",", ","));
//
//		FileWriter writer;
//		writer = new FileWriter(csvFile);		
//		writer.write("\"Tuesday, October 4, 2016, Andie Umilda sample only\"");
//		writer.write("\r\n");
//		writer.append("\"Tuesday, October 4, 2016, Jason Ogayon\"");
//		writer.write(",");
//		writer.flush();
//		writer.close();		


		
//		try{
//			br = new BufferedReader(new FileReader("E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\TestReservation3.csv"));
//			System.out.println(br.readLine());
//			while((line = br.readLine())!=null){
//				
//			}
//
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//
//}


//private static Calendar now;
//private static String get_day;
//private static DateFormat date_format = new SimpleDateFormat("yyyyMMdd.HHmm");
//


//public static void main(String[] args) throws IOException{
//	
//	now = Calendar.getInstance();
//	Date complete_date_1 = now.getTime();
//	get_day = date_format.format(complete_date_1); 
//	System.out.println(String.valueOf(get_day));
//}
//


//final static String regex = "[,]";
//final static String string = "Tuesday, October 4, 2016";
//final static String subst = "";
//
//final static Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//final static Matcher matches = pattern.matcher(string);
//// The substituted value will be contained in the result variable
//final static String result = matches.replaceAll(subst);
//
//private static String csvFile = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\TestReservation3.csv";
//
//public static void main(String[] args) throws IOException{
//	System.out.println("Substitution result: " + result);
//	System.out.println(string.replace(",", ","));
//	
//	FileWriter writer;
//	writer = new FileWriter(csvFile);		
//	writer.write("\"Tuesday, October 4, 2016, Andie Umilda\"");
//	writer.write(",");
//	writer.append("\"Tuesday, October 4, 2016, Jason Ogayon\"");
//	writer.write(",");
//	writer.flush();
//	writer.close();		

//	System.out.println(string.replace(",", ""));
//	String path = "E:\\1\\eclipse-jee-luna-SR2-win32\\eclipse\\EclipseCsfFile\\TestReservation3.csv";
//	try {
//		ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
//		HashMap<String, String> map;
//
//		/*** Rows 1 ***/
//		map = new HashMap<String, String>();
//		map.put("CustomerID","C001");
//		map.put("Name", "Win Weerachai");
//		map.put("Email", "win.weerachai@thaicreate.com");
//		map.put("CountryCode", "TH");
//		myArrList.add(map);
//
//		FileWriter writer;
//		writer = new FileWriter(path, true);  //True = Append to file, false = Overwrite
//		
//		for (int i = 0; i < myArrList.size(); i++) { 
//			writer.write(myArrList.get(i).get("CustomerID").toString());
//			writer.write(",");
//			writer.write(myArrList.get(i).get("Name").toString());
//			writer.write(",");
//			writer.write(myArrList.get(i).get("Email").toString());
//			writer.write(",");
//			writer.write(myArrList.get(i).get("CountryCode").toString());
//			writer.write(",");
//			writer.write("\r\n");
//		}
//		System.out.println("Write success!");
//		writer.close();
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();			
//	}
