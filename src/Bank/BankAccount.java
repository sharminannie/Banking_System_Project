package Bank;
import java.util.Random;
public class BankAccount 
{
 Random rand = new Random();
 String name;
 public String accNum;
 double balance;
 public BankAccount(String name,double balance)
 {
 	this.name=name;
 	this.accNum="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
 	this.balance=balance;
 }
 public void deposit(double depAmount)
 {
 	balance=balance+depAmount;
 }
 public void withdraw(double withAmount) 
 {
	 if(balance>=withAmount) 
 	{
 		balance=balance-withAmount;
 	}
 }
 public double getBalance()
 {
 	return balance;
 }
 public String toString()
 {
	 return String.format("Name:%s, AccNum:%s, Balance:%.2f",name,accNum,balance);
 }
}



