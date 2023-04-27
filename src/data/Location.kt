package data

/**
 * Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract
 * Abstract class artinya, class tersebut tidak bisa dibuat sebagai object, hanya bisa diturunkan
 */
abstract class Location(val name: String)

class City(name: String) : Location(name)

class Country(name: String) : Location(name)