package module8.practical

 fun main() {
    val lg = TV(brand = "LG", model = "32LQ", diagonal = "32")
    val xiaome = TV(brand = "Xiaome", model = "Q2 55", diagonal = "55")
    val samsung = TV(brand = "Samsung", model = "Q80B", diagonal = "55")


   // println("TV is on? - ${lg.tvIsOn}")
  //  lg.tvOn()
   // println("TV is on? - ${lg.tvIsOn}")
    println("Вам доступны следующие кнопки \n" +
            "1 - кнопка включения/выключения телевизора \n" +
            "2 - кнопка переключения передач вверх \n" +
            "3 - кнопка переключения передач вниз \n" +
            "4 - кнопка увеличения громкости \n" +
            "5 - кнопка уменьшения громкости \n" +
            "6 - список всех доступных каналов")
    println("Нажмите кнопку")
   var functions = readLine()
       pult(functions)
      }
fun pult(function: String?) {
    when (function) {
        "1" -> tvOff() // добавить условие, если телевизор выключен, то выключить и сохранить канал и громкость,  если выключен то включить
        //"2" ->       // переключения передач вверх
        // "3" ->       // переключение передач вниз
        //"4" ->        // увеличение громкости
        //"5" ->        // уменьшение громкости
        //"6" ->        // список всех доступных каналов
        else -> inputError()  // нажали не ту кнопку на пульте
    }
}
fun tvOff() {         // функция выключения телевизора
    println("TV off")
    // tvIsOn = false
}

    fun tvOn(){          // функция включения телевизора
        println("TV on")
        //  tvIsOn = true
    }
     fun inputError() {
         println("Вы ввели не ту кнопку на пульте")
         println("Введите сново")
     }
    fun volumeOnTv(a: Int = 10, b: Double): Double { // увеличение громкости на заданую величину a - 10 шкала по кторой добовляеться звук,  b - время которое мы держим кнопку увеличения звука
         a * b = volume
        if volume >= 100, то volume = 100    // найти что подставить вместо то
        return volume
}
    fun volumeOffTv(a: Int = 10, b: Double): Double {        // уменьшение громкости на заданнуювеличину
        volume - (a * b)
        if volume <= 0, то volume = 0   // найти что подставить вместо то
        return volume
}

}
  /* fun main() {
        val action1 = selectAction(1)
        println(action1(8,5))    // 13

        val action2 = selectAction(2)
        println(action2(8,5))    // 3
    }
    fun selectAction(key: Int): (Int, Int) -> Int{
        // определение возвращаемого результата
        when(key){
            1 -> return ::sum
            2 -> return ::subtract
            3 -> return ::multiply
            else -> return ::empty
        }
    }
    fun empty (a: Int, b: Int): Int{
        return 0
    }
    fun sum(a: Int, b: Int): Int{
        return a + b
    }
    fun subtract(a: Int, b: Int): Int{
        return a - b
    }
    fun multiply(a: Int, b: Int): Int{
        return a * b
    }*/
   // 1 -> выполняеться функция
   // 2 -> выполняеться функция и т.д. + может еще выполняться
   // if functions = 1, то выполняем следующую функцию + println что изменилось и опять просим ввести цыфру

    // c консоли мы можем нажать на кнопки
    // увеличени громкости
    // уменьшения громкости
    // переключения каналов 1. На увеличение каналов 2. На уменьшение каналов + если телевизор выключен, то она и включает телевизор на заданный каналов
    // кнопка предоставления каналов 1 Fox и т.д.

    // задумка через принтлн мы показываем какой телевизор, включен, громкость и др.
    // нажатием определенных клавиш с консоли мы управляем. Пример нажав на 1 мы включаем телевизор.
    // нажав на 2 мы переключаем каналы + выходит запрос сколько времени вы держите клавишу переключения передач и переключает на заданный
    // тоже и со звуком


// команды нажать на включение