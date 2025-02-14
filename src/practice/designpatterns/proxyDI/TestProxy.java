package practice.designpatterns.proxyDI;

public class TestProxy {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccountProxy("alan", true);

        account1.withdrawmoney();

        BankAccount account2 = new BankAccountProxy("alan", false);
        account2.withdrawmoney();







    }
}
