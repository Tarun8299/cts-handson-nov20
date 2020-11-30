import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	int ch;	
	Scanner scanner=new Scanner(System.in);
	Service service=new Service();
	do {
		System.out.println("1.	Add account\r\n" + 
				"2.	Remove account by account number\r\n" + 
				"3.	Display account by account number\r\n" + 
				"4.	Display all account by account number\r\n" + 
				"5.	Display those account having the balance less than 1000\r\n" + 
				"6.	Exit\r\n" + 
				"");
            System.out.println("Your Choice :"); 
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                  try { 
                	  service.addAccount();}
                  catch (AccountAlreadyException e) {
					System.out.println("Account already exists");
				}
                		break;
                case 2:
                	  try {
                		  long accno;
                		  System.out.println("Acc no:");
                		  accno=scanner.nextLong();
                		  service.removeAccount(accno);;}
                      catch (AccountNotFoundException e) {
                    	  System.out.println("Account doesn't exists");
    				} 
                    break;

                case 3:
                	  try {
                		  long accno;
                		  System.out.println("Acc no:");
                		  accno=scanner.nextLong();
                		  service.getAccDetail(accno);}
                      catch (AccountNotFoundException e) {
                    	  System.out.println("Account doesn't exists");
    				}
                    break;

                case 4:
                    System.out.println(service.getAllAccDetails());;
                    break;

                case 5:
                	service.getAccbyBalance();
                    break;
            
                case 6:
                	System.out.println("Thank you!!");
                	break;
            }
        }
        while (ch != 6);
    }
	
			
	
}
