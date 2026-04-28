package com.example.grandsaveauto2.ui.common

import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.example.grandsaveauto2.R
import com.example.grandsaveauto2.ui.home.HomeActivity
import com.example.grandsaveauto2.ui.history.HistoryActivity
import com.example.grandsaveauto2.ui.budget.BudgetActivity

fun AppCompatActivity.setupBottomNav(bottomNav: BottomNavigationView) {
    bottomNav.setOnItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                if (this !is HomeActivity) {
                    startActivity(Intent(this, HomeActivity::class.java))
                    finish()
                }
                true
            }
            R.id.nav_history -> {
                if (this !is HistoryActivity) {
                    startActivity(Intent(this, HistoryActivity::class.java))
                    finish()
                }
                true
            }
            R.id.nav_budget -> {
                if (this !is BudgetActivity) {
                    startActivity(Intent(this, BudgetActivity::class.java))
                    finish()
                }
                true
            }
            else -> false
        }
    }
}
