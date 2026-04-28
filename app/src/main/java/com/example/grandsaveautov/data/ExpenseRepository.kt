package com.example.grandsaveauto.data

class ExpenseRepository(private val dao: ExpenseDao) {
    fun getAllExpenses() = dao.getAllExpenses()
    suspend fun insertExpense(expense: Expense) = dao.insertExpense(expense)
}
