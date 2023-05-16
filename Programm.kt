import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number of slices:")
    val numberOfSlices = scanner.nextInt()

    println("Enter the toasting time (in minutes):")
    val toastingTime = scanner.nextInt()

    val myToaster = Toaster(2, numberOfSlices, "red")


    myToaster.toast(numberOfSlices, toastingTime)

    if (myToaster.slices <= myToaster.capacity)
        myToaster.displayInfo()
    else
        return
}