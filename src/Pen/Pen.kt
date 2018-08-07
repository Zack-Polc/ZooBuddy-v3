package Pen

open class Pen(var type: String, var totalSize: Int, var temperature: Int)

class Land(type: String, volume: Int, temperature: Int) : Pen(type, volume, temperature)

class Petting(type: String, volume: Int, temperature: Int) : Pen(type, volume, temperature)

class Aquarium(type: String, volume: Int, temperature: Int) : Pen(type, volume, temperature)

class Aviary(type: String, volume: Int, temperature: Int) : Pen(type, volume, temperature)

class Mixed(type: String, volume: Int, temperature: Int) : Pen(type, volume, temperature)
