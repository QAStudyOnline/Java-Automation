package online.qastudy.lesson2.oop.spares;

public class UnitF {
    private String accountNumber;
    private int balance;

    public UnitF(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Сумма снятия больше чем остаток на счету!");
        }
    }

    public static void main(String[] args) {
        UnitF account = new UnitF("12345", 1000);
        System.out.println("Исходный баланс: $" + account.balance);

        account.credit(550);
        System.out.println("Баланс после пополнения: $" + account.balance);

        account.debit(2000);
        System.out.println("Баланс после снятия: $" + account.balance);

        account.debit(1000); // Этот вызов должен вывести сообщение об ошибке
    }
}
