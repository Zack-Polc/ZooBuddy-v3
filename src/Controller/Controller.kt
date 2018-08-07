package Controller

import Animals.*
import Pen.*
import kotlin.system.exitProcess

fun startZoo() {

    println("""
        Welcome to ZooBuddy - an zoo management system
        Written in Kotlin 1.2
        Press 'e' to continue
        Press 'x' to exit
    """.trimIndent())

    val stringInput = readLine()!!

    if (stringInput == "e") {
        val isRunning = true
        while (isRunning) {
            mainMenu()
        }
    } else if (stringInput == "x") {
        print("goodbye")
        exitProcess(status = 1)
    }
}

fun penMenu() {

    println("""
       Please create a Pen for animals to live in
       "l" -  Land
       "p" - Petting
       "m"- Mixed'
       "a" - Aquarium
       "v" - Aviary
    """.trimIndent())


    val stringInput = readLine()!!
    var isChoosing = true

    while (isChoosing) {
        print("Pen menu: ")
        println("Input the pen's Type, Volume and Temperature. Press enter key after each field!")
        val typeInput = readLine()!!.toString()
        val volumeInput = readLine()!!.toInt()
        val temperatureInput = readLine()!!.toInt()

        if (stringInput == "l") {
            val landPen = Land(typeInput, volumeInput, temperatureInput)
            println("${landPen.type} created")
            println("type: ${landPen.type}, size: ${landPen.totalSize} temp: ${landPen.temperature}")
            isChoosing = false
        }
        if (stringInput == "p") {
            val pettingPen = Petting(typeInput, volumeInput, temperatureInput)
            println("${pettingPen.type} created")
            println("type: ${pettingPen.type}, size: ${pettingPen.totalSize} temp: ${pettingPen.temperature}")
            isChoosing = false
        }
        if (stringInput == "m") {
            val mixedPen = Mixed(typeInput, volumeInput, temperatureInput)
            println("${mixedPen.type} created")
            println("type: ${mixedPen.type}, size: ${mixedPen.totalSize} temp: ${mixedPen.temperature}")
            isChoosing = false
        }
        if (stringInput == "a") {
            val aquariumPen = Aquarium(typeInput, volumeInput, temperatureInput)
            println("${aquariumPen.type} created")
            println("type: ${aquariumPen.type}, size: ${aquariumPen.totalSize} temp: ${aquariumPen.temperature}")
            isChoosing = false
        }
        if (stringInput == "v") {
            val aviaryPen = Aviary(typeInput, volumeInput, temperatureInput)
            println("${aviaryPen.type} created")
            println("type: ${aviaryPen.type}, size: ${aviaryPen.totalSize} temp: ${aviaryPen.temperature}")
            isChoosing = false
        }
    }
}

fun animalMenu() {

    println("""
        Please choose an animal:
        "c" - cat
        "d" - dog
        "n" - dolphin
        "g" - goat
        "h" - hippo
        "p" - penguin
        "s" - sloth
    """.trimIndent())

    val stringInput = readLine()!!
    var isChoosing = true

    while (isChoosing) {
        println("Input the animals's Type, Volume and Temperature. Press enter key after each field!")
        val typeInput = readLine()!!.toString()
        val volumeInput = readLine()!!.toInt()

        if (stringInput == "c") {
            val cat = Cat(typeInput, volumeInput)
            println("${cat.type} created")
            println("type: ${cat.type}, volume: ${cat.volume} ")
            isChoosing = false
        }
        if (stringInput == "d") {
            val dog = Dog(typeInput, volumeInput)
            println("${dog.type} created")
            println("type: ${dog.type}, volume: ${dog.volume} ")
            isChoosing = false
        }
        if (stringInput == "n") {
            val dolphin = Dolphin(typeInput, volumeInput)
            println("${dolphin.type} created")
            println("type: ${dolphin.type}, volume: ${dolphin.volume}")
            isChoosing = false
        }
        if (stringInput == "g") {
            val goat = Goat(typeInput, volumeInput)
            println("${goat.type} created")
            println("type: ${goat.type}, volume: ${goat.volume} ")
            isChoosing = false
        }
        if (stringInput == "h") {
            val hippo = Hippo(typeInput, volumeInput)
            println("${hippo.type} created")
            println("type: ${hippo.type}, volume: ${hippo.volume} ")
            isChoosing = false
        }
        if (stringInput == "o") {
            val owl = Owl(typeInput, volumeInput)
            println("${owl.type} created")
            println("type: ${owl.type}, volume: ${owl.volume} ")
            isChoosing = false
        }
        if (stringInput == "g") {
            val goat = Goat(typeInput, volumeInput)
            println("${goat.type} created")
            println("type: ${goat.type}, volume: ${goat.volume} ")
            isChoosing = false
        }
        if (stringInput == "p") {
            val penguin = Penguin(typeInput, volumeInput)
            println("${penguin.type} created")
            println("type: ${penguin.type}, volume: ${penguin.volume} ")
            isChoosing = false
        }
        if (stringInput == "s") {
            val sloth = Goat(typeInput, volumeInput)
            println("${sloth.type} created")
            println("type: ${sloth.type}, volume: ${sloth.volume} ")
            isChoosing = false
        }
    }
}

fun mainMenu() {
    println("""Please select a valid menu selection
    "p" - pens
    "a" - animals
    """.trimIndent())

    val stringInput = readLine()!!

    if (stringInput == "p") {
        penMenu()
    }
    if (stringInput == "a") {
        animalMenu()
    }
}





