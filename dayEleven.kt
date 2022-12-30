//Abstract Classes: hide
fun main(){
    val windows = windows()
    val Mac = Mac()
    println(windows.operatingSytem())
    println(Mac.operatingSytem())
}

abstract class computer{
    abstract fun operatingSytem():String
    //return type abstract function
}

class windows():computer(){
    //windows extends computer
    override fun operatingSytem():String {
        return "windows"
    }
}

class Mac():computer(){
    override fun operatingSytem():String {
        return "Mac"
    }
}

/*nterfaces

fun main(){

}

interface computer{

}
*/