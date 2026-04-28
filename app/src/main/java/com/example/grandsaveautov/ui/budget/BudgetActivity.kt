package com.example.grandsaveauto.ui.budget

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.grandsaveauto2.databinding.ActivityBudgetBinding

class BudgetActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBudgetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBudgetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveBudget.setOnClickListener {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                binding = ActivityHomeBinding.inflate(layoutInflater)
                setContentView(binding.root)

                setupBottomNav(binding.bottomNav)
            }
        }
    }
}
