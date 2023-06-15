package module4

fun main() {
    /*                     ТИПЫ ДАННЫХ. ЛОГИЧЕСКИЙ ТИП

    Цели и задачи урока
    - Узнать, что такое логический тип
    - Понять, как работать с переменными логического типа
    - Разобраться, как инициализтировать логические переменные

    Логический тип - тип данных, описывающий результат логического выражения. Может
    принимать только 2 значения: true или false

    Логическое выражение, результат которого может быть представлен одним из значений:
    Ложь или Истина.

    В основе логического типа и логического выражения лежат булева алгебра.
    Операнды логического выражения также могут быть логическими выражениями

    В Kotlin логический тип представлен типом Boolen

                        ОПЕРАЦИИ НАД ЛОГИЧЕСКИМИ ТИПАМИ

    Над логическими типами можно проводить 3 логических операции:
    - конъюнкция (Логическое "И")
    - дизъюнкция (Логическое "ИЛИ")
    - отрицание (Логическое "НЕ")

    Результаты этих операций всегда однозначны. Их можно найти в так называемых таблицах
    истинности.
    Полный список над логическим типом можно найти в официальной документации на
    сайте: kotlinlang.org
    Ввиде логигического выражения можно представить любое выражение результатом которого
    может быть истина или ложь.

    Инициализация логических переменных поддается всем тем же правилам, что и переменные
    остальных типов.
    При односторочной инициализации тип можно не указывать. Как и остальные типы переменную
    можно инициализировать сразу каким-либо выражением. Программа во время выполнения
    вычеслит результат выражения и присвоит значение этой переменной. */

    val number = 5

    val booleanExpression = true
    val isGreater: Boolean = 5 > 10
    val isEven = number % 2 == 0

    println(isEven)
    println("$number is even - $isEven")

}