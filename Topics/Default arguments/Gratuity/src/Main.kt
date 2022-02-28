fun tip(bill: Int, percentage: Int = 10): Int {
    var tipsum = (bill * percentage) / 100
    return tipsum
}