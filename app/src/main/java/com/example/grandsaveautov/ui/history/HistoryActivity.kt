package com.example.grandsaveauto.ui.history

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grandsaveauto2.databinding.ActivityHistoryBinding

class HistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding
    private val vm: ExpenseViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvExpenses.layoutManager = LinearLayoutManager(this)

        vm.expenses.observe(this) { expenses ->
            binding.rvExpenses.adapter = ExpenseAdapter(expenses)
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityHomeBinding.inflate(layoutInflater)
                setContentView(binding.root)

                setupBottomNav(binding.bottomNav)
            }

        }
    }
}
