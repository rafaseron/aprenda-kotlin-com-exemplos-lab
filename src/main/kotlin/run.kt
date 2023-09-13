fun main() {
    //readln test
    var testeNome = readln()
    //digite marcos para passar em todos os testes
    println("seu nome é $testeNome")

    //CONDIÇÕES

    //if test
    if (testeNome == "rafael") {
        println("meu nome tambem eh rafael :D (usando if)")
    } else {
        println("é você não se chama rafael mesmo ... (usando if)")
    }

    //when test
    when (testeNome) {
        "rafael" -> println("meu nome também eh rafael :D (usando when)")
        "marcos" -> println("prazer marcos, meu nome é rafael (usando when)")
        else -> {
            println("poxa você não se chama rafael nem marcos, mas tabom né (usando when).")
        }
    }

    //LOOPS
    while (testeNome != "marcos") {
        println("apenas um marcos pode continuar executando este programa (usando while)")
        println("esta é a ultima chance para você se chamar marcos: ")
        testeNome = readln()
        continue
    }

    do {
        println("oi marcos (usando do while)")
        break //break test
    } while (testeNome == "marcos")

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
    if ("rafael" in nomes) {
        println("ele existe no banco de dados")
    } else {
        println("rafael não existe mais no nosso banco de dados")
    }

    // FOR LOOPS IS THE BEST WAY TO JUMP THROUGH OF THE ELEMENTS
    // agora que já vimos como checkar se um elemento existe em um array, vamos então percorre-lo por completo
    println("precisamos iterar um array para imprimir seus valores: $nomes")
    //percebe-se que ele imprime o endereço de memória e não o valor dos indices
    //ou seja precisamos iterar para imprimir os valores de um array
    println("PERCORRENDO (iterando) O ARRAY INTEIRO UTILIZANDO FOR")
    for (i in nomes) {
        println(i)
    }


    //RANGES só pra brincar ne
    for (i in 'a'..'z') {
        print("amazon é de A a ")
        println(i)
    }

    //KOTLIN FUNCTIONS
    fun frasePronta() {
        val nome1 = nomes[0]
        val nome2 = nomes[1]
        print("o primeiro nome é $nome1 e o segundo é o $nome2")
    }
    frasePronta()

    //agora passando argumentos
    fun outraFrase(nome3: String, nome4: String) {
        println("Os dois nomes são: $nome3 + $nome4")
    }
    outraFrase("joao", "maria")

    //agora vamos retonar um resultado
    fun soma(valor1: Int, valor2: Int): Int {
        return (valor1 + valor2)
    }
    println("agora vamos testar a função que retorna resultados")
    val resultado = soma(5, 2)
    println(resultado)
    //instanciando a função direto no println
    println("agora vamos instanciar a função direto no println")
    println(soma(5, 2))

    // COLEÇÕES EM KOTLIN
    /* o objetivo é escolher a melhor coleção que vai ARMAZENAR seus dados. isso
    vai de acordo com o dado que você quer guardar e o tipo de ORGANIZAÇÃO
    a qual você precisa */

    // LISTAS (literalmente uma lista)
    /* listas se parecem com um Array, mas a diferença é que não precisamos iterar com
    um For para mostrar seus valores. Listas são mais faceis de trabalhar e muito versáteis
    quando trabalhamos com uma mutableList */
    val listNomes = listOf("rafael", "marcos", "adalberto") //é igual um Array
    println("nesta lista temos: $listNomes")

    println("o primeiro elemento desta lista é impresso igual um array: ${listNomes[0]}")
    /* para imprimir determinado elemento de um ARRAY ou LISTA, quando feito diretamente
    no println, precisamos utilizar { } com a variavel dentro
    (isso por causa dos colchetes [] )*/

    //PODEMOS UTILIZAR AQUI TAMBÉM A FUNÇÃO SIZE (.size)
    val tamanhoLista = listNomes.size   //isso é como eu faria antigamente
    // aqui estamos instanciando em um objeto e imprimiremos o objeto
    println("o tamanho da lista é: $tamanhoLista")
    println(listNomes.size) //igual o modo antigo, mas sem adicionar texto

    //AQUI DIRETO SEM INSTANCIAR ATOA (serve para array também) - com chaves
    println("o tamanho da lista é: ${listNomes.size} ")

    //temos como procurar qual o indice de um elemento com .indexOf
    println("o indice do elemento marcos é: ${listNomes.indexOf("marcos")}")

    //temos como verificar se um elemento existe nesta lista
    if ("marcos" in listNomes){
        println("existe marcos dentro desta lista")
    }

    // também da para fazer uma lista não estática
    //MUTABLE LIST
    val mutavelNomes = mutableListOf("ricardo", "bruno", "douglas")
    mutavelNomes.add("jonas")
    println("agora na nossa lista temos um nome a mais! $mutavelNomes")
    mutavelNomes.remove("bruno")
    println("agora removemos o bruno da lista: $mutavelNomes")



    // SETS (como um saco de bolinhas de gude diferentes)
    /* é um conjunto de mesmo tipo de dados, não pode se repetir
    e não importa a ordem */

    val setNomes = setOf("rafael", "marcos", "adalberto", "rafael")
    println("este é o nosso conjunto de nomes: $setNomes")
    //repare que o rafael se repetiu, mas não apareceu no conjunto
    //isso porque o set não aceita repetição de elementos

    println("o tamanho do nosso conjunto é: ${setNomes.size}")
    println("o primeiro elemento do conjunto é: ${setNomes.first()}")
    /* conjunto não importa a ordem. por isso não tem como usar
    ${setNomes[0]}. No caso temos funções de apoio first e last */
    println("o ultimo elemento do conjunto é: ${setNomes.last()}")

    println("o indice do elemento rafael é: ${setNomes.indexOf("rafael")}")


    // MAPS (encontra um VALOR utilizando sua CHAVE correspondente)




    // KOTLIN CLASSES
}