//Problem 2: Parking fee

/*You are making a car parking software that needs to calculate and output the amount due based on the  number of hours the car was parked.

The fee is calculated based on the following price structure:

- the first 5 hours are billed at $1 per hour.

- after that, each hour is billed at $0.5 per hour.

- for each 24 hours, there is a flat fee of $15.

This means, that, for example, if a car parked for 26 hours, the bill should be 15+(2*0.5) = **16.0,** because it was parked for 24 hours plus 2 additional hours.

**Sample Input:**

8

**Sample Output:**

6.5

**Explanation:** 

The first 5 hours are billed at $1/hour, which results in $5. After that, the next 3 hours are billed at $0.5/hour = $1.5.

So, the total would be $5+$1.5 = $**6.5**

**NB:** The output should be a **Double**, even if the amount is a round number. */
fun main(args:Arrays<String>){
    
    var i = readLine()!!.toDouble()

    if (i == 1) { 
        println("Your fee is $" + i)
    }
     else if(i in 2..5){
         println("Your fee is $" + i)
     }
     else if(i in 6..8760){
         println("Your fee is $" + 5+(i*0.5))
     }

    println("Hours parked:" + i)
    println(i)

    /*val num = -7
val result = if (num > 0) "positive" else "negative"
println(result) */

//I've not been able to solve it yet, can anyone help
}