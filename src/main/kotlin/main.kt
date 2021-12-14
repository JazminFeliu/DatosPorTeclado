fun main(args: Array<String>) {
    //realizar la carga de dos numeros enteros por teclado e imprimir su suma y su producto

    print("Ingrese el primer valor: ")
    val valor1 = readLine()!!.toInt()

    print("Ingrese el segundo valor: ")
    val valor2 = readLine()!!.toInt()

    val suma = valor1 + valor2
    val producto = valor1 * valor2

    println("La suma de los valores $valor1 y $valor2 es $suma y su producto $producto ")

    // realizar la carga del lado de un cuadrado, mostrar por pantalla el perimetro del mismo

    print("Ingrese el valor del lado del cuadrado: ")
    val lado = readLine()!!.toInt()

    val perimetro = lado * 4

    println("El perimetro del cuadrado con lado $lado es $perimetro")

    //desarrollar un programa que pida el ingreso del precio de un articulo y la cantidad que lleva
    // el cliente. Mostrar lo que debe abonar el comprador

    print("Ingrese el precio del articulo: ")
    val precio = readLine()!!.toFloat()
    print("Ingrese la cantidad que lleva el cliente: ")
    val cantidad = readLine()!!.toInt()

    val total = precio * cantidad
    println("El total a abonar es $ $total")

    //ingresar cuatro numeros enteros, calcular e informar la suma de los dos primeros y el producto de los restantes

    print("Ingrese el primer numero entero: ")
    val n1 = readLine()!!.toInt()

    print("Ingrese el segundo numero entero: ")
    val n2 = readLine()!!.toInt()

    print("Ingrese el tercer numero entero: ")
    val n3 = readLine()!!.toInt()

    print("Ingrese el cuarto numero entero: ")
    val n4 = readLine()!!.toInt()

    val laSuma = n1 + n2
    val elProducto = n3 * n4

    println("La suma de los numeros $n1 y $n2 es $laSuma")
    println("El producto de los numeros $n3 y $n4 es $elProducto")

    // realizar un programa que lea por teclado cuatro valores numericos enteros e informar su suma y su promedio

    val laSumaDeLosCuatro = n1 + n2 + n3 + n4
    val elPromedio = laSumaDeLosCuatro/4

    println("La suma de los cuatro numeros es $laSumaDeLosCuatro y su promedio $elPromedio")
}