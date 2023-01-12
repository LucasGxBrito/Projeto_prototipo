package com.example.custo_por_km

fun main(){
    println("Consumo do carro(Km/L): ")
    var consumo = readLine()!!.toDouble();

    println("Preço do combustível(R$): ")
    var preco = readLine()!!.toDouble();

    val custo1 : Double = preco / consumo
    println("O custo parcial 1 é $custo1 R$/Km ")

    println("Custo extra (Estacionamento, pedágio e etc...) (R$): ")
    var park = readLine()!!.toDouble();

    println("Distâcia pecorrida (Km): ")
    var dist = readLine()!!.toDouble();

    val custo2 : Double = park / dist
    println("O custo parcial 2 é $custo2 R$/Km ")

    val custoTotal : Double = custo1 + custo2
    println("O custo total é $custoTotal R$/Km ")

    println("Está sozinho? " +
            "Digite 1 para SIM e 2 para NÃO. ")
    var sozinho = readLine()!!.toInt();

    println("Está levando uma quantidade maior de objetos como malas ou compras?" +
            "Digite 1 para SIM e 2 para Não   ")
    var objetos = readLine()!!.toInt();

    when {
        (sozinho == 1 && objetos == 1) -> println("Use o carro. ")
        (sozinho == 1 && objetos == 2) -> println("Vá de ônibus, de transporte por Aplicativo ou de bicicleta. ")
        (sozinho == 2 && objetos == 1) -> println("Use o carro. ")
        else -> println("Use o carro. ")
    }

}