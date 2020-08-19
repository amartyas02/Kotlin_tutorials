class Account{
  var acc_no:Int = 0
  var name:String = "temp"
  var amount:Float = 0.toFloat()
  
  fun new_account(acc_no:Int, name:String, amount:Float){
//     acc_no = flag1
//     name = flag2
//     amount = flag3
    println("Account no. is: ${acc_no}, Name is: ${name}, Amount is: ${amount}")
    }
}

fun main() {
  var acc = Account()
  acc.new_account(203336.toInt(), "Amartya".toString(), 1000.toFloat())
  acc.acc_no = 25.toInt()
  print("${acc.acc_no}")
  
}
