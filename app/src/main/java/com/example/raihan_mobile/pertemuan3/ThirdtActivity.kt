package com.example.raihan_mobile.pertemuan3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.raihan_mobile.R
import com.example.raihan_mobile.databinding.ActivityThirdtBinding

class ThirdtActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdtBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThirdtBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnSubmit.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val nama = binding.inputNama.text
            val intent = Intent(this, ThirdResultActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Pesan berhasil dikirim ke $nama", Toast.LENGTH_SHORT).show()
        }
    }
}