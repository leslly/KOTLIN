//Problem 3
/*$75+ orders have free shipping
orders < $75 have a shipping fee 10% of the total order amount
int. orders 15% shipping fee at $50
input: 140
output: 21*/

/*15/100 * input */

fun shippingCost():Double{

return result
}

fun main(){

var transType: String = readLine()!!.toString()
var orderTotal: Double = readLine()!!.toDouble()
var result: Double = 0.00

if(orderTotal < 75 && transType == "no"){
result = (10/100)*orderTotal
}
else if(orderTotal >= 75 && transType == "no"){
result = orderTotal*1
}
else if(orderTotal >= 50 && transType == "yes"){
result = (15/100)*orderTotal
}
else if(orderTotal < 50 && transType == "yes"){
result = orderTotal*1
}

println("Is the transaction international ?(yes or no)" + transType)
println("Order Total:" + orderTotal)

println(result)

}