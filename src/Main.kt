fun main() {
    val input = "AAADSSSRRTTHAAAA"
    val output = compressString(input)
    println(output)  // Вывод: A3DS3R2T2HA4
}

fun compressString(input: String): String {
    if (input.isEmpty()) return ""

    val result = StringBuilder()
    var count = 1
    var currentChar = input[0]

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar)
            if (count > 1) {
                result.append(count)
            }
            currentChar = input[i]
            count = 1
        }
    }

    // Добавляем последний набор символов
    result.append(currentChar)
    if (count > 1) {
        result.append(count)
    }

    return result.toString()
}
