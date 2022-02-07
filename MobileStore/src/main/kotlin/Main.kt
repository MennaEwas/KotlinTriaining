fun main(args: Array<String>){
    println("This is Samsung phone")
    val s_mobile = Samsung("A21")
    s_mobile.get_price()
    s_mobile.get_discount()
    s_mobile.get_detail()
    println("")

    println("This is Apple phone")
    val a_mobile = Apple("11pro")
    a_mobile.get_price()
    a_mobile.get_discount()
    a_mobile.get_detail()
    println("")

    println("This is Huawei phone")
    val h_mobile = Huawei("N16")
    h_mobile.get_price()
    h_mobile.get_discount()
    h_mobile.get_detail()
    println("")
}



