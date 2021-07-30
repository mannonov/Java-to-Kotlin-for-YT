fun main(args: Array<String>) {

//    val value = 4546546.4545F

//    val char: CharArray = value.toCharArray()


//    val string = value.toString()
//
//    println(string)

//    val number: Int = value.toInt()
//
//    for (i in char.iterator()){
//        println(i)
//    }


    val number: Int = 5

    val str: String = when (number) {
        0 -> "number is 0"
        1 -> "number is 1"
        2 -> "number is 2"
        3 -> "number is 3"
        4 -> "number is 4"
        5 -> "number is 5"
        else -> "number not found"
    }

    println(str)

    val a = 15
    val b = 16

    val max: Int = if (a > b) a else b

//
//    if (a > b){
//
//        max = a
//
//    }else{
//        max = b
//    }

    println(max)

}