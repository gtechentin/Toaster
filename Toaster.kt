open class Toaster(val capacity: Int, val slices: Int, val color: String) {
    open fun toast(numberOfToasts: Int, toastingTime: Int) {
        if (numberOfToasts <= capacity && toastingTime > 0) {
            println("Starting toasting process...")
            println("Toasting $numberOfToasts slices of bread in the $color toaster.")
            val browningLevel = calculateBrowningLevel(toastingTime)
            println("Toasting finished.")
            println("Toast is $browningLevel.")
        }
        else if (capacity < numberOfToasts) {
            println("Too many slices of bread for the toaster.")
        }
            else
         {
            println("Invalid input. Please specify a valid number of toasts and toasting time.")
        }
    }

    private fun calculateBrowningLevel(toastingTime: Int): String {
        return when (toastingTime) {
            in 1..2 -> "lightly toasted"
            in 3..4 -> "moderately toasted"
            in 5..6 -> "well toasted"
            else -> "burnt"
        }
    }

    fun displayInfo() {
        println("Toaster Information:")
        println("The Toaster has a capacity of: $capacity slices")
        println("Number of Slices: $slices")
        println("Color: $color")
    }
}