fun main() {
    println(isLeapYear(2017))
    println(isLeapYear(2020))
    casesWhen(1)
    casesWhen(9)

    casesWhen("Hiloong")
    casesWhen('H')
    casesWhen(null)
}

fun isLeapYear(year: Int): Boolean {
    var isLeapYear: Boolean = true
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        isLeapYear == true
    } else {
        isLeapYear == false
    }
    return isLeapYear
}

fun casesWhen(obj: Any?) {
    when (obj) {
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> println("$obj ===> 这是一个0-9之间的数字")

        "hello" -> println("$obj ===> 这是字符串hello")
        is Char -> println("$obj ===> 这是一个Char类型数据")
        else -> println("$obj ===> else类似于Java中的case-switch中的default")
    }
}