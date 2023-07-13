import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Hannah", "Adams", "04-02-2001", 12345, 100.00);
    }

//    Methods

    @Test
    public void canDeposit(){
        bankAccount.deposit(100.00);
        assertThat(bankAccount.getBalance()).isEqualTo(200.00);
    }

    @Test
    public void canWithdraw(){
        bankAccount.withdrawal(100.00);
        assertThat(bankAccount.getBalance()).isEqualTo(0.00);
    }

    @Test
    public void canPayInterest(){
        bankAccount.payInterest(0.2);
        assertThat(bankAccount.getBalance()).isEqualTo(120.00);
    }


//    getters and setters

    @Test
    public void hasFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Hannah");
    }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Conlan");
        assertThat(bankAccount.getFirstName()).isEqualTo("Conlan");
    }

    @Test
    public void hasLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Adams");
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Roberts");
        assertThat(bankAccount.getLastName()).isEqualTo("Roberts");
    }

    @Test
    public void hasDateofBirth(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("04-02-2001");
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("03-03-2001");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("03-03-2001");
    }

    @Test
    public void hasAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(12345);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(54321);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(54321);
    }

    @Test
    public void hasBalance(){
        assertThat(bankAccount.getBalance()).isEqualTo(100.00);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(200.00);
        assertThat(bankAccount.getBalance()).isEqualTo(200.00);
    }
}
