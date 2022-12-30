/*Introduction to OOP
fun main(){
    //class is blueprint
    //object is implementation of blueprint

    val person = person()//object
    println(person.userName)//output:nvdkfofbko
    //access the properties of a class
    println(person.addNumbers(a:10, b:5))
}

class person{

var userName:String = "nvdkfofbko"
var number:String = "9999"
fun addNumbers(a: Int, b: Int): Int{
    return a-b
}

}

//constructors
/*type of function used to initialised tthe properties of
a class */

fun pracConstructors(){
//To declare a constructor, we will give 'personTwo' a parameter
val personTwo = personTwo(name:"Everafterhigh")
println(peronTwo.userNameTwo)
println(personTwo.data)
}

class peronTwo{
    var userNameTwo: String
    constructor(name:String){
        userNameTwo = name
    }

}
//secondary constructor
/* to change to primary constructor, hover cusor over
construtor and the message will come up
click on that and the block of code will dissappear
but it will still run fine */

/*primary constructor

class peronTwo(name: String, num:String){
    var userNameTwo: String = name
    var numberTwo: String = num
    var data: String =""
    init{
         //used to write logic related to the class
        data = "$name $num"
    }
    }
    */
    */