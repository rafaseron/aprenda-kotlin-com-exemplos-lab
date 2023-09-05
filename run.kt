fun main() {
    //readln test
    val testeNome = readln()
    println("seu nome é $testeNome")

    //if test
    if (testeNome == "rafael") {
        println("meu nome tambem eh rafael :D (usando if)")
    } else{
        println("é você não se chama rafael mesmo ... (usando if)")
    }

    //when test
    when (testeNome){
        "rafael" -> println("meu nome também eh rafael :D (usando when)")
        "marcos" -> println("prazer marcos, meu nome é rafael (usando when)")
         else -> println("poxa você não se chama rafael nem marcos, mas tabom né (usando when)")

    }



}