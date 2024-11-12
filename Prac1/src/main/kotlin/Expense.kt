class Expense {
    val spent: Int
    val category: String
    val date: String

    constructor(spent: Int, category: String, date: String){
        this.spent = spent
        this.category = category
        this.date = date
    }

    constructor(_spent: Int, _category: String, _date: String, pr: Int) {
        spent = _spent
        category = _category
        date = _date
    }
    fun printExpense() {
        println("Сумма: $spent, Категория: $category, Дата: $date")
    }
}

