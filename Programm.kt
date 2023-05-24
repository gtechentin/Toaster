import java.util.Scanner
import kotlin.random.Random
fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the number of slices:")
    val numberOfSlices = scanner.nextInt()

    println("Enter the toasting time (in minutes):")
    val toastingTime = scanner.nextInt()

    //val myToaster = Toaster(2, numberOfSlices, "red")
    val mySuperToaster = SuperToaster(4, numberOfSlices, "green", Random.nextInt(300, 700))

    mySuperToaster.toast(numberOfSlices, toastingTime)
    if (mySuperToaster.slices <= mySuperToaster.capacity)
        mySuperToaster.displayInfo()
    else
        return
}