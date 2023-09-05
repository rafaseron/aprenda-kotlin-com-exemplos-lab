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
    val nomes = arrayOf("rafael", "marcos", "adalberto")
    print("o primeiro nome (elemento 0) é: ")
    println(nomes[0])

    println("agora vamos mudar o elemento 0 para patricia")
    nomes[0] = "patricia"
    print("sua saida agora é: ")
    println(nomes[0])

    // função nativa de arrays
    print("o tamanho do array, com .size é: ")
    println(nomes.size)

    // check if and element exists
    if ("rafael" in nomes){
        println("ele existe no banco de dados")
    } else{
        println("rafael não existe mais no nosso banco de dados")
    }



  // FOR LOOPS IS THE BEST WAY TO JUMP THROUGH OF THE ELEMENTS
    // agora que já vimos como checkar se um elemento existe em um array, vamos então percorre-lo por completo
    println("PERCORRENDO O ARRAY INTEIRO UTILIZANDO FOR")
    for (i in nomes){
        println(i)
    }

    //RANGES só pra brincar ne
    for (i in 'a'..'z'){
        print("amazon é de A a ")
        println(i)
    }

    //KOTLIN FUNCTIONS
    // COLEÇÕES EM KOTLIN

    // KOTLIN CLASSES
}