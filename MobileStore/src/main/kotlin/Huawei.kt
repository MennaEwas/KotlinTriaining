open class Huawei(model: String) : Mobile(model){
    var price: Double = 0.0
    var discount: Double = 0.0


    override
    fun get_price(){
        val priceMap = mapOf("N15" to 2000.0, "N16" to 2100.0, "N17" to 2200.0, "N20" to 3000.0)
        if (model in priceMap)
        {
            price = priceMap[model]!!
            println("The price is: $price")
        }
    }
    override
    fun get_discount() {
        discount = price - price * 0.5
        println("Price After discount is: $discount")
    }
    override
    fun get_detail(){
        println("The model of the mobile is $model")
        println("The price of the mobile is $price")
        println("The discount of the mobile is $discount")
    }

}