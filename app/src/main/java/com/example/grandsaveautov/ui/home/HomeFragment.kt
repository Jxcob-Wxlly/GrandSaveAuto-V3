package com.example.grandsaveauto2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.grandsaveauto2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAddExpense.setOnClickListener {
            findNavController().navigate(R.id.addExpenseFragment)
        }


        binding.btnCategories.setOnClickListener {
            findNavController().navigate(R.id.budgetFragment)
        }

        binding.btnExpenseHistory.setOnClickListener {
            findNavController().navigate(R.id.historyFragment)
        }

        binding.btnBudgetSetup.setOnClickListener {
            findNavController().navigate(R.id.budgetFragment)
        }
        binding.btnReminders.setOnClickListener {
            findNavController().navigate(R.id.remindersFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
