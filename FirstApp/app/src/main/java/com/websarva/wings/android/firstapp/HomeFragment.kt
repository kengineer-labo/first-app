package com.websarva.wings.android.firstapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.websarva.wings.android.firstapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)

        when(binding){

        }

        binding.item1.setOnClickListener {  }
        binding.item2.setOnClickListener {  }
        binding.item3.setOnClickListener {  }
        binding.item4.setOnClickListener {  }
        binding.item5.setOnClickListener {  }
        binding.item6.setOnClickListener {  }
        binding.item7.setOnClickListener {  }
        binding.item8.setOnClickListener {  }
        binding.item9.setOnClickListener {  }
        binding.item10.setOnClickListener {  }
        binding.item11.setOnClickListener {  }
        binding.item12.setOnClickListener {  }
    }
}