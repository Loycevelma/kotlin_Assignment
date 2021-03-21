import java.util.*
import java.util.Arrays.toString

fun main() {
    name("loyce","tabitha","diana","catherine")
    cities()
    operations()
    game("football","netball","hockey")

}
fun name(x:String,y:String,z:String,k:String){
    var namesArray=arrayOf(x,y,z,k)
    println(Arrays.toString(namesArray))



}
fun cities (){
    var citiesArray= arrayOf("Harare","Mumbai","Dodoma","Jakarta")
    var sortedNames=citiesArray.sortedArray()
    println(Arrays.toString(sortedNames))
}
fun operations(){
    var numbersArray= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var add=(numbersArray[1]+numbersArray[4])
    println(add)
    var indexArray=numbersArray.indexOf(158)
    println(indexArray)
    var NumbersArray=numbersArray.sortedArray()
    println(Arrays.toString(NumbersArray))

}
fun game (name1:String,name2:String,name3:String):Array<String>{
    var  gameArray=arrayOf(name1,name2,name3)
    println(Arrays.toString(gameArray))
    return gameArray
}