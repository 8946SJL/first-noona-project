package kotlinReview

import kotlinReview.BoxProblem.*

/**
 * 1) 아래의 조건을 만족하는 Box 클래스를 구현해 주십시오
 * - Book, Food 등 Item 인터페이스를 구현하는 데이터 타입들만 담을 수 있다
 * - 최초의 item이 담기면서 (생성자 파라미터로 전달되면서) 생성되며, 내용물은 해당 item의 데이터 타입만 따라야 한다
 * - 내용물을 추가할 수 있는 put 메서드와, 내용물을 꺼낼 수 있는 draw 메서드를 가진다
 * 2) main 함수에서 아래의 행동을 수행해 주십시오
 * - Food 타입의 cake를 담은 Box 객체를 생성해 cake을 꺼내서 먹는다
 * - 동일한 Box에 Book 타입의 alice in wonderland를 담고 꺼내서 읽는다 (되면 안 됨!!)
 * 참고사항: 제네릭을 활용하지 않아도, 활용해도 좋습니다
 * */

class BoxProblem {
    interface Item {}

    data class Book(val name: String) : Item {
        fun read() {
            println("reading $name")
        }
    }

    data class Food(val name: String) : Item {
        fun eat() {
            println("eating $name")
        }
    }
    //storage 선언
    // TODO

    class Box(private var item: Item) {
        fun put(newItem: Item) {
            item = newItem
                }
        fun draw() {
            return unit
            }
        }
}

class Box <T : Item>(private var item: T) {
    fun put(newItem: T) {
        item = newItem
    }

    fun draw() {


    }    }








fun main() {
    val cake: Food = Food("cake")
    val box: Box = Box(cake)
    val food: Food? = box.draw()
    food?.eat()

    val aliceInWonderland: Book = Book("alice in wonderland")
    // ↓↓ 여기서부터 에러 떠야 함 (컴파일 또는 런타임)
    box.put(aliceInWonderland)
    val book: Book? = box.draw()
    book?.read()
}