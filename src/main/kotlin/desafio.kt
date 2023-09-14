enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }
class Usuario (val nome:String, val idade:Int, val sexo:String)

/* a classe ConteudosEducacionais foi renomeada para Curso, para condizer com o
conteúdo do site. Uma Formação é um conjunto de Cursos. A duração da Formação
é equivalente a soma dos Cursos existentes na mesma.
 */
data class Curso (var nome: String, val duracao: Int = 1)

data class Formacao(val nome: String, var conteudos: List<Curso>) {

    val inscritos = mutableListOf<Usuario>()
    //lista mutavel criada especificamente para armazenar objetos da classe Usuario
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario se matriculou com sucesso!")
    }
    fun desmatricular (usuario:Usuario){
        inscritos.remove(usuario)
        println("$usuario se desmatriculou com sucesso")
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

    //criando um objeto
    val user1 = Usuario("joao", 27, "masculino")
    /* agora ao instanciar um objeto da classe Usuario, ta te faltando base
    para entender a relação entre a Data class e a classe Usuario (uma classe normal) */

    /* também to vendo que te falta base de enum class para entender como ela pode
    se relacionar com uma Data class Curso e/ou com a Data class Formacao */

    // CONSELHO: REVER estes conteudos e retornar posteriormente !!




}
