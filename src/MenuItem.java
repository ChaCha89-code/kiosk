public class MenuItem {
    // 속성
    private String burger;
    private Double price;
    private String burgerInfo;


    // 생성자
    public MenuItem(String burger, Double price, String burgerInfo) {
        this.burger = burger;
        this.price = price;
        this.burgerInfo = burgerInfo;
    }


    // 기능

    public String getBurger() {
        return burger;
    }

    public Double getPrice() {
        return price;
    }

    public String getBurgerInfo() {
        return burgerInfo;
    }

    public void printMenu(int numBurger) {
        System.out.println(numBurger + ". | " + this.burger + " | W " + this.price + " | " + this.burgerInfo);
    }

}
