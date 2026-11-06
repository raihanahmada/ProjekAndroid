package com.example.raihan_mobile.Message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.raihan_mobile.R
import com.example.raihan_mobile.databinding.FragmentHomeBinding
import com.example.raihan_mobile.databinding.FragmentMessageBinding
import java.io.File

class MessageFragment : Fragment() {
    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!
    private val messageList = listOf(
        MessageModel("joko", "Balikan Yuk !", "https://avatarapi.runflare.run/public/1" ,"10.19"),
        MessageModel("Raihan", "Yuk", "https://avatarapi.runflare.run/public/2","10.20"),
        MessageModel("Citra", "Jangan lupa tugasnya ya!", "https://avatarapi.runflare.run/public/3","10.29"),
        MessageModel("Dika", "Besok kita rapat jam 9", "https://avatarapi.runflare.run/public/4","10.49"),
        MessageModel("Eka", "Nice job kemarin!", "https://avatarapi.runflare.run/public/5","10.59"),
        MessageModel("Fajar", "Lagi ngapain?", "https://avatarapi.runflare.run/public/6","11.10"),
        MessageModel("Gita", "Boleh minta tolong?", "https://avatarapi.runflare.run/public/7","20.19"),
        MessageModel("Hana", "Lihat email ya", "https://avatarapi.runflare.run/public/8","20.19"),
        MessageModel("Irfan", "Oke noted", "https://avatarapi.runflare.run/public/9","11.19"),
        MessageModel("Joko", "Sampai jumpa besok", "https://avatarapi.runflare.run/public/10","10.19")
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.apply {
            title ="Message"
        }
        val adapter = MessageAdapter(requireContext(), messageList)
        binding.listMessageItems.adapter = adapter
    }
}