package com.example.raihan_mobile.Home

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.raihan_mobile.Home.pertemuan4.FourthActivity
import com.example.raihan_mobile.Home.pertemuan5.FifthActivity
import com.example.raihan_mobile.Home.pertemuan7.SeventhActivity
import com.example.raihan_mobile.R
import com.example.raihan_mobile.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            title = "Home"
        }
        binding.btnToFourth.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat

            val intent = Intent(requireContext(), FourthActivity::class.java)
            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)
            startActivity(intent)
            requireActivity().finish()

        }
        binding.btnP5.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat

            val intent = Intent(requireContext(), FifthActivity::class.java)
            startActivity(intent)

        }
        binding.btnToSeventh.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat

            val intent = Intent(requireContext(), SeventhActivity::class.java)
            startActivity(intent)

        }
    }
}