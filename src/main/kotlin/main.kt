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


//    val number: Int = 5
//
//    val str: String = when (number) {
//        0 -> "number is 0"
//        1 -> "number is 1"
//        2 -> "number is 2"
//        3 -> "number is 3"
//        4 -> "number is 4"
//        5 -> "number is 5"
//        else -> "number not found"
//    }
//
//    println(str)
//
//    val a = 15
//    val b = 16
//
//    val max: Int = if (a > b) a else b

//
//    if (a > b){
//
//        max = a
//
//    }else{
//        max = b
//    }

//    println(max)


    //for(int i =55; i >= 0; i++){
    //
//        println(i)
    //
    // }


//    val array = intArrayOf(454,454,4545,454,545,454,545,45,4,54,54,5,45,45,)
//
//    val array1 = arrayListOf("jaxadev","Youtube",5544,'c')
//
//    for (i in arrayOf("String",454,'c',45.54F)) {
//
//        println(i)
//
//    }


//    first@ for(i in 0..5){
//        println("i = $i")
//       second@ for (j in 0..10){
//            println("j = $j")
//           for (g in 0..10){
//               println("g = $g")
//               if (g == 4) break@second
//           }
//        }
//    }


//        for (i in 0..100){
//
//            if (i % 2 == 0){
//                continue
//            }
//            println("i = $i")
//        }

//   first@ for (i in 0..100){
//      second@  for (j in 100 downTo 0){
//
//          if (i + j % 2 == 0){
//              continue@first
//          }
//          println("i + j = ${i + j}")
//        }
//    }
//
//    val result = fun(a: Int, b: Int): Int {
//        return a * b
//    }
//
//    println(result(5,5))

    // || = or, && = and
//
//    val a = true
//    val b = false
//    var result:Boolean
//
//    result = a or b //a.or(b) = a || b
//    println("result = $result")

//    result = b and a //b.and(a) = b && a
//    println("result = $result")

//    val human = Human()
//    human.sayName("Jahongir")
//    human sayName "Jahongir"

//
//    val human = Human()
//
//    human.sayFullName(fName = "Jahongir", lName = "Mannonov")
//
//    val nexia = Car(125, "Ravon R3") //in Java Car nexia = new Car();
//
//    nexia.turnOn()
//    nexia.turnOf()
//
//    println("nexia otKuchi = ${nexia.otKuchi}")
//    println("nexia mashinaModeli = ${nexia.mashinaModel}")
//
//    val bmw = Car(150, "X5 1990")
//    bmw.turnOn()
//    bmw.turnOf()
//
//    println("bmw otKuchi = ${bmw.otKuchi}")
//    println("bmw mashinaModeli = ${bmw.mashinaModel}")
//
//
//    val jahongir = Person(fName = "Jahongir",lName = "Mannonov")
//
////    println(jahongir.fName)
//    println(jahongir.lName)
//
////    jahongir.fName = ""
//    println(jahongir.fName)


//    val animal = Animal(25, "Blue")
//    animal.eat()
//    animal.sleep()
//    animal.walk()
//    println(animal.size)
//
//    val sheep = Sheep(32, "Black")
//    sheep.eat()
//    sheep.sleep()
//    sheep.walk()
//    sheep.mee()
//    println(sheep.size)

    val childModifier = ChildModifier()
    println(childModifier.name)

}

//fun multiply(a: Int, b: Int): Int {
//    return a * b
//}