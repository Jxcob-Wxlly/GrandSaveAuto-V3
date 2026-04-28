package com.example.grandsaveauto2.ui.expenses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.grandsaveauto2.data.Expense
import com.example.grandsaveauto2.databinding.FragmentAddExpenseBinding
import com.example.grandsaveauto2.ui.history.ExpenseViewModel

class AddExpenseFragment : Fragment() {
    private var _binding: FragmentAddExpenseBinding? = null
    private val binding get() = _binding!!
    private val vm: ExpenseViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddExpenseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

            vm.addExpense(expense)

            // Navigate back to HistoryFragment after logging
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
