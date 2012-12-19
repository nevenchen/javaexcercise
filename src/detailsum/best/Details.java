package detailsum.best;


public class Details implements IDetails{
	private double balance;
	private double fixed;
	private double variable;
	private double spendDown;
	
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * @return the fixed
	 */
	public double getFixed() {
		return fixed;
	}
	
	/**
	 * @param fixed the fixed to set
	 */
	public void setFixed(double fixed) {
		this.fixed = fixed;
	}
	
	/**
	 * @return the variable
	 */
	public double getVariable() {
		return variable;
	}
	
	/**
	 * @param variable the variable to set
	 */
	public void setVariable(double variable) {
		this.variable = variable;
	}
	
	/**
	 * @return the spendDown
	 */
	public double getSpendDown() {
		return spendDown;
	}
	
	/**
	 * @param spendDown the spendDown to set
	 */
	public void setSpendDown(double spendDown) {
		this.spendDown = spendDown;
	}
}
