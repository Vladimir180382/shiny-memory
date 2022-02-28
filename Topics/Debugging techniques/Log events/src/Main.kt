fun String?.capitalize(): String? {
    return when {
        isNullOrBlank() -> {
            println("Before: $this")
            println("After: $this")
            this

        }
        length == 1 -> {
            println("Before: $this")
            println("After: ${this.uppercase()}")
            this.uppercase()
        }
        else -> {
            println("Before: $this")
            println("After: ${ this[0].uppercase() + substring(1)}")
            this[0].uppercase() + substring(1)
        }
    }
}
