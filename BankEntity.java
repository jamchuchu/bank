package Bank;

public class BankEntity {

	private long account;
	private String name;
	private int total;
	
	public BankEntity() {
	}

	public BankEntity(long account, String name, int total) {
		super();
		this.account = account;
		this.name = name;
		this.total = total;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccount() {
		return account;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "계좌번호=" + account +"\n"+ "예금주=" + name + "\n"+ "총예금=" + total + "\n";
	}
	
	
	
	
}
