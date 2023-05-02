fun printNumbers(vararg numbers: Int) {
	for (number in numbers) {
		println(number)
	}
}

fun main(args: Array<String>) {
	printNumbers(1, 2, 3, 4, 5)
	printNumbers(10, 20, 30)
}
