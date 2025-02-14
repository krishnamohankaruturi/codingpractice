package practice.designpatterns.proxyDI;

public class RealBankAccount implements BankAccount{

    private  String accountHolder;

    public RealBankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public void withdrawmoney() {
        System.out.println(accountHolder+"whithdrawing money");

    }


}
