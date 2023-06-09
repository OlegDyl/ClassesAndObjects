package module4
fun main() {
/*                             ПЕРЕМЕННЫЕ

Цели:
- Узнать, что такое переменные и для чего они нужны
- Понять, как работать с переменными
- Разобраться, какие виды переменных бывают

Переменная - это ссылка на некоторую область в оперативной памяти устройства.

При инициализации переменной выделяеться область памяти по какому-то адресу, в которую
помещяються данные.

Все программы так или иначе занимаються обработкой данных. Данные, с которыми программа
взаимодействует в данный момент, находиться в оперативной памяти.

Переменные позволяют программе получить доступ к этим данным.

 Переменные бывают:
 Изменяемые - могут ссылаться на разные участки памяти по мере работы программы.
 Неизменяемые - ссылаются на ту область в памяти, которая была присвоена переменной при инициализции.

   Чтобы обьявить переменную нужно:
   указать ключевое слова var(изменяемая переменная) или val(неизменяемая переменная), указать
   идентификатор переменной(ее имя), указвть тип данных (String, Long и тд.) на которых будет ссылаться переменная
   и указать значение для переменной(чему ровна). Пример:
    */
   var firstVariable: Int = 5
   val secondVariable: Int = 10

/* вся разница у них в том, что изменяемым переменным можно присваивать новые значения.
Правила для переменных: они должны быть осмысленные, начинаться с маленькой буквы, если переменная состоит из
нескольких слов, то последующие пишуться с большой буквы.

    Объявлять переменные можно без значения, а инициализируем ее одной или несколькими строками позже. Пример:
    */
    var eiffelTowerHeight: Int
    eiffelTowerHeight = 324
/* Для некоторых переменных можно не указывать тип данных Int, Long и тд. они беруться по умолчанию, но нужно
 быть аккуратным.
 */
}