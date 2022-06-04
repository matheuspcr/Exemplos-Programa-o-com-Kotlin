package basico

object TiposBasicos {

    class Numeros() {

        /**
         * https://kotlinlang.org/docs/basic-types.html#integer-types
         */
        fun `Exemplo inteiro`() {
            val menorValorPossivelByte: Byte = -128
            val maiorValorPossivelByte: Byte = 127

            val menorValorPossivelShort: Short = -32768
            val maiorValorPossivelShort: Short = 32767

            val menorValorPossivelInt: Int = -2147483648
            val maiorValorPossivelInt: Int = 2147483647

            val menorValorPossivelLong: Long = -9223372036854775807
            val maiorValorPossivelLong: Long = 9223372036854775807
        }
    }
}