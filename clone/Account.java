package clone;

public class Account {
    private String accountNumber;
    private String Name;
    private String password;
    private int balance;
    public Account() {

    }
    // 매개변수 생성기
    public Account(String accountNumber, String Name, String password, int balance) {
        this.accountNumber = accountNumber;
        this.Name = Name;
        this.password = password;
        this.balance = balance;
    }
}
