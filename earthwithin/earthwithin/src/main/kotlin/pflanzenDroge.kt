open class pflanzenDroge(var verwendung: String, var genutzteBestandteile: String):
    lexiconPflanzen( "", "") {
    override fun toString(): String {
    return ("${this.name} ${this.wichtigeInhaltsstoffe} ${this.verwendung} ${this.genutzteBestandteile}") }}

