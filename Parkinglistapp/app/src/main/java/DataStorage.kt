object DataStorage {
    const val MAX_ITEMS = 100
    // Global parallel arrays  accessible by any screen
    val itemName = Array(MAX_ITEMS) {""}
    val category = Array(MAX_ITEMS){""}
    val quantities = Array (MAX_ITEMS){ 0 }
    val comments = Array (MAX_ITEMS) {""}
    var itemCount= 0

}