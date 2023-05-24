class SuperToaster(capacity: Int, slices: Int, color: String, val temperature: Int) : Toaster(capacity, slices, color) {
    fun adjustTemperature(newTemperature: Int) {
        println("Adjusting temperature to $newTemperature degrees Celsius.")
    }

    override fun toast(numberOfToasts: Int, toastingTime: Int) {
        super.toast(numberOfToasts, toastingTime)
        if (temperature > 500 && slices <= capacity) {
            println("Warning: Temperature is too high!")
        } else if (slices <= capacity) {
            println("Temperature is normal.")
            println("Using the SuperToaster with temperature: $temperature degrees Celsius.")
        }
    }
}