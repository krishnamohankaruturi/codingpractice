package associations.composition;

public class BankAccount
{
    private  final Transaction transaction;

    BankAccount(Transaction transaction)
    {
        this.transaction = new Transaction();
    }

    void makepayment()
    {
        System.out.println("Payment Succesfull");
    }


}
