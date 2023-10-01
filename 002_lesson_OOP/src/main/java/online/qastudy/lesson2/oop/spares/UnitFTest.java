package online.qastudy.lesson2.oop.spares;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitFTest {
    private UnitF account;

    //Создал переменную, где задается номер аакаунта и его баланс
    @Before
    public void setUp() {
        account = new UnitF("12345", 1000);
    }

    //Тест проверяет заданный баланс аккаунта
    @Test
    public void testInitialBalance() {
        Assert.assertEquals(1000, account.getBalance());
    }

    //Тест задает новй баланс и првоеряет его
    @Test
    public void testSetBalance() {
        account.setBalance(2000);
        Assert.assertEquals(2000, account.getBalance());
    }

    //Тест добавляет сумму к балансу
    @Test
    public void testCredit() {
        account.credit(500);
        Assert.assertEquals(1500, account.getBalance());
    }

    //Тест отнимает сумму и проверяет полученый баланс
    @Test
    public void testDebitWithSufficientBalance() {
        account.debit(500);
        Assert.assertEquals(500, account.getBalance());
    }

    //Тест отнимает сумму больше баласна и проверяет полученый баланс
    @Test
    public void testDebitWithInsufficientBalance() {
        account.debit(2000);
        Assert.assertEquals(1000, account.getBalance());
    }

    //Тест пытается прибавить отрицательнуую сумму
    @Test
    public void testCreditWithNegativeAmount() {
        account.credit(-200);
        Assert.assertEquals(1000, account.getBalance());
    }

    //Тест пытается отнять отрицательнуую сумму
    @Test
    public void testDebitWithNegativeAmount() {
        account.debit(-200);
        Assert.assertEquals(1000, account.getBalance());
    }

    //Тест создает новый аккаунт с нулевым балансом
    @Test
    public void testCreateAccountWithDefaultBalance() {
        UnitF newAccount = new UnitF("54321", 0);
        Assert.assertEquals(0, newAccount.getBalance());
    }

    //Тест пытается отнять нулевую сумму
    @Test
    public void testDebitWithZeroAmount() {
        account.debit(0);
        Assert.assertEquals(1000, account.getBalance());
    }
}