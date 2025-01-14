package syntax.lesson19_function

fun main(){
    println("Sum of first 10 number is ${getSumOfNumbers(10)}")
};

fun getSumOfNumbers(number:Int=1):Int{
    var cnt =0;
    var sum = 0;
    while (cnt<=number){
        sum += cnt;
        cnt++;
    }
    return sum;
}