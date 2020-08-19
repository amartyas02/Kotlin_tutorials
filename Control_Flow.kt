// IF_ELSE     Use $before a letter to get its value while in a string

fun main() {  
  var a = 10
  var b = 20
  var max = 3
  if(a>b)
  {max = a}
  else if (a<b)
  {max = b}
  else {max = a}
  print(max) 
}  
//Either declare a, b and max all int, then max needn't be assigned any value

// WHEN

var number = 8  
    when(number) {  
        3, 4, 5, 6 ->  
            println("It is summer season")  
        7, 8, 9 ->  
            println("It is rainy season")  
        10, 11 ->  
            println("It is autumn season")  
        12, 1, 2 ->  
            println("It is winter season")  
        else -> println("invalid input")           // Here It is rainy season is printed
        
// FOR LOOP

fun main(){
  var a = arrayOf(10, 20, 30, 40, 50)
  for (item in a){                   // for (i in a.indices)
    println(item)                    // println("a[$i]" + a[i]) 
    }
}

for (i in 1..5  step 2) 
    println(i)                 // Prints 1, 3, 5
}

for (i in 5 downTo 1 step 2)
  println(i)                     // Prints 5, 3, 1
  
while (i<=5){  
        println(i)  
        i++  
    } 

fun main() {       // Specifies which loop to break when used break@loop. Else breaks the immediate loop
    loop@ for (i in 1..3) {  
        for (j in 1..3) {  
            println("i = $i and j = $j")  
            if (i == 2)  
                break@loop  
        }  
    }  
}  

fun main(args: Array<String>) {                   // Skips the remaining part of the loop when called and goes to the labelled loop, else to immediate loop.
    for (j in 1..3) {  
        println("i = $i and j = $j")  
        if (i == 2) {  
            continue@labelname  
        }  
        println("this is below if")  
    } }  }  





