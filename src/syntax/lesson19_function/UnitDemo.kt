package syntax.lesson19_function

fun main(){
    val multiply:(Int,Int) -> Unit = {a,b -> println("a*b= ${a*b}")}
    multiply(3,5);
}