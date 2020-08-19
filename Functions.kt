// Do everything in the main. Write functions above/below it

//
fun main(){
    var res = sum(2, 4)
    print(res)
}

fun sum(number1:Int, number2:Int): Int{
var result = number1+ number2
return result}
//

// RECURSION

var count = 0
fun rec() {
  count++
  if (count<=5){
    println(count)
    rec()
  }
}

fun main(){ rec()}

// DEFAULT ARGUMENT

//If not specified, takes default argument
fun main() {run()}   // If run(3) -> prints(3), prints(a)  || run(letter = 'b') -> Specified

fun run(num:Int = 5, letter:Char = 'a'){
print(num) 
print(letter)} 

