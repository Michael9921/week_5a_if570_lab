package id.ac.umn.tiptime

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.umn.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener { calculateTip() }
    }

    fun calculateTip() {
        private fun displayTip(tip : Double) {
            val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
            binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
        }
        private fun calculateTipe(){
            val stringInTextField = binding.costOfService.text.toString()
            val cost = stringInTextField.toDouble()
            val selectedId = binding.tipOptions.checkedRadioButtonId
            val tipPercentage = when (selectedId) {
                    val cost = stringInTextField.toDoubleOrNull()

                if (cost == null || cost == 0.0) {
                    displayTip(0.0)
                    return
        }
                    val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
                    R.id.option_twenty_percent -> 0.20
                    R.id.option_eighteen_percent -> 0.18
                    else -> 0.15
                }
                    var tip = tipPercentage * cost
                    val roundUp = binding.roundUpSwitch.isChecked
                if (roundUp) {

                    if (binding.roundUpSwitch.isChecked) {
                        tip = kotlin.math.ceil(tip)
                    }
                    val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
                    binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
                    displayTip(tip)
                }
}