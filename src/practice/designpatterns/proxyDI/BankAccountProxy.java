package practice.designpatterns.proxyDI;

public class BankAccountProxy implements  BankAccount{
    private  RealBankAccount realBankAccount;
    private  String accountHolder;
    private boolean isAuthorized;


    public BankAccountProxy(String accountHolder, boolean isAuthorized) {
        this.accountHolder = accountHolder;
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void withdrawmoney() {
        if(isAuthorized)
        {
            if(realBankAccount == null)
            {
                realBankAccount = new RealBankAccount(accountHolder);
            }
            realBankAccount.withdrawmoney();
        }
        else {
            System.out.println("Unauthorized access denied for " + accountHolder);
        }

    }
}
