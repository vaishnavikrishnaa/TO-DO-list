import java.util.ArrayList;
import java.util.Scanner;

public class main {
    private ArrayList<String> todoList = new ArrayList<>();

    public static void main(String[] args) {
        to_do_list app = new to_do_list();
        app.manageTodoList();
    }

    public void manageTodoList() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    removeTask(scanner);
                    break;
                case 3:
                    displayTasks();
                    System.out.println("...");
                    break;
                case 4:
                    System.out.println("Exiting the TODO List Application. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("TODO List Menu:");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. Display tasks");
        System.out.println("4. Exit");
    }

    private void addTask(Scanner scanner) {
        String task = scanner.nextLine();
        todoList.add(task);
        System.out.println("Task added successfully!");
        System.out.println("...");
    }

    private void removeTask(Scanner scanner) {
        int index = scanner.nextInt();
        scanner.nextLine(); // consume newline
        if (index >= 1 && index <= todoList.size()) {
            todoList.remove(index - 1);
            System.out.println("Task removed successfully!");
            System.out.println("...");
        } else {
            System.out.println("Invalid task number!");
            System.out.println("...");
        }
    }

    private void displayTasks() {
        System.out.println("TODO List:");
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i));
        }
    }
}


