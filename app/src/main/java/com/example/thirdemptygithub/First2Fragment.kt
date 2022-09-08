@file:Suppress("RedundantNullableReturnType", "RedundantNullableReturnType")

package com.example.thirdemptygithub

//import androidx.navigation.NavController.navigate
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.thirdemptygithub.databinding.FragmentFirst2Binding

class First2Fragment : Fragment() {
    private lateinit var binding: FragmentFirst2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirst2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonFirst.setOnClickListener {
            NavHostFragment.findNavController(this@First2Fragment)
                .navigate(R.id.action_First2Fragment_to_Second2Fragment)
        }
    }

}