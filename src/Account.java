import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
//import java.util.Date;

public class Account {
	private String name;
	private BigInteger accountNumber; //length=15
	private String accountType1;//Deposit, Personal Loan, Home Loan, Student Loan
	private LocalDate accountOpenDate;//yyyy-MM-dd
	private char status;//A,C,F - Active, Closed, Freeze
	private String accountType2;//Main, Authorized
	private BigDecimal number; //Number(18,2)
	
	
	
	public Account(String name, BigInteger accountNumber, String accountType1, LocalDate accountOpenDate, char status,
			String accountType2, BigDecimal number) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountType1 = accountType1;
		this.accountOpenDate = accountOpenDate;
		this.status = status;
		this.accountType2 = accountType2;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigInteger getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType1() {
		return accountType1;
	}
	public void setAccountType1(String accountType1) {
		this.accountType1 = accountType1;
	}
	public LocalDate getAccountOpenDate() {
		return accountOpenDate;
	}
	public void setAccountOpenDate(LocalDate accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getAccountType2() {
		return accountType2;
	}
	public void setAccountType2(String accountType2) {
		this.accountType2 = accountType2;
	}
	public BigDecimal getNumber() {
		return number;
	}
	public void setNumber(BigDecimal number) {
		this.number = number;
	}
	
	
}
