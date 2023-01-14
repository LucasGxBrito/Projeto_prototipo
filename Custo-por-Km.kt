package com.example.custo_por_km

fun main(){
    println("Unidade de distância: km ou m(milha) ")
    var d : String? = readLine()


    println("Unidade de consumo: km/L ou mpg ou mpl ")
    var cons : String? = readLine()


    println("Unidade monetária: R$ ou $ ou £ ou € ")
    var mon : String? = readLine()

    println("Consumo do carro($cons): ")
    var consumo = readLine()!!.toDouble();


    println("Preço do combustível($mon): ")
    var preco = readLine()!!.toDouble();


    val custoc : Double = preco / consumo
    println("O custo por km do carro é $custoc $mon/$d ")


    println("Distâcia pecorrida ($d): ")
    var dist = readLine()!!.toDouble();


    val custo1 : Double = custoc * dist
    println("O custo parcial 1 é $custo1 $mon/$d ")


    println("Custo extra (Estacionamento, pedágio e etc...) ($mon): ")
    var park = readLine()!!.toDouble();


    val custo2 : Double = park / dist
    println("O custo parcial 2 é $custo2 $mon/$d ")


    val custoTotal : Double = custo1 + custo2
    println("O custo total é $custoTotal $mon/$d ")


    println("Está sozinho? Sim ou Não. ")
    var sozinho : String? = readLine()


    println("Está levando uma quantidade maior de objetos como malas ou compras? Sim ou Não   ")
    var objetos: String? = readLine()


    when {
        (sozinho == "Sim" && objetos == "Sim") -> println("Use o carro. ")
        (sozinho == "Sim" && objetos == "Não") -> println("Vá de ônibus, de transporte por Aplicativo ou de bicicleta. ")
        (sozinho == "Não" && objetos == "Sim") -> println("Use o carro. ")
        else -> println("Use o carro. ")
    }

}