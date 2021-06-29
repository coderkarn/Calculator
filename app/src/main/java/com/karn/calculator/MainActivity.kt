package com.karn.calculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    var number1: Float = 0.0f
    var isAdd: Boolean = false
    var isSubtract: Boolean = false
    var isDivide : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.number_edit_text)
    }

    fun operationFunction(view: View) {

        when (view.id) {

            R.id.button_one -> {
                numberClicked(1)
            }
            R.id.button_two -> {
                numberClicked(2)
            }
            R.id.button_three -> {
                numberClicked(3)
            }
            R.id.button_four -> {
                numberClicked(4)
            }
            R.id.button_five -> {
                numberClicked(5)
            }
            R.id.button_six -> {
                numberClicked(6)
            }
            R.id.button_seven -> {
                numberClicked(7)
            }
            R.id.button_eight -> {
                numberClicked(8)
            }
            R.id.button_nine -> {
                numberClicked(9)
            }
            R.id.button_zero -> {
                numberClicked(0)
            }
            R.id.button_decimal -> {
                dotClicked()
            }
            R.id.button_clear -> {
                editText.setText("")
            }

            R.id.button_add -> {
                addClicked()
            }
            R.id.button_subtract -> {
                subtractClicked()
            }
            R.id.button_divide -> {
                divideClicked()
            }
            R.id.button_equal -> {
                equalClicked()
            }
        }

    }
    private fun numberClicked(numberClicked: Int){
        val number = editText.text.toString() + numberClicked.toString()
        editText.setText(number)
    }
    private fun dotClicked(){
        val number = editText.text.toString() + "."
        editText.setText(number)
    }
    private fun addClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isAdd = true
    }
    private fun subtractClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isSubtract = true
    }
    private fun divideClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isDivide = true
    }
    private fun equalClicked(){
        when {
            isAdd -> {
                add()
            }
            isSubtract -> {
                subtract()
            }
            isDivide -> {
                divide()
            }
        }

    }
    private fun add(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 + number2
        editText.setText(result.toString())
        isAdd = false
    }
    private fun subtract(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 - number2
        editText.setText(result.toString())
        isSubtract = false
    }
    private fun divide(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 / number2
        editText.setText(result.toString())
        isDivide = false
    }
}