  fun main(args: Array<String>) {
      greetPerson("Myres")
      greetPerson("Rose")
      var remainder=division(33,4)
      println(remainder)
      var addition= sum(1 ,2 ,3 ,4)
      println(addition)
      interesting( "watching documentaries")

  }
fun greetPerson(name: String){
      println("Hello $name")
}
  fun division(num1:Int, num2:Int):Int{
      var remainder=num1%num2
      return(remainder)
  }
  fun sum(numb1:Int, numb2:Int, numb3:Int, numb4:Int) :Int{
     var addition=numb1 +numb2 +numb3 +numb4
      return(addition)
  }
  fun interesting(fact: String){
      println("I love $fact") }

