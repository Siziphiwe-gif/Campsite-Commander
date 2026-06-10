object DataStorage {
    const val MAX_ITEMS = 100
    //global parallel array accessible by screen
    val itemName = Array (MAX_ITEMS) {""}

    val category = Array (MAX_ITEMS) {""}
    val quantities = Array (MAX_ITEMS){0}
    val comments = Array (MAX_ITEMS) {""}
    val itemCount = 0

}