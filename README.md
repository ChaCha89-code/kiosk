# 🍔 Java Kiosk Console App (Refactored for OOP)

This is a simple **console-based hamburger kiosk** built in Java.  
It demonstrates the transition from a procedural structure (everything in `main`) to a more maintainable and scalable **object-oriented design** using classes like `MenuItem` and `Kiosk`.

---

## 📌 Goal

- Learn and apply **object-oriented programming** (OOP) concepts
- Structure the program with **clean separation of concerns**
- Improve code reusability and readability

---

## 🆚 Before vs. After Refactor

### ❌ Before (All Logic in `Main`)
- All menu logic, user input, and control flow were written inside the `main()` method.
- Difficult to scale, test, or reuse.
- Violated the **Single Responsibility Principle** — `Main` was doing everything.

```java
while(true) {
    System.out.println("[ SHAKESHACK MENU ]");
    // Hardcoded menu
    System.out.print("주문 번호 입력: ");
    int input = scanner.nextInt();
    // Logic to process input
}

✅ After (Using Kiosk Class)
Created a Kiosk class to handle menu display, input loop, and logic.

Main only sets up the menu and starts the program.

Improved modularity, readability, and maintainability.

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        // ... add burgers ...
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start(); // Now all logic lives in Kiosk class!
    }
}


📦 Class Structure
MenuItem.java
Encapsulates data about a single menu item (name, price, description).

public class MenuItem {
    private String burger;
    private Double price;
    private String burgerInfo;

    // Constructor and print method
}

Kiosk.java
Handles the main user interaction flow:

Displays the menu

Accepts and validates input

Displays chosen menu item

Handles graceful exit

public class Kiosk {
    private List<MenuItem> menuItems;

    public void start() {
        // while loop for interaction
    }
}

🏁 How to Run
1. Clone the repository:
git clone https://github.com/ChaCha89-code/java-kiosk-oop.git

2. Compile and run:
javac *.java
java Main

💡 Lessons Learned
How to refactor procedural code into object-oriented design

How to pass data into constructors and separate responsibilities

How to build maintainable console applications using Java

🚀 Future Improvements
Add drink and side menus

Order quantity and pricing calculation

Support multiple language menus

Save order history

📚 Keywords
OOP Java Console Application Kiosk Refactoring Class Design Scanner MenuItem
