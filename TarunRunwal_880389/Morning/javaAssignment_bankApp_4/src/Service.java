import java.util.*;
public class Service {

ArrayList<Account> aList=new ArrayList<Account>();	
Account account=new Account();
Scanner scanner=new Scanner(System.in);

private long accno;
private String name;
private Double amount;

public void addAccount() throws AccountAlreadyException
{
System.out.println("Acc no:");
accno=scanner.nextLong();
if(aList.contains(accno))
{
throw new AccountAlreadyException();
}
else {
System.out.println("Name:");
scanner.nextLine();
name=scanner.nextLine();
System.out.println("Amount:");
amount=scanner.nextDouble();
aList.add(new Account(accno,name,amount));
}
}
public void removeAccount(long accno) throws AccountNotFoundException
{
Boolean check=aList.removeIf(ac->ac.getAccno()==accno);
if(check==false)
{
throw new AccountNotFoundException();
}
}
public void getAccDetail(long accno) throws AccountNotFoundException
{		
	int countt=0;
for(Account ac:aList)
{
if(ac.getAccno()==accno)
{
System.out.println(ac.toString());
countt=1;
}
}
if(countt==0)
throw new AccountNotFoundException();

}
public void getAccbyBalance()
{
	for(Account ac:aList)
	{
	if(ac.getAmount()<1000)
	{
	System.out.println(ac.toString());
	}
	}
	
}
public String getAllAccDetails()
{
 return aList.toString();
}
}

