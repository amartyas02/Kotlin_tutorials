// LISTS

//listOf

// Limitation of List interface is that it is immutable. More elements can't be added in the list after declaration
fun main(){  
    var list = listOf(1,2,3,"Ajay","Vijay","Prakash")
    for(element in list){  
        println(element)  
    }  
    
var anyList: List<Any> = listOf<Any>(1,2,3,"Ajay","Vijay","Prakash")  

list.get(0)           // 1
list.indexOf("Ajay")  // 3
list.size             // 6
list.contains("Aj")   // true/false
list.isEmpty()
list.drop(3)          // Drops first 3 elements
list.subList(2,4)     // [3, "Ajay"] -> 2nd and 3rd

//mutableListOf

var mutableList = mutableListOf("Ajay","Vijay","Prakash","Vijay")  
var mutableListAny: MutableList<Any> = mutableListOf<Any>("Ajay", 2)
mutableListAny.add("Sunil")
mutableListAny.add(4)
mutableListAny.subList(2,4) 

//ArrayList ** implementation is same as mutablelistof

val arrayList: ArrayList<String> = ArrayList<String>(1)   //If we leave it, it will be empty and further it can be added
arrayList.add("Ajay")
arrayList.add("Vijay")
arrayList.set(1,"Ashu")  
println(arrayList.indexOf("Ajay"))  
arrayList.remove("Ashu")  
arrayList.removeAt(1)

var anyArrayList: ArrayList<Any> = arrayListOf<Any>(1,2,3,"Ajay","Vijay","Prakash")  

// Maps

fun main(args: Array<String>){  
  
    val myMap = mapOf<Int,String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")  
    for(key in myMap.keys){  
        println(myMap[key])  
    }  
}  

val myMap = mapOf(1 to "Ajay", 4 to "Vijay", 3 to "Prakash","ram" to "Ram", "two" to 2)  
myMap.getValue(4)

for(itr in myMap.asIterable()){  
          println("key = ${itr.key} value = ${itr.value}")  
      }  
      
// HashMap   Mutable version of hashMap.replace(3,"Ashu")   map

val hashMap:HashMap<Int,String> = HashMap<Int,String>() //define empty hashmap  
hashMap.put(1,"Ajay")  
hashMap.put(3,"Vijay")  
hashMap.put(4,"Praveen")  
hashMap.put(2,"Ajay")  
hashMap.replace(3,"Ashu")  
hashMap.remove(2, "Ajay")

