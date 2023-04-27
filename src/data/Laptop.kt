package data

class Laptop(name: String) // => class Laptop : Any()
open class Handphone(name: String) // => class Handphone : Any()

class Smartphone(name: String, val os: String) : Handphone(name)