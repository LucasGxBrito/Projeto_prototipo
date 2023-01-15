package com.example.custo_por_km

fun main(){
    println("Para mais informações sobre o consumo do seu carro acesse o link: " +
            "https://www.carrosnaweb.com.br/ ")
    println(" ")
    println("Unidade de distância: km ou m(milha) ")
    val d : String? = readLine()

    println("Unidade de consumo: km/L ou mpg ou mpl ")
    val cons : String? = readLine()

    println("Unidade monetária: R$ ou $ ou £ ou € ")
    val mon : String? = readLine()

    println("Consumo do carro($cons): ")
    val consumo = readLine()!!.toDouble();

    println("Preço do combustível($mon): ")
    val preco = readLine()!!.toDouble();

    val custoc : Double = preco / consumo
    println("O custo por km do carro é $custoc $mon/$d ")

    println(" ")
    println("Distâcia pecorrida ($d): ")
    val dist = readLine()!!.toDouble();

    val custo1 : Double = custoc * dist
    println("O custo parcial 1 é $custo1 $mon/$d ")

    println(" ")
    println("Custo extra (Estacionamento, pedágio e etc...) ($mon): ")
    val park = readLine()!!.toDouble();

    val custo2 : Double = park / dist
    println("O custo parcial 2 é $custo2 $mon/$d ")

    println(" ")
    val custoTotal : Double = custo1 + custo2
    println("O custo total é $custoTotal $mon/$d ")

    println(" ")
    println("Está sozinho? sim ou são. ")
    val sozinho : String? = readLine()

    println("Está levando uma quantidade maior de objetos como malas ou compras? sim ou não   ")
    val objetos: String? = readLine()

    when {
        (sozinho == "sim" && objetos == "sim") -> println("Use o carro. ")
        (sozinho == "sim" && objetos == "não") -> println("Vá de ônibus, de transporte por Aplicativo ou de bicicleta. ")
        (sozinho == "não" && objetos == "sim") -> println("Use o carro. ")
        else -> println("Use o carro. ")
    }

}