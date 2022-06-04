package basico
/**
 * Laço de repetição é uma forma de repetir uma instrução enquando uma condição for verdadeira
 * Documentação: https://kotlinlang.org/docs/control-flow.html#for-loops
 */
object LacoDeRepeticao {

    /**
     * While
     */
    // Coloque 0 no limite dos dois para ver a diferença

    fun `Exemplo While`(limite: Int) {
        var contador = 0

        while (contador < limite) {
            contador++
            println("O valor do contador é: $contador")
        }
    }

    fun `Exemplo Do While`(limite: Int) {
        var contador = 0

        do {
            contador++
            println("O valor do contador é: $contador")
        } while (contador < limite)
    }

    /**
     * For
     */

    fun `Exemplo For`(limite: Int) {
        val range = 0..limite

        for (contador in range){
            println("O valor do contador é: $contador")
        }
    }

    fun `Exemplo For 2`() {
        for (contador in 0..5){
            println("O valor do contador é: $contador")
        }
    }
}