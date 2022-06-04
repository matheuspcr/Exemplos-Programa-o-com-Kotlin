package estrutura_de_dados

/**
 * Uma lista é uma estrutura de dados que armazena dados de forma sequencial, onde cada dado possui um indice
 */
object Lista {
    val numerosDaLoteria = listOf<Int>(55, 39, 27, 5, 13, 99, 1, 13, 17)

    /**
     * Uma lista mutável é igual uma lista, só que você pode adicionar, remover e substituir os valores dentro dela
     */
    val numerosDaLoteriaMutavel = mutableListOf<Int>(55, 39, 27, 5, 13, 99, 1, 13, 17)

    fun `Exemplo pegar valor`() {
        println(numerosDaLoteria[3])
        // ou
        println(numerosDaLoteria.get(index = 3))
    }

    fun `Exemplo pegar indice`() {
        println(numerosDaLoteria.indexOf(13))
    }

    fun `Exemplo alterar um valor pelo indice`() {
        println("Antes: ${numerosDaLoteriaMutavel[3]}")
        numerosDaLoteriaMutavel[3] = 1001
        println("Depois: ${numerosDaLoteriaMutavel[3]}")
    }

    fun `Exmplo adicionar um valor ao começo da lista`() {
        println("Tamanho antes: ${numerosDaLoteriaMutavel.size}")
        println("Lista antes: $numerosDaLoteriaMutavel")
        numerosDaLoteriaMutavel.add(0, 888)
        println("Tamanho Depois: ${numerosDaLoteriaMutavel.size}")
        println("Lista depois: $numerosDaLoteriaMutavel")
    }

    fun `Exmplo adicionar um valor ao final da lista`() {
        println("Tamanho antes: ${numerosDaLoteriaMutavel.size}")
        println("Lista antes: $numerosDaLoteriaMutavel")
        numerosDaLoteriaMutavel.add(2000)
        println("Tamanho Depois: ${numerosDaLoteriaMutavel.size}")
        println("Lista depois: $numerosDaLoteriaMutavel")
    }
}