package expensetracker;

public class Expense {

    private static int idCounter = 1; 

    private int id;
    private double amount;
    private String category;
    private String description;

    public Expense(double amount, String category, String description) {
        this.id = idCounter++;
        this.amount = amount;
        this.category = category;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public double getAmount() {
        return amount;
    }
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return String.format("[ID: %d] %-10s | Rs. %8.2f | %s",
                id, category, amount, description);
    }
}
