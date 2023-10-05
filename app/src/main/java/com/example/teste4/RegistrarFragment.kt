package com.example.teste4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.teste4.databinding.FragmentRegistrarBinding
import androidx.navigation.fragment.findNavController

class RegistrarFragment : Fragment() {

    private var _binding: FragmentRegistrarBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRegistrarBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToRegistro.setOnClickListener {
            findNavController().navigate(R.id.action_registreseFragment_to_SecondFragment)
        }
        binding.btnCancelar.setOnClickListener {
            findNavController().navigate(R.id.action_registreseFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}