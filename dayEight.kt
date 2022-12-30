//Higher-order functions: A function can take another function as an argument
// Kotlin scope functions : youtube; let, also, apply, run, with

fun apply(x:Int, action: (Int) -> Int): Int{


    return action(x)
}
/*The apply function is used to take another funtion as an argument
An argument is a way for you to provide more information to a function
The syntax above shows that in the parameter of the function 'apply',
the variable x is declared as an integer first. the function action is also declared
as an integer and is said to print out an integer also. this is the argument.
And because we are returning action, we must declare the function apply as an integer if not we will encounter an error */

fun main(){

    println(apply(4, {x -> x*2}))
//output: 8
}
/*Filter

fun main(){
    val arr = arrayOf(42, 3, 10, 4, 6 ,1)
    val res = arr.filter({ it > 5 })
    println(res)
}
/*The it keyword makes it so that any value less than five is not filtered out
output: [42, 10, 6]
the filter function of an array takes a boolean function and returns the
element that match the given condition
*/
