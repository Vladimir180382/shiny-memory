package connectfour

import java.util.*

val scanner = Scanner(System.`in`)

// функция  строки номера столбцов
fun column(columnsLength: Int): String {
    var columns = " "
    for (i in 1..columnsLength) {
        columns = "$columns$i "
    }
    columns = columns.substringBeforeLast(' ')
    return columns
}

// функция основы таблицы, рисуем последнюю строку
fun plainText(plainTextLength: Int): String {
    var plain = ""
    for (i in 1..plainTextLength + 1) {
        plain = "$plain$i "
    }
    plain = plain.replace(Regex("[0-9]+ "), "=")
    return plain
}

var countColumn = 0 // счетчик ничьи

// функция хода игрока
// Возращаемыезначения:
//  0 - ничья
//  1 - выигрыш
//  2 - досрочный выход из игры
//  3 - ходит следующий игрок
fun goPlayerSingle(
    rows: Int,
    columns: Int,
    boardMutList: Array<Array<String>>,
    namePlayer: String,
    charPlayer: String
): Int {
    val defaultVal = " "
    while (true) {
        println("$namePlayer's turn:")
        val playerColumn = scanner.nextLine()!!// ход  игрока с номером столбца
        if (playerColumn == "end") {
            return 2
        }
        // проверка на правильный ввод столбца ввиде числа
        if (playerColumn.any { it.isLetter() }) {
            println("Incorrect column number")
        } else {
            // проверка входит ли число в диапазон кол-ва столбцов
            if (playerColumn.toIntOrNull() !in 1..columns) {
                println("The column number is out of range (1 - $columns)")
            } else {
                //проверка на свободное место в столбце
                // если не полный
                var columnFull = true
                for (ind in (rows - 1) downTo 0) {
                    if (boardMutList[ind][playerColumn.toInt() - 1] == defaultVal) {
                        columnFull = false
                        boardMutList[ind][playerColumn.toInt() - 1] = charPlayer
                        break
                    }
                }
                //проверка на выигрыш по строкам

                for (i in (rows - 1) downTo 0) {
                    for (j in 0 until columns) {
                        if (j + 3 < columns) {
                            if (boardMutList[i][j] == boardMutList[i][j + 1] &&
                                boardMutList[i][j + 1] == boardMutList[i][j + 2] &&
                                boardMutList[i][j + 2] == boardMutList[i][j + 3] &&
                                boardMutList[i][j] != defaultVal
                            ) {

                                // печать колличества столбцов
                                println(column(columns))
                                // печать массива
                                for (el in boardMutList) {
                                    for (cell in el) {
                                        print("|$cell")
                                    }
                                    println("|")
                                }
                                //печать основы таблицы
                                println(plainText(columns * 2))
                                return 1
                            }
                        }
                    }

                }
                // проверка на выигрыш по вертикали
                for (j in 0 until columns) {
                    for (i in (rows - 1) downTo 0) {
                        if (i + 3 < rows) {
                            if (boardMutList[i][j] == boardMutList[i + 1][j] &&
                                boardMutList[i + 1][j] == boardMutList[i + 2][j] &&
                                boardMutList[i + 2][j] == boardMutList[i + 3][j] &&
                                boardMutList[i][j] != defaultVal
                            ) {
                                // печать колличества столбцов
                                println(column(columns))
                                // печать массива
                                for (el in boardMutList) {
                                    for (cell in el) {
                                        print("|$cell")
                                    }
                                    println("|")
                                }
                                //печать основы таблицы
                                println(plainText(columns * 2))
                                return 1
                            }
                        }
                    }
                }
                // определение индексов  диагоналей
                val diags: MutableList<MutableList<Pair<Int, Int>>> = ArrayList()
                for (i in 3 until rows) {
                    // определяем диагональ одну
                    val diag: MutableList<Pair<Int, Int>> = ArrayList()
                    var rd = i
                    for (cd in 0..i) {
                        diag.add(Pair(rd, cd))
                        rd -= 1
                        if (rd == -1) {
                            break
                        }
                    }
                    diags.add(diag)
                }
                for (i in 0 until rows - 3) {
                    // определяем диагональ одну
                    val diag: MutableList<Pair<Int, Int>> = ArrayList()
                    var rd = i
                    for (cd in columns - 1 downTo i) {
                        diag.add(Pair(rd, cd))
                        rd += 1
                        if (rd == rows) {
                            break
                        }
                    }
                    diags.add(diag)
                }
                for (i in rows - 2 downTo 0) {
                    // определяем диагональ одну
                    val diag: MutableList<Pair<Int, Int>> = ArrayList()
                    var rd = i
                    for (cd in 0 until columns) {
                        diag.add(Pair(rd, cd))
                        rd += 1
                        if (rd == rows) {
                            break
                        }
                    }
                    diags.add(diag)
                }
                for (i in 3 until rows) {
                    // определяем диагональ одну
                    val diag: MutableList<Pair<Int, Int>> = ArrayList()
                    var rd = i
                    for (cd in columns - 1 downTo 0) {
                        if (rd >= 0) {
                            diag.add(Pair(rd, cd))
                            rd -= 1
                            if (rd == -1) {
                                break
                            }
                        }
                    }
                    diags.add(diag)
                }
                for (diag in diags) {
                    if (diag.count() >= 4) {
                        var countWin = 0
                        var curruntValue = ""
                        for ((x, y) in diag) {
                            if (boardMutList[x][y] != defaultVal && boardMutList[x][y] == curruntValue) {
                                countWin += 1
                            } else {
                                countWin = 0
                            }
                            if (countWin == 3) {
                                // печать колличества столбцов
                                println(column(columns))
                                // печать массива
                                for (el in boardMutList) {
                                    for (cell in el) {
                                        print("|$cell")
                                    }
                                    println("|")
                                }
                                //печать основы таблицы
                                println(plainText(columns * 2))
                                return 1
                            }
                            curruntValue = boardMutList[x][y]
                        }

                    }
                }

                // проверка на ничью
                if (boardMutList[0][playerColumn.toInt() - 1] == charPlayer) {
                    countColumn++
                }
                if (countColumn == columns) {
                    // печать колличества столбцов
                    println(column(columns))
                    // печать массива
                    for (el in boardMutList) {
                        for (cell in el) {
                            print("|$cell")
                        }
                        println("|")
                    }
                    //печать основы таблицы
                    println(plainText(columns * 2))
                    return 0
                }

                if (columnFull) { // если столбец полный
                    println("Column $playerColumn is full")
                } else {
                    break
                }
            }
        }
    }
// печать колличества столбцов
    println(column(columns))
// печать массива
    for (el in boardMutList) {
        for (cell in el) {
            print("|$cell")
        }
        println("|")
    }
//печать основы таблицы
    println(plainText(columns * 2))
    return 3
}

// функция запроса кол-ва игр
fun numberOffGames(_firstName: String, _secondName: String, _rowsBoard: Int, _columnsBoard: Int): String {
    var numberOfGames: String = ""
    while (true) {
        val question = """Do you want to play single or multiple games?
                    |For a single game, input 1 or press Enter
                    |Input a number of games:"""
        println(question.trimMargin()) // печать вопроса о колл-ве игр
        numberOfGames = scanner.nextLine() // ввод кол-ва игр

        if (numberOfGames.isEmpty() || numberOfGames == "1") {
            println("$_firstName VS $_secondName".trim())
            println("$_rowsBoard X $_columnsBoard board".trim())
            println("Single game")
            break // успешный ввод
        }

        val regex1 = Regex("""^[1-9]\d*$""") // проверка на правильный ввод кол-ва игр

        if (numberOfGames.matches(regex1) && numberOfGames.toInt() > 1) {
            println("$_firstName VS $_secondName".trim())
            println("$_rowsBoard X $_columnsBoard board".trim())
            println("Total $numberOfGames games")
            println("Game #1")
            break // успешный ввод
        }

        if (numberOfGames.matches(regex1) == false) {
            println("Invalid input".trim())
            continue // ввод кол-ва игр не верный
        }
    }
    return numberOfGames
}

// функция печати  пустой таблицы
fun printTable(
    colcolumn: Int, boardMutableList: Array<Array<String>>, charVal: String
) {
    println(column(colcolumn))
    for (el in boardMutableList) {
        for (cell in el) {
            print("|$charVal")
        }
        println("|")
    }
    println(plainText(colcolumn * 2))
}

// функция игра
// Возращаемыезначения:
//  0 - ничья
//  5 - выигрыш 1-го игрока
//  4 - выигрыш 2-го игрока
//  2 - досрочный выход из игры
fun game(
    rows: Int,
    columns: Int,
    boardMutList: Array<Array<String>>,
    firstName: String,
    secondName: String,
    firstCharPlayer: String,
    secondCharPlayer: String
): Int {
    while (true) {

        var res = goPlayerSingle(
            rows,
            columns,
            boardMutList,
            firstName,
            firstCharPlayer
        )
        if (res != 3) {
            if (res == 1) return 5
            return res
        }
        res = goPlayerSingle(
            rows,
            columns,
            boardMutList,
            secondName,
            secondCharPlayer
        )
        if (res != 3) {
            if (res == 1) return 4

            return res
        }
    }
}

fun main() {
    println("Connect Four") // Название игры
    println("First player's name:")
    val firstName = scanner.nextLine() // имя 1го игрока
    println("Second player's name:")
    val secondName = scanner.nextLine() // имя 2го игрока
    val askBoardDimensions = """Set the board dimensions (Rows x Columns)
                                |Press Enter for default (6 x 7)"""
    println(askBoardDimensions.trimMargin()) // печать запроса размера платы
    // ввод размеров доски игроками
    // проверка на правильный ввод доски
    var rowsBoard = 6
    var columnsBoard = 7
    val defaultVal = " "
    var boardMutList = Array(rowsBoard) { Array(columnsBoard) { defaultVal } }
    var numberOfGames: String = ""
    while (true) {
        var strBoardDimensions = scanner.nextLine()
        // если ввод пустой
        if (strBoardDimensions.isEmpty()) {
            numberOfGames = numberOffGames(firstName, secondName, rowsBoard, columnsBoard)
            printTable(columnsBoard, boardMutList, defaultVal)
            break
            // успешное выполнение программы
        }
        // если не пустой
        strBoardDimensions = strBoardDimensions.filter { it != ' ' }
        val regex = Regex("""^\s*\d+\s*[xX]{1}\s*\d+\s*$""")

        if ((strBoardDimensions.matches(regex) == false)) {
            println("Invalid input".trim())
            println(askBoardDimensions.trimMargin())
            continue
        }

        if (strBoardDimensions.matches(regex)) { // если ввод правильный то следующее
            //  убираем из строки все символы кроме цифр
            val strDigits = strBoardDimensions.filter { it.isDigit() }
            strDigits.trim() // убираем пробелы по концам строки
            // переводим строку в список из строки в числа
            val digitsList = strDigits.map { it.toString().toInt() }
            // проверка условий на размеры строк и столбцов
            val rows = digitsList[0]
            val columns = digitsList[1]
            // если в диапазон не попадаем тогда выводим следующее:

            if (rows < 5 || rows > 9) {
                println("Board rows should be from 5 to 9")
                println(askBoardDimensions.trimMargin())
                continue
            }

            if (columns < 5 || columns > 9) {
                println("Board columns should be from 5 to 9")
                println(askBoardDimensions.trimMargin())
                continue
            }

            rowsBoard = rows
            columnsBoard = columns
            boardMutList = Array(rowsBoard) { Array(columnsBoard) { defaultVal } }
            numberOfGames = numberOffGames(firstName, secondName, rowsBoard, columnsBoard)
            printTable(columns, boardMutList, defaultVal)
            break
        }
    }
    val player1 = "o" // знак первого игрока
    val player2 = "*" // знак второго игрока
    var countFirstPlayer = 0
    var countSecondPlayer = 0
    if (numberOfGames.isEmpty()) {
       numberOfGames = "1"
    }
    val number = numberOfGames.toInt()


    for (i in 1..number) {
        val isFirstPlayer: Boolean = (i % 2 != 0)
        var res = 0
        if (isFirstPlayer == true) {
            res = game(rowsBoard, columnsBoard, boardMutList, firstName, secondName, player1, player2)
        } else res = game(rowsBoard, columnsBoard, boardMutList, secondName, firstName, player2, player1)
        //  2 - досрочный выход из игры
        if (res == 2) {
            println("Game over!")
            return
        }
        //  0 - ничья
        if (res == 0) {
            countFirstPlayer += 1
            countSecondPlayer += 1
            println("It is a draw")
            boardMutList = Array(rowsBoard) { Array(columnsBoard) { defaultVal } }
            countColumn = 0
        }
        //  4 - выигрыш 2-го игрока
        if (res == 4) {
            if (isFirstPlayer == true) {
                countSecondPlayer += 2
                println("Player $secondName won")
            }  else {
                countFirstPlayer += 2
                println("Player $firstName won")
            }
            boardMutList = Array(rowsBoard) { Array(columnsBoard) { defaultVal } }
            countColumn = 0
        }
        //  5 - выигрыш 1-го игрока
        if (res == 5) {
            if (isFirstPlayer == true) {
                countFirstPlayer += 2
                println("Player $firstName won")
            } else {
                countSecondPlayer += 2
                println("Player $secondName won")
            }
            boardMutList = Array(rowsBoard) { Array(columnsBoard) { defaultVal } }
            countColumn = 0
        }
        if (number != 1) {
            println("Score")
            println("$firstName: $countFirstPlayer $secondName: $countSecondPlayer")
            if (i != number) {
                println("Game #${i + 1}")
                printTable(columnsBoard, boardMutList, defaultVal)
            } else println("Game over!")
        } else println("Game over!")
    }
}










