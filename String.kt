fun main(){
var str = "this is test string"
println(str)
val ch = charArrayOf('h', 'e', 'l', 'l', 'o')    
println(ch) ''' hello'''
//     val ch = charArrayOf('h', 'e', 'l', 'l', 'o')  
//     println(ch)
    var str = "this is test string"
// println(str.indices) //0..18 
// println(str.lastIndex)  //18
println("$str is a string which length is ${str.length}")  // abc is a string which length is 19

val escape_string ="Hello, \nJavaTpoint"  //Hello, 
                                    JavaTpoint
                                    
val raw_string ="""       // Prints in same format, if we use .trimMargin() after last """, it removes any margin before the string in each line
             Welcome   
                 To  
JavaTpoint  
    """  

println(escape_string>raw_String) // False




}
