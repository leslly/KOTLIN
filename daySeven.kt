//Functions
fun main(){

    sayHi()//output: hello, there!
    sayHi(name:"Leslie")//output: Leslie
    

}

fun sayHi(){
    println("hello, there!")
    //this works like a method
}

fun sayHi(name:String){
    println(name)
    /*We enter a variable as the parameter of the function sayHi
    call of function occurs in a linear manner */
}
    //return value: Returning a value means to assigns that value to a function
    //new main
fun main(){
      var hey: String = sayHello()
      println(hey)
}
fun sayHello(): String{
    return "hey"
}

//new main
fun fullName(firstName: String, lastName: String){
    //concancate
    val fName = "$firstName $lastName"
    /*Recall from dart class that '$' is used to input */
    println(fName)
}