package com.example.grandsaveauto2.ui.expenses

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.grandsaveauto2.databinding.ActivityAddExpenseBinding

class AddExpenseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddExpenseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogExpense.setOnClickListener {
            // TODO: Save expense to RoomDB
        }
    }
}
