fun main() {
    val expenses = ExpenseManager()

    expenses.addExpense(Expense(10000, "Еда", "09.09.2019"))
    expenses.addExpense(Expense(5000, "Транспорт", "05.01.2023"))
    expenses.addExpense(Expense(250, "Еда", "19.02.2024"))

    expenses.printAllExpenses()

    val categoryTotals = expenses.totalByCategory()
    println("Общие по категории:")
    categoryTotals.forEach { (category, total) ->
        println("$category: $total")
    }
}