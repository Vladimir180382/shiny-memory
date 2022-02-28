class BankAccount(_deposited: Long, _withdrawn: Long) {
    val deposited = _deposited
    val withdrawn = _withdrawn
    val balance: Long = deposited - withdrawn
}