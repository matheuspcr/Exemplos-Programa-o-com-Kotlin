package basico

object Decisao {

    fun `Exemplo if`() {
        if (1 == 1) {
            println("1 é igual a 1")
        }
    }

    fun `Exemplo if else`() {
        if (1 == 10) {
            println("1 é igual a 10")
        } else {
            println("1 não é igual a 10")
        }
    }

    fun `Exemplo else if`() {
        if (1 == 10) {
            println("1 é igual a 10")
        } else if (2 == 2) {
            println("2 é igual a 2")
        } else {
            println("1 não é igual a 10 e 2 não é igual a 2")
        }
    }

    fun `Exemplo when`(seuNome: String) {
        val nomeDoAluno =
            when (seuNome) {
                "Matheus" -> "é Matheus"
                "Gustavo" -> "é Gustavo"
                "Pedro" -> "é Pedro"
                "Luiz" -> "é Luiz"
                "João" -> "é João"
                "Uilian" -> "é Uilian"
                else -> "não foi encontrado pelo when"
            }

        println("O nome do aluno $nomeDoAluno")
    }
}