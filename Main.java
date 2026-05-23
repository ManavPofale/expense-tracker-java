package expensetracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();
        int choice;

        System.out.println("==========================================");
        System.out.println("         WELCOME TO EXPENSE TRACKER      ");
        System.out.println("==========================================");

        do {
            System.out.println("\n======= EXPENSE TRACKER MENU =======");
            System.out.println("  1. Add Expense");
            System.out.println("  2. View All Expenses");
            System.out.println("  3. Delete Expense");
            System.out.println("  4. Show Summary");
            System.out.println("  5. Exit");
            System.out.println("=====================================");
            System.out.print("  Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {

                case 1:
                    System.out.println("\n--- Add New Expense ---");
                    System.out.print("Enter Amount (Rs.): ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Category (Food / Travel / Shopping / Bills / Other): ");
                    String category = scanner.nextLine();

                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();

                    manager.addExpense(amount, category, description);
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    System.out.print("\nEnter Expense ID to delete: ");
                    int id = scanner.nextInt();
                    manager.deleteExpense(id);
                    break;

                case 4:
                    manager.showSummary();
                    break;

                case 5:
                    System.out.println("\nThank you for using Expense Tracker. Goodbye!");
                    break;

                default:
                    System.out.println("\n✘ Invalid choice! Please enter 1-5.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
