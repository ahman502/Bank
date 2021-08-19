public class CheckingAccount{

  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.03;
  }

  public int getBalance(){
    return this.balance;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
    System.out.println("Account's new owner: " + newName);
  }

  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonlthlyInterest(){
    return this.interestRate * this.balance;
  }

}
