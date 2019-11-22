package calculator;

public class Menu {

    public boolean isKeyInputValid(int key) {
        int[] menuKeys = {1, 2, 3, 4, 5, 6, 0};
        for(int menuKey : menuKeys) {
            if(menuKey == key) {
                return true;
            }
        }
        return false;
    }

    public void printConsoleMenu() {
        System.out.println("Please chose your operation...");
        String[] menu = {
                "1. SUM (a, b)",
                "2. MINUS (a, b)",
                "3. DIVIDE (a, b)",
                "4. MULT (a, b)",
                "5. MS",
                "6. M+",
                "7. M-",
                "0. EXIT"
        };
        for (String menuItem : menu) {
            System.out.println(menuItem);
        }
    }
}
