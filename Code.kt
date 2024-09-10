package com.example.rockpapersissor

fun main(){
    var computerChoice : String = ""
    var myChoice :String = ""
    print("Rock , Paper or Scissor?\nEnter Your Choice: ")
    myChoice = readln()
    myChoice = myChoice.lowercase()
    myChoice[0].uppercase()
    while(myChoice != "Rock" || myChoice!= "Paper" || myChoice!="Scissor"){
        println("You select wrong choice")
        print("Please enter you choice again:")
        myChoice = readln()
    }
    myChoice = myChoice.lowercase()
    myChoice[0].uppercase()
    var randomNumber = (1..3).random()
    when(randomNumber){
        1 -> computerChoice = "Rock";

        2 -> computerChoice  = "Paper"

        3 -> computerChoice = "Scissor"
    }

    println("Computer Choice: ${computerChoice}")
    var winner = when{
        myChoice == computerChoice -> "Tie"
        myChoice == "Rock" && computerChoice == "Scissor" -> "You"
        myChoice == "Paper" && computerChoice == "Rock" ->"You"
        myChoice == "Scissor" && computerChoice =="Paper" -> "You"
        else -> "Computer"
    }
    if(winner == "Tie") println("It's a tie")
    println("$winner Won")
}
