public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank() {
    accountOne = new CheckingAccount("Zeus", 160, "1");
    accountTwo = new CheckingAccount("Hades", 470, "2");
  }

  public static void main(String[] args){

    Bank bankOfGods = new Bank();

     //Zeus's Accont Information

    System.out.println("----- " + bankOfGods.accountOne.getName() + "'s Account Information -----");

    System.out.println("The balance in " + bankOfGods.accountOne.getName() + "'s account is: $" + bankOfGods.accountOne.getBalance());

    bankOfGods.accountOne.setBalance(5000);

    System.out.println(bankOfGods.accountOne.getName() + "'s new balance is: $" + bankOfGods.accountOne.getBalance());

    System.out.println("Monthly interest rate is: $" +bankOfGods.accountOne.getMonlthlyInterest());

     bankOfGods.accountOne.setName("Athena");

    //Hades's Accont Information

    System.out.println("\n\n----- " + bankOfGods.accountTwo.getName() + "'s Account Information -----");

    System.out.println("The balance in " + bankOfGods.accountTwo.getName() + "'s account is: $" + bankOfGods.accountTwo.getBalance());

    bankOfGods.accountTwo.setBalance(2360);

    System.out.println("New balance is: $" + bankOfGods.accountTwo.getBalance());

    System.out.println("Monthly interest rate is: $" +bankOfGods.accountTwo.getMonlthlyInterest() + "\n");

  }

}
