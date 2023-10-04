package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.project1.databinding.ActivityBusBinding

class BusActivity : AppCompatActivity() {

    lateinit var binding: ActivityBusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus)

        binding = ActivityBusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //senin
        binding.btnsenin.setOnClickListener {
            replaceFragment(SeninFragment())
        }

        //selasa
        binding.btnselasa.setOnClickListener {
            replaceFragment(SelasaFragment())
        }

        //rabu
        binding.btnrabu.setOnClickListener {
            replaceFragment(RabuFragment())
        }
    }

    private fun replaceFragment(frg:Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentBus,frg)
        fragmentTrx.commit()
    }
}