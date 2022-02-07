open class Apple(model: String) : Mobile(model){
    var price: Double = 0.0
    var discount: Double = 0.0


    override
    fun get_price(){
        val priceMap = mapOf("11pro" to 2000.0, "12pro" to 2100.0, "13pro" to 2200.0, "14pro" to 3000.0)
        if (model in priceMap)
        {
            price = priceMap[model]!!
            println("The price is: $price")
        }
    }
    override
    fun get_discount() {
        discount = price - price * 0.02
        println("Price After discount is: $discount")
    }
    override
    fun get_detail(){
        println("The model of the mobile is $model")
        println("The price of the mobile is $price")
        println("The discount of the mobile is $discount")
    }
}