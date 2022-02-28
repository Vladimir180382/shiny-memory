fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    val carPriceNew = 20000
    val priceMaxSpeed = (120 - maximumSpeed) * 100
    val priceYear = old * 2000
    val priceKm = (200 * (kilometers / 10000)).toInt()
    var priceAvtomat = 0
    if (automatic) {
        priceAvtomat = 1500
    }
    val carPriceOld = carPriceNew - priceMaxSpeed - priceYear - priceKm + priceAvtomat
    println(carPriceOld)
}
