/* Each day a family consumes 15 liters of water.

Given the number of years as input, you need to calculate and output the amount of water consumed in that period.

**Sample Input**

5

**Sample Output**

27375

The water consumption in 5 years would be: 5*365*15 = **27375**

**NB**: Use **365** as the number of days in a year.
 */

 fun main() {
     var years = 5
     val oneYear = 365
     val water = 15
     println(years*oneYear*water)
 }