package com.example.grandsaveauto.ui.history

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.grandsaveauto2.data.AppDatabase
import com.example.grandsaveauto2.data.Expense
import com.example.grandsaveauto2.data.ExpenseRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ExpenseViewModel(application: Application) : AndroidViewModel(application) {
    private val repo: ExpenseRepository

    val expenses = AppDatabase.getDatabase(application)
        .expenseDao()
        .getAllExpenses()
        .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    init {
        val dao = AppDatabase.getDatabase(application).expenseDao()
        repo = ExpenseRepository(dao)
    }

    fun addExpense(expense: Expense) {
        viewModelScope.launch {
            repo.insertExpense(expense)
        }
    }
}
binding.btnLogExpense.setOnClickListener {
    val amount = binding.etAmount.text.toString().toDoubleOrNull() ?: 0.0
    val category = binding.etCategory.text.toString()
    val description = binding.etDescription.text.toString()
    val wasteful = binding.cbWasteful.isChecked

    val expense = Expense(
        amount = amount,
        category = category,
        description = description,
        wasteful = wasteful
    )

    val vm = ViewModelProvider(this)[ExpenseViewModel::class.java]
    vm.addExpense(expense)
    finish() // return to history/home
}

