import java.util.Scanner;
import java.util.List;

public class Kiosk {
    // Field
        // List<MenuItems> menuItems to store the menu.
    private List<MenuItem> menuItems;
    private Scanner scanner = new Scanner(System.in);

    // Constructor
        // Accepts menuItems from outside (e.g., main) and stores them.
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // Method
        // Start() controls the entire interaction flow: shows menu, handles user input, reacts accordingly.
    public void start() {

        while(true) {
            System.out.println("\n[ SHAKESHACK MENU ]");

            for (int i = 0; i < menuItems.size(); i++) {
                menuItems.get(i).printMenu(i + 1);
            }

            System.out.print("주문하고 싶은 햄버거의 숫자를 입력하세요 (1 ~ " + menuItems.size() + ", 종료는 0): ");
            int selection = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            if (selection == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (selection >= 1 && selection <= menuItems.size()) {
                System.out.println("\n선택하신 메뉴:");
                menuItems.get(selection - 1).printMenu(selection);
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }

    }

}
