    fun main() {


        // CONDIÇOES (CONTROLE FLUXO)
        val produto = "iPhone"

        // se, senão
        // ( <, <=, >, >= !, ==, != )
        if (produto.length <3) {
            println("Você não pode cadastrar produtos com nomes pequenos")
        }else{
            println("Produto cadastrado com sucesso!")
        }


        val produto1 = "iPhone"

        // se, senão
        if ( !(produto1.length < 3) ){
            println("Você não pode cadastrar produtos com nomes pequenos")
        } else {
            println("Produto cadastrado com sucesso!")
        }
        val preco = 20_000
        if (preco > 30_000) {
            println("Você ganhou 30 % de desconto")
        } else if (preco> 20_000) {
            println("Voçe ganhou 20% de desconto")
        } else if (preco> 10_000) {
            println("Voçe ganhou 10% de desconto")
        } else {
            println("Você não ganhou desconto")
        }

        //CONDIÇÕES COMPOSTAS

        // E
        // TRUE I TRUE = true
        // TRUE I FALSE = false
        // FALSE I TRUE = false
        // FALSE I FALSE = false

        val preco2 = 49
        val produto2 ="Teclado"

        if (preco2 == 49 && produto2 == "Teclado") {
            println("Sucesso")
        } else {
            println("Falha")
        }

        val preco3 = 49
        val produto3 ="Teclado3" // MUDANÇA

        if (preco3 == 49 && produto3 == "Teclado") {
            println("Sucesso")
        } else {
            println("Falha")
        }

        //OU
        // TRUE I TRUE = true
        // TRUE I FALSE = true
        // FALSE I TRUE = true
        // FALSE I FALSE = false

        val preco4 = 49
        val produto4 ="Teclado"

        if (preco4 == 49 || produto4 == "Teclado") {
            println("Sucesso")
        } else {
            println("Falha")
        }

        val preco5 = 49
        val produto5 ="Teclado3" // MUDANÇA

        if (preco5 == 491234 || produto5 == "Teclado") {
            println("Sucesso")
        } else {
            println("Falha")
        }

        val preco6 = 49
        val desconto = 10

        if (preco6 == 49 || desconto == 11) {
            println("Sucesso")
        } else {
            println("Falha")
        }


    }