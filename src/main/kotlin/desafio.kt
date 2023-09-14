// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario (val nome:String, val idade:Int, val sexo:String){

}

/* a classe ConteudosEducacionais foi renomeada para Curso, para condizer com o
conteúdo do site. Uma Formação é um conjunto de Cursos. A duração da Formação
é equivalente a soma dos Cursos existentes na mesma.
 */
data class Curso (var nome: String, val duracao: Int = 1)

data class Formacao(val nome: String, var conteudos: List<Curso>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("$usuario se matriculou com sucesso!")
    }
}
//voce vai ter que testar como adicionar um novo USUARIO a LISTA de inscritos
// como será que funciona esta linha "val inscritos = mutableListOf<Usuario>() ???

/* você vai ter que ver como adicionar uma função que irá somar a duração
de todos os Cursos existentes na Formação, para dar a duração total da Formação */

fun main() {
    //DONE: TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
