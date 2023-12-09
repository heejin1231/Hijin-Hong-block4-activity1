package com.example.hijinhong_block4_quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener { calculateLogic(1)}
        binding.subtractButton.setOnClickListener { calculateLogic(1)}
        binding.multiplyButton.setOnClickListener { calculateLogic(1)}
        binding.divideButton.setOnClickListener { calculateLogic(1)}
    }

    fun calculateLogic(operation: Int){
        var firstNumberText = binding.firstNumber.text.toString()
        var secondNumberText = binding.secondNumber.text.toString()

        if(firstNumber.isEmpty() || secondNumber.isEmpty()){
            Toast.makeText(this, "Fill first and second number!", Toast.LENGTH_SHORT).show()
            return
        }

        var firstNumber = binding.firstNumber.text.toIntOrNull()
        var secondNumber = binding.secondNumber.text.toIntOrNull()

        if (firstNumberText != null && secondNumberText != null){
            val result = when(operation){
                1 -> firstNumber + secondNumber
                2 -> firstNumber - secondNumber
                3 -> firstNumber * secondNumber
                4 -> if (secondNumber != 0) firstNumber /secondNumber else{
                    Toast.makeText(this, "You can not divide any number to zero!", Toast.LENGTH_SHORT).show()
                    return
                }
                else -> 0
            }
            binding.resultText.text = result.toString()
        }
        else{Toast.makeText(this, "Please add only Numbers.", Toast.LENGTH_SHORT).show()

        }

    }
}