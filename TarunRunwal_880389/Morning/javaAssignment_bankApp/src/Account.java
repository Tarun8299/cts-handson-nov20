public class Account {

private long accno;
private String name;
private Double amount;
public long getAccno() {
	return accno;
}
public void setAccno(long accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Account [accno=" + accno + ", name=" + name + ", amount=" + amount + "]";
}
public void setName(String name) {
	this.name = name;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public Account(long accno, String name, Double amount) {
	super();
	this.accno = accno;
	this.name = name;
	this.amount = amount;
}
public Account() {
	super();
}


}
