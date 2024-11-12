class ExpenseManager {
    private val expensesList = mutableListOf<Expense>()

    fun addExpense(expense: Expense) {
        expensesList.add(expense)
    }

    fun printAllExpenses() {
        expensesList.forEach { it.printExpense() }
    }

    fun totalByCategory(): Map<String, Double> {
        val categoryTotals = mutableMapOf<String, Double>()
        expensesList.forEach { expense ->
            categoryTotals[expense.category] = categoryTotals.getOrDefault(expense.category, 0.0) + expense.spent
        }
        return categoryTotals
    }
}