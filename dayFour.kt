//Control flow : if statements, else, when statements, conditiond and loops

fun main(args: Array<String>) {

    var age = 24
    if(age >= 18){
        println("Welcome!")
    }
    else if(age >= 70){
        println("The Elderly")
    }else{
        println("Not Allowed")
    }

//Conditional expressions

val num = -7
val result = if (num > 0) "positive" else "negative"
println(result)

//When statement

val num2 = -6

val result2 = when {
    num2 > 0 -> "positive"
    num2 < 0 -> "negative"
    else -> "zero"
}
println("Make an input between -6 and above")
readLine()!1toInt
println(result2)

//Combining Conditions

var num3 = 42
if(num3 >= 18 && num3 <= 60){
    println("Yes")
}

var name = "Adde"
if(name == "Ade" || name == "Adeolu"){
    println("Hi!!")
}

//While loops

var i = 1
var sum = 0
var j = 1

while (i <= 5){
    println("Hello")
    i++
}

while (j <= 100){
    sum += j
    //sum = sum + j
    i++
}
println(sum)

//Break and continue

var sum2 = 0
var k = 1

while (k <= 100){
    sum2 += k
    k++
    if (sum2 > 1000){
        break // stops completely
    }
}
println(sum2)

var sum3 = 0
var d = 1
while (d <= 100){
    d++
    if (d%2 != 0){
        continue
        /*if the remainder of d/2 !=(is not), equal to 0
        it will be skipped*/
    }
    sum3 += d
}
println(sum3)








//end of main class
/*Just tried to make a comment outside the class main but
it did not highlight green like so. does that mean that
we can't have more than one class in kotlin ? will find out soon */
}