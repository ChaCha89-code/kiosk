import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShack = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamBurger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        List<MenuItem> menuItems = new ArrayList<>(10);
        menuItems.add(shackBurger);
        menuItems.add(smokeShack);
        menuItems.add(cheeseBurger);
        menuItems.add(hamBurger);

        while(true) {
            System.out.println("[ SHAKESHACK MENU ]");

            System.out.print("주문하고 싶은 햄버거의 숫자를 입력하세요(1 ~ 4): ");
            int numBurger = scanner.nextInt();
            scanner.nextLine();
            if(numBurger < 5) {
                menuItems.get(numBurger - 1).printMenu(numBurger);
            } else {
                System.out.println("숫자 1에서 4번까지만 입력하세요!");
            }

            System.out.print("종료를 원하시면 0을 입력하세요: ");
            int numExit = scanner.nextInt();
            scanner.nextLine();

            if (numExit == 0) {
                break;
            }
        }

    }
}