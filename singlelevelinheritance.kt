package inheritance

open class BaseClass(){
    fun testa(){
        println("Parent Class")
    }
}
class ChildClass:BaseClass(){
    fun testb(){
        println("Child Class")
    }
}
fun main(args: Array<String>)
{
    var childClass = ChildClass()
    // calling methods from base and child classes
    childClass.testa()
    childClass.testb()
}