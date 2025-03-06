package org.example


fun main() {

    //Comprobar si contiene una letra/carácter
    val regex = Regex("[a]")
    var frase = "Catalindaa"
    if (regex.containsMatchIn(frase)) {
        println("yes")
    } else {
        println("no")
    } //resultado= yes


    //Comprobar si contiene letra y le sigue un número
    val regex2 = Regex("[m][7]")
    var llista = listOf<String>("m1, m2, m3, m4, m7")
    for (element in llista) {
        if (regex2.containsMatchIn(element)) {
            println("yes")
        } else {
            println("no")
        }
    }


    /*
    Comprobar si contiene caracteres entre- [a-z]
    ^ no conté
    Interseccions:
     */
    val regexIntersection = Regex("[m-z&&[c-o]]")
    // Expressió regular que selecciona caràcters entre 'm' i 'z' excepte els de 'c' a 'o'
    val regexExclusion = Regex("[m-z&&[^c-o]]")

    val llista2 = listOf("a", "m", "n", "o", "p", "z", "c")

    println("Validant amb intersecció [m-z&&[c-o]]:")
    for (element in llista2) {
        if (regexIntersection.containsMatchIn(element)) {
            println("$element -> sí")
        } else {
            println("$element -> no")
        }
    }

    println("\nValidant amb exclusió [m-z&&[^c-o]]:")
    for (element in llista2) {
        if (regexExclusion.containsMatchIn(element)) {
            println("$element -> sí")
        } else {
            println("$element -> no")
        }
    }

}