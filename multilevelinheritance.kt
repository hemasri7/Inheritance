package inheritance
open class BaseClass1(){
    fun testa(){
        println("Parent class")
    }
}
open class ChildClass1:BaseClass1(){
    fun testb(){
        println("Child class")
    }
}
class GrandChildClass:ChildClass1(){
    fun testc(){
        println("Grandchild class")
    }
}
fun main(args: Array<String>)
{
    var grandChildClass = GrandChildClass()
    // calling methods from base and child classes
    grandChildClass.testa()
    grandChildClass.testb()
    grandChildClass.testc()
}