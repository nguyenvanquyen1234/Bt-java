import java.util.Scanner;

public class MainClass {
        public static void main(String[] args) {

            try {
                TpBank btComBank = new TpBank();
                Scanner input = new Scanner(System.in);

                while (true) {
                    System.out.println("Chọn một trong các tùy chọn sau:");
                    System.out.println("1. Tạo tài khoản");
                    System.out.println("2. Hiển thị tài khoản");
                    System.out.println("3. Tìm kiếm tên");
                    System.out.println("4. Rút tiền bằng mã pin");
                    System.out.println("5. Gửi tiền bằng mã pin");
                    System.out.println("6. Thoát");

                    int choice = input.nextInt();
                    input.nextLine(); // Consume newline

                    switch (choice) {
                        case 1:
                            btComBank.createAccount();
                            break;
                        case 2:
                            btComBank.displayAll();
                            break;
                        case 3:
                            System.out.print("Nhập tên cần tìm kiếm: ");
                            String name = input.nextLine();
                            btComBank.findAccountByName(name);
                            break;
//                        case 4:
//                            System.out.print("Nhập mã pin: ");
//                            int pin = input.nextInt();
//                            btComBank.withdraw(pin);
//                            break;
//                        case 5:
//                            System.out.print("Nhập mã pin: ");
//                            int pinDeposit = input.nextInt();
//                            btComBank.deposit(pinDeposit);
//                            break;
//                        case 6:
//                            System.out.println("Cảm ơn bạn đã sử dụng dịch vụ của chúng tôi.");
//                            System.exit(0);
//                        default:
//                            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    }
                }

            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }


