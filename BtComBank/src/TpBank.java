import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TpBank {

    // Tạo danh sách mảng chứa đối tượng Account
    List<Account> accountList = new ArrayList<Account>();

    // Constructor
    public TpBank() {
        accountList.add(new Account("Quyen", "vanquyen@gamil.com", 242005, "88"));
        accountList.add(new Account("Tanquoc", "Tanquoc@gmail.com", 1882024, "88"));
    }

    public void createAccount() throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập tên tài khoản: ");
        String name = input.nextLine();

        System.out.print("Nhập email: ");
        String email = input.nextLine();

        System.out.print("Nhập số dư: ");
        int balance = input.nextInt();

        System.out.print("Nhập pin: ");
        String pin = input.nextLine();

        Account account = new Account(name, email, balance, pin);
        accountList.add(account);
    }

    public void displayAll() {
        System.out.println("Danh sách tất cả các tài khoản:");
        for (Account account : accountList) {
            account.display();
        }
    }

    // Kiểm tra trả về
    public int sum(int a, int b) {
        return a + b;
    }

    public Account findAccountByName(String name) {
        for (Account account : accountList) {
            if (account.getName().equals(name)) {
                return account;
            }
        }
        return null;
    }
}
