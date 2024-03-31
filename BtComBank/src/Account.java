import java.util.Scanner;

public class Account {
    private String name;
    private String email;
    private int balance;
    private String pin;

    public Account(String name, String email, int balance, String pin) {
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.pin = pin;
    }

    public void display() {
        System.out.println("---- Thông tin tài khoản ----");
        System.out.println("Tên: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Số dư: " + this.balance);
        System.out.println("PIN: " +this.getPin());
    }

    public void inputData() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = input.nextLine();

        if (name.isEmpty()) {
            throw new Exception("Tên không được để trống");
        }
        this.name = name;

        System.out.print("Nhập email: ");
        String email = input.nextLine();

        if (email.isEmpty()) {
            throw new Exception("Email không được để trống");
        }
        this.email = email;

        try {
            System.out.print("Nhập số dư: ");
            int amount = input.nextInt();
            if (amount < 0) {
                throw new Exception("Số tiền không được nhỏ hơn 0");
            }
            this.balance = amount;
        } catch (Exception e) {
            throw new Exception("Số tiền không hợp lệ");
        }
    }

    public void withdraw(int amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Số tiền rút phải lớn hơn 0");
        }
        if (amount > this.balance) {
            throw new Exception("Số tiền rút vượt quá số dư hiện tại");
        }
        this.balance -= amount;
        System.out.println("Rút tiền thành công.");
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Số tiền gửi phải lớn hơn 0");
            return;
        }
        this.balance += amount;
        System.out.println("Gửi tiền thành công.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
