class Account {
    private String account_no;
    private String customer_name;
    private String address;
    private String phone_no;
    private String date_of_birth;
    protected long balance;

    public Account(String ac_no, String c_name, String add, String phn, String d_o_b, long blnc) {
        account_no = ac_no;
        customer_name = c_name;
        address = add;
        phone_no = phn;
        date_of_birth = d_o_b;
        balance = blnc;
    }

    public String get_account_number() {
        return account_no;
    }

    public String get_customer_name() {
        return customer_name;
    }

    public String get_address() {
        return address;
    }

    public String get_phone_number() {
        return phone_no;
    }

    public String get_date_of_birth() {
        return date_of_birth;
    }

    public long get_balance() {
        return balance;
    }

    public void set_address(String add) {
        address = add;
    }

    public void set_phone_no(String phn) {
        phone_no = phn;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String ac_no, String c_name, String add, String phn, String d_o_b, long blnc) {
        super(ac_no, c_name, add, phn, d_o_b, blnc);
    }

    public void deposit(long amnt) {
        balance += amnt;
    }

    public void withdraw(long amnt) {
        balance -= amnt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String ac_no, String c_name, String add, String phn, String d_o_b, long blnc) {
        super(ac_no, c_name, add, phn, d_o_b, blnc);
    }

    public void payEMI(long amnt) {
        balance -= amnt;
    }

    public void repayment(long amnt) {
        if (balance == amnt) {
            balance = 0;
        }
    }
}

public class account_challenge {
    public static void main(String[] args) {
        Account ac = new Account("1234", "Anushree", "Kolkata", "7980470688", "13-01-1999", 2000);
        SavingsAccount savingsAc = new SavingsAccount("1235", "Anushree", "Kolkata", "7980470688", "13-01-1999", 2000);
        LoanAccount loanAc = new LoanAccount("1236", "Anushree", "Kolkata", "7980470688", "13-01-1999", 2000);
    
        System.out.println("Account Balance : " + ac.get_balance());
        System.out.println("Savings Account Balance : " + savingsAc.get_balance());
        System.out.println("Loan Account Balance : " + loanAc.get_balance());
    
        savingsAc.deposit(500);
        loanAc.payEMI(1000);
    
        System.out.println("Savings Account Balance after deposit : " + savingsAc.get_balance());
        System.out.println("Loan Account Balance after EMI payment : " + loanAc.get_balance());
    }
    
}