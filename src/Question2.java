import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;

public class Question2 {
	public static void answer2()
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
		
		list1.forEach((account)->{
			if(!account.getAccountType1().equals("Deposit"))
			System.out.println(account.getName()+" "+account.getAccountNumber()+" "+account.getAccountType1()+" "+account.getAccountOpenDate()+" "+account.getStatus()+" "+account.getAccountType2()+" "+account.getNumber());});
		
	}

}
