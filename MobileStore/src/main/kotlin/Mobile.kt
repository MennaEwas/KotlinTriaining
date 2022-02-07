//parent class
open class Mobile (model: String) {
    /** parent class, it has brand, model, price, discount for
     * each mobile ex:
     * brand: Samsung,
     * Model: M21,
     * Price: 2000,
     * Discount: 10%
     **/
    // properties
    var model: String = model

    //methods
    open fun get_price(){
        println("price from the store")
    }
    open fun get_detail(){
        println("The model of the mobile is $model")
    }

    open fun get_discount() {}
}
