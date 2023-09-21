enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }
data class Usuario (val nome:String, val idade:Int, val sexo:String)

/* a classe ConteudosEducacionais foi renomeada para Curso, para condizer com o
conteúdo do site. Uma Formação é uma soma de Cursos (que podem ser
separados em um conjunto de modulos). A duração da Formação
é equivalente a soma dos Cursos existentes na mesma.
Um Modulo é o conjunto de Cursos. Um Conjunto de Modulos é uma Formação.
Vamos trabalhar então com modulos para ficar mais facil (são 26 cursos, vai dar mais
trabalho manual trabalhar com Cursos diretamente)
 */
 data class Modulo (var nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<Modulo>) {
    val inscritos = mutableListOf<Usuario>()
    val conteudos2 = mutableListOf<Modulo>()
    //lista mutavel criada especificamente para armazenar objetos da classe Usuario

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario se matriculou com sucesso!")
    }

    fun desmatricular(usuario: Usuario) {
        inscritos.remove(usuario)
        println("$usuario se desmatriculou com sucesso")
    }

    fun mostrar() {
        println("estes são todos os incritos na formação $nome: $inscritos")
        /* essa funcao eu criei de acordo com meus conhecimentos e fora do padrao
        que foram criadas as outras funcoes. Você precisa entender a diferença entre
        criar uma função deste modo e do outro modo (passando um argumento)
        - porque precisa passar um argumento? (sendo que na verdade o conteudo inteiro
        da classe estaria acessivel para todas as funcoes dentro da classe)

        - insight: o argumento precisa ser "usuario: Usuario" porque se não seria passada
        a lista como argumento desta maneira -> "inscritos: MutableListOf" (e isso não
        existe na linguagem. enfim, tu pode ler como algo assim para entender
         */
    }

    fun matrizCurricular() {
        println("A matriz curricular da Formação $nome é: $conteudos")

    }

    fun adicionarModulo(modulo: Modulo) {
        conteudos2.add(modulo)
        println("$modulo foi adicionado com sucesso")
    }
    fun mostrarModulo(){
        println(conteudos2)
    }
}
//voce vai ter que testar como adicionar um novo USUARIO a LISTA de inscritos
// como será que funciona esta linha "val inscritos = mutableListOf<Usuario>() ???

/* você vai ter que ver como adicionar uma função que irá somar a duração
de todos os Cursos existentes na Formação, para dar a duração total da Formação */

/* você vai ter que ver como adicionar o Nivel de dificuldade (que é uma enum class)
no Curso e na Formacao */

fun main() {
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    /* você precisará criar uma lista de Curso para adicionar em Formacao */


    //instanciando os modulos
    val modulo1 = Modulo("Desmistificando a Linguagem de Programação Kotlin", 8)
    val modulo2 = Modulo("Fundamentos de Desenvolvimento Mobile Nativo Para Android", 5)
    val modulo3 = Modulo("Noções Básicas do Android com Kotlin", 7)
    val modulo4 = Modulo("Dominando o Android Jetpack", 11)

    //criando um objeto
    val user1 = Usuario("joao", 27, "masculino")
    val user2 = Usuario("albertina", 23, "feminino")
    val user3 = Usuario("vicente", 19, "masculino")
    /* agora ao instanciar um objeto da classe Usuario, ta te faltando base
    para entender a relação entre a Data class e a classe Usuario (uma classe normal) */

    /* também to vendo que te falta base de enum class para entender como ela pode
    se relacionar com uma Data class Curso e/ou com a Data class Formacao */

    // CONSELHO: REVER estes conteudos e retornar posteriormente !!


val android = Formacao("Android Developer", listOf(modulo1, modulo2, modulo3, modulo4))
    /* teria como fazer essa implementacao de cima direto, mas ia ficar muito poluido.
    Exemplo: val android = Formacao ("Android Developer", listOf(("modulo 1", 8)("modulo 2", 5)("modulo 3", 7)("modulo 4", 11)))
     */
    android.matricular(user1)
    android.matricular(user2)
    android.matricular(user3)
    android.mostrar()
    android.matrizCurricular()
    println("agora vamos desmatricular o $user2")
    android.desmatricular(user2)
    android.mostrar()
    android.adicionarModulo(Modulo("teste", 1))
    android.adicionarModulo(Modulo("test2", 2))
    android.mostrarModulo()
    /* Agora, a lista inscritos dentro do objeto android contém um usuário.
    Você pode acessar, remover, ou realizar outras operações com esses objetos de
    usuário dentro da lista conforme necessário. */


}
