open class lexiconPflanzen(var name : String, var wichtigeInhaltsstoffe : String):Pflanzen(name) {
    override fun toString(): String {
        return("${this.name} ${this.wichtigeInhaltsstoffe}") }}