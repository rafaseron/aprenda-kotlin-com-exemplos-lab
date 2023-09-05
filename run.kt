fun main() {
    //readln test
    var testeNome = readln()
    println("seu nome é $testeNome")

  //CONDIÇÕES

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
         else -> {
             println("poxa você não se chama rafael nem marcos, mas tabom né (usando when).")
        }
    }

  //LOOPS
    while (testeNome != "marcos"){
        println("apenas um marcos pode continuar executando este programa (usando while)")
        println("esta é a ultima chance para você se chamar marcos: ")
        testeNome = readln()
        continue
    }

    do {
        println("oi marcos (usando do while)")
        break //break test
    } while(testeNome == "marcos")

  //WORKING WITH ARRAYS
  // FOR LOOPS IS THE BEST WAY TO JUMP THROUGH OF THE ELEMENTS

}