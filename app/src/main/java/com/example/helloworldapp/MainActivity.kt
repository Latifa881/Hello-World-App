package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println()
        println("**Welcome To My Unique Calculator Program**")
        println("Here you will see different math operations with random numbers")
        println("You also will get the chance to explore some math tables ")
        println("1-Add two numbers")
        println("2-Subtract two numbers")
        println("3-Multiply two numbers")
        println("4-Divide two numbers")
        println("5-Display the addition table")
        println("6-Display the subtraction table")
        println("7-Display the multiplication table")
        println("5-Display the division table")
        for(i in 1 ..8){
            var choice=i
            if(choice==1){ println(Addtion(Random.nextInt(1,100), Random.nextInt(1,100))) }
            else if(choice==2){ println(Subtraction(Random.nextInt(1,100), Random.nextInt(1,100)))}
            else if(choice==3){ println(Multiplication(Random.nextInt(1,100), Random.nextInt(1,100)))}
            else if(choice==4){println(Division(Random.nextInt(1,100), Random.nextInt(1,100)))}
            else if(choice==5){AddtionTable(Random.nextInt(1,100), Random.nextInt(1,100))}
            else if(choice==6){MultiplicationTable(Random.nextInt(1,100), Random.nextInt(1,100))}
            else if(choice==7){SubtractionTable(Random.nextInt(1,100), Random.nextInt(1,100))}
            else if(choice==8){DivisionTable(Random.nextInt(1,100), Random.nextInt(1,100))}
        }//end of for
    }
    fun MultiplicationTable(number:Int,endNum:Int){
        println("Multiplication Table for $number(form 1 to $endNum):")
        for (i in 1..endNum) {
            val product = number * i
            println("$number * $i = $product")
        }
    }
    fun DivisionTable(number:Int,endNum:Int){
        println("Division Table for $number(form 1 to $endNum):")
        for (i in 1..endNum) {
            val div = (number / i).toFloat()
            println("$number / $i = $div")
        }
    }
    fun AddtionTable(number:Int,endNum:Int){
        println("Division Table for $number(form 1 to $endNum):")
        for (i in 1..endNum) {
            val sum = (number + i).toFloat()
            println("$number + $i = $sum")
        }
    }
    fun SubtractionTable(number:Int,endNum:Int){
        println("Subtraction Table for $number(form 1 to $endNum):")
        for (i in 1..endNum) {
            val sub = (number - i).toFloat()
            println("$number + $i = $sub")
        }
    }
    fun Addtion(num1:Int,num2:Int):Int{
        println("  Addition of $num1 and $num2 ")
        return num1+num2
    }
    fun Subtraction(num1:Int,num2:Int):Int{
        println("  Subtraction of $num1 and $num2 ")
        return num1-num2
    }
    fun Multiplication(num1:Int,num2:Int):Int{
        println("  Multiplication of $num1 and $num2 ")
        return num1*num2
    }
    fun Division(num1:Int,num2:Int):Float{
        println("  Division of $num1 and $num2 ")
        if(num2==0){
            return num1.toFloat()
        }
        return (num1/num2).toFloat()
    }
}