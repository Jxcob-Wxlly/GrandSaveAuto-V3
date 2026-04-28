package com.example.grandsaveauto.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.grandsaveauto.databinding.ActivityHomeBinding
import com.example.grandsaveauto.ui.expenses.AddExpenseActivity
import com.example.grandsaveauto.ui.budget.BudgetActivity
import com.example.grandsaveauto.ui.reminders.ReminderActivity
import com.example.grandsaveauto.ui.history.HistoryActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddExpense.setOnClickListener {
            startActivity(Intent(this, AddExpenseActivity::class.java))
        }
        binding.btnCategories.setOnClickListener {
            startActivity(Intent(this, BudgetActivity::class.java))
        }
        binding.btnExpenseHistory.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }
        binding.btnBudgetSetup.setOnClickListener {
            startActivity(Intent(this, BudgetActivity::class.java))
        }
    }
}
