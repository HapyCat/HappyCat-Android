package com.example.happycatandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happycatandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var cnt:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.click.setOnClickListener {
            cnt++
            binding.score.text= cnt.toString()
            if (cnt%2==0){
                binding.imageChange.setImageResource(R.drawable.ic_cat)
            }
            else{
                binding.imageChange.setImageResource(R.drawable.ic_cat1)
            }
        }


    }
}