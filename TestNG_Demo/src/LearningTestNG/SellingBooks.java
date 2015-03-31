package LearningTestNG;
import org.testng.annotations.Test;

import java.util.HashMap;

import org.testng.annotations.DataProvider;


public class SellingBooks {
@Test
public void BookSale()
{
	System.out.println("Book Sale has  started");
}

@Test(dataProvider="CustormerData")
public void CustormerName(String Name,String BookName)
{
	System.out.println("Customer Name: "+ Name +'\t'+ "Book Name: " +BookName);
}

@DataProvider
public Object[][] CustormerData(){
	Object[][] Data = new Object[2][2]; 
	Data[0][0] = "Gulshan";
	Data[0][1] = "Book1";
	
	Data[1][0] = "Naresh";
	Data[1][1] = "Book2";
	
	return Data;
}
}
