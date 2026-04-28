package com.example.grandsaveauto2.ui.reminders

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.grandsaveauto2.databinding.ActivityReminderBinding

class ReminderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReminderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReminderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddReminder.setOnClickListener {
            // TODO: Add reminder logic
        }
    }
}
