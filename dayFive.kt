//Arrays
fun main(args:Arrays<String>) {
    var cars = arrayOf("benz", "Rollex", "Toyota")
    println(cars)
    pritln(cars[1])

    //for loops
    var nums = arraysOf(2, 4, 6, 8)
    for(x in nums){
        println(x)
    }

    val name = "James"
    for(y in name){
        println(y)
    }
    println(name[2])

    //Ranges; creates a range of numbers or characters

    for(i in 2..5){
        println(i)
        println(i/2)
    }

    for(v in 'a'..'z'){
        print(v)
    }

    //you can check if a value or character is present in a range or array
    val w = 43
    if (w in 15..100){/*if 43 is in the range of numbers 15 t0 100
        that the variable 'w' initiates then print out yes */
        println("Yes")
    } 

    val r = arrayOf(3, 5, 60, 96)
    if(60 in r){
        print("Yes")
    }
    //To iterate a range of number range which does not include its end element
    for(g in 1 until 5){
        print(g)
    }
}