import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;
//import java.sql.*;

public class Question1 {
	//@SuppressWarnings("deprecation")
	public static void answer1()
	{
		ArrayList<Account> list1= new ArrayList<Account>();
		list1.add(new Account("John",new BigInteger("123456789012345"),"Deposit",LocalDate.parse("2010-01-01"),'A',"Main",new BigDecimal("10000.00")));	
		list1.add(new Account("Jacob",new BigInteger("123456789012346"),"Deposit",LocalDate.parse("2014-06-01"),'C',"Main",new BigDecimal("15000.00")));	
		list1.add(new Account("Joy",new BigInteger("123456789012347"),"Deposit",LocalDate.parse("2016-04-01"),'A',"Authorized",new BigDecimal("25000.00")));	
		list1.add(new Account("Joseph",new BigInteger("123456789012348"),"Deposit",LocalDate.parse("2018-01-01"),'A',"Main",new BigDecimal("15000.00")));	
		list1.add(new Account("Jessica",new BigInteger("123456789012349"),"PersonalLoan",LocalDate.parse("2018-12-17"),'A',"Authorized",new BigDecimal("40000.00")));	
		list1.add(new Account("Jins",new BigInteger("123456789012350"),"PersonalLoan",LocalDate.parse("2015-06-01"),'F',"Main",new BigDecimal("45000.00")));	
		list1.add(new Account("Johny",new BigInteger("123456789012351"),"PersonalLoan",LocalDate.parse("2012-05-01"),'C',"Main",new BigDecimal("55000.00")));	
		list1.add(new Account("Maria",new BigInteger("123456789012352"),"HomeLoan",LocalDate.parse("2010-06-01"),'A',"Main",new BigDecimal("65000.00")));	
		list1.add(new Account("Laura",new BigInteger("123456789012353"),"HomeLoan",LocalDate.parse("2014-01-01"),'A',"Main",new BigDecimal("75000.00")));	
		list1.add(new Account("Alan",new BigInteger("123456789012354"),"StudentLoan",LocalDate.parse("2015-05-01"),'A',"Main",new BigDecimal("35000.00")));	
		
		// implements Comparable<Account>
		
		System.out.println("Ascending");
		//https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
		list1.sort((Account a1, Account a2)->(a1.getAccountOpenDate().compareTo(a2.getAccountOpenDate())));
		list1.forEach((account)->System.out.println(account.getName()+" "+account.getAccountNumber()+" "+account.getAccountType1()+" "+account.getAccountOpenDate()+" "+account.getStatus()+" "+account.getAccountType2()+" "+account.getNumber()));
		//System.out.println(list1);
		
		
		//https://stackoverflow.com/questions/1946668/sorting-using-comparator-descending-order-user-defined-classes
		System.out.println("Descending");
		list1.sort((Account a1, Account a2)->(a2.getAccountOpenDate().compareTo(a1.getAccountOpenDate())));
		list1.forEach((account)->System.out.println(account.getName()+" "+account.getAccountNumber()+" "+account.getAccountType1()+" "+account.getAccountOpenDate()+" "+account.getStatus()+" "+account.getAccountType2()+" "+account.getNumber()));
		
	}

	
	
}
