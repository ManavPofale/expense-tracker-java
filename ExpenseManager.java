package expensetracker;

import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();

    // Add a new expense
    public void addExpense(double amount, String category, String description) {
        Expense expense = new Expense(amount, category, description);
        expenses.add(expense);
        System.out.println("\n✔ Expense added successfully!");
    }

    // View all expenses
    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("\n No expenses found. Start adding some!");
            return;
        }

        System.out.println("\n---------- YOUR EXPENSES ----------");
        for (Expense e : expenses) {
            System.out.println(e);
        }
        System.out.println("-----------------------------------");
    }

    // Delete expense by ID
    public void deleteExpense(int id) {
        boolean found = false;

        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getId() == id) {
                expenses.remove(i);
                found = true;
                System.out.println("\n✔ Expense with ID " + id + " deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("\n✘ No expense found with ID: " + id);
        }
    }

    // Show summary
    public void showSummary() {
        if (expenses.isEmpty()) {
            System.out.println("\n No expenses to summarize.");
            return;
        }

        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }

        System.out.println("\n========== SUMMARY ==========");
        System.out.println(" Total Expenses : " + expenses.size());
        System.out.printf(" Total Spent    : Rs. %.2f%n", total);
        System.out.println("==============================");
    }
}
