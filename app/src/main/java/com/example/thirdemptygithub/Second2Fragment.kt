package com.example.thirdemptygithub

//import androidx.navigation.NavController.navigate
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.thirdemptygithub.databinding.FragmentSecond2Binding

class Second2Fragment : Fragment() {
    private lateinit var binding: FragmentSecond2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecond2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSecond.setOnClickListener {
            NavHostFragment.findNavController(this@Second2Fragment)
                .navigate(R.id.action_Second2Fragment_to_First2Fragment)
        }
    }

}