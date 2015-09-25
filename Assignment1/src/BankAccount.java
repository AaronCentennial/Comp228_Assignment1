/**
 * Created by Aaron Fernandes.
 */
public class BankAccount {
	private int _accountNumber;
	private String _ownersName;
	private double _balance;

	BankAccount(int accountNumber, String ownersName, double balance){
		this._accountNumber=accountNumber;
		this._ownersName=ownersName;
		this._balance=balance;
	}

	// gettter for account num
	public int get_accountNumber(){return this._accountNumber;}

	// gettter and settter for owner Name
	public String get_ownersName(){return this._ownersName;}

	// gettter and settter for owner Name
	public double get_balance(){return this._balance;}

	//withdraw method
	public double withdraw(double amount){
		if (amount>this._balance && amount>0){
			return -1;
		}
		else {
			this._balance-=amount;
		}
		return 0;
	}

	//deposit method
	public double deposit(double amount){
		if(amount>0){
			return this._balance+=amount;
		}
		else {
			return -1;
		}

	}

	public String getAccountInfo(){
		return String.format("%s [accnum: %d]%nAccount Balance: $%.2d", this._ownersName, this._accountNumber,this._balance);
	}

}
