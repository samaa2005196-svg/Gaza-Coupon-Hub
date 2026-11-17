
val coupons = mutableMapOf(
    "GAZA10" to 10,
    "SAVE20" to 20,
    "SHOP15" to 15
)

fun main() {

    while (true) {
        println("\n===== GAZA COUPON HUB =====")
        println("1. View Coupons")
        println("2. Add Coupon")
        println("3. Search Coupon")
        println("4. Exit")
        print("Choose an option: ")

        val choice = readln()

        when (choice) {
           "1" -> viewCoupons()
            "2" -> addCoupon()
            "3" -> searchCoupon()
            "4" -> {
                println("Goodbye!")
                break
            }
            else -> println("Invalid option! Try again.")
        }
    }
}

fun viewCoupons() {
    println("\n--- Available Coupons ---")

    for ((code, discount) in coupons) {
        println("$code - $discount% discount")
    }
}

fun addCoupon() {
    println("\n--- Add New Coupon ---")

    print("Enter coupon code: ")
    val code = readln().trim().uppercase()

    if (code.isEmpty()) {
        println("Coupon code cannot be empty!")
        return
    }

    if (coupons.containsKey(code)) {
        println("Coupon already exists!")
        return
    }

    print("Enter discount percentage: ")
    val discount = readln().toIntOrNull()

    if (discount == null || discount !in 1..100) {
        println("Invalid discount! Enter a number from 1 to 100.")
        return
    }

    coupons[code] = discount

    println("Coupon added successfully!")
}

fun searchCoupon() {
    println("\n--- Search Coupon ---")

    print("Enter coupon code: ")
    val code = readln().trim().uppercase()

    val discount = coupons[code]

    if (discount != null) {
        println("Coupon found!")
        println("Code: $code")
        println("Discount: $discount%")
    } else {
        println("Coupon not found!")
    }
}
