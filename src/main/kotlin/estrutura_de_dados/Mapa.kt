package estrutura_de_dados

/**
 * Um mapa é uma estrutura de dados que armazena dados de forma que todo valor possui uma chave
 */
object Mapa {
    val agendaDeTelefones = mapOf<String, String>(
        "Matheus" to "+55 (11) 91234-5678",
        "Gustavo" to "+55 (11) 91111-2222",
        "Elaine" to "+55 (11) 94444-5555",
        "Uilian" to "+55 (11) 91010-6767"
    )

    /**
     * Um mapa mutável é igual um mapa, só que você pode adicionar, remover e substituir os valores dentro dele
     */
    val agendaDeTelefonesMutavel = mapOf<String, String>(
        "Matheus" to "+55 (11) 91234-5678",
        "Gustavo" to "+55 (11) 91111-2222",
        "Elaine" to "+55 (11) 94444-5555",
        "Uilian" to "+55 (11) 91010-6767"
    )

    fun `Exemplo pegar valor pela chave`() {
        println(agendaDeTelefones["Matheus"])
    }

}