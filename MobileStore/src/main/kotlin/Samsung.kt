open class Samsung(model: String) : Mobile(model){
    var price: Double = 0.0
    var discount: Double = 0.0


    override
    fun get_price(){
        val priceMap = mapOf("S12" to 2000.0, "S21" to 2100.0, "A12" to 2200.0, "A21" to 3000.0)
        if (model in priceMap)
        {
            price = priceMap[model]!!
            println("The price is: $price")
        }
    }
    override
    fun get_discount() {
        discount = price - price * 0.1
        println("Price After discount is: $discount")
    }
    override
    fun get_detail(){
        println("The model of the mobile is $model")
        println("The price of the mobile is $price")
        println("The discount of the mobile is $discount")
    }
}





