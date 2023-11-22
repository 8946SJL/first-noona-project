//프로퍼티와 생성자 매개변수의 차이

//val 키워드로 주 생성자의 매개변수 선언
/*
class PersonVal(val name: String) {
    fun displayName() {
        println("제 이름은 ${name}입니다.")
    }
}

fun main() {
    val person = PersonVal("Alice")
    person.displayName()


    println(person.name) // name에 접근하여 값을 가져옴
}

*/


//클래스 내부의 지역 변수로만 선언
/*class PersonWithoutVal(name: String) {
    private val personName = name

    fun displayName() {
        println("제 이름은 ${personName}입니다.")
    }
}

fun main() {
    val person = PersonWithoutVal("Alice")
    person.displayName() // "제 이름은 Alice입니다." 출력


    println(person.personName) // 오류! personName에 직접적으로 접근할 수 없음
}*/


//_도 내부변수? (패스?)
/*
class Person(_person: String) {
    var person:String = _person
    override fun toString(): String {
        return "이름: $person" // Person 클래스의 객체를 출력할 때 이름을 함께 출력
    }
}

fun main() {
    val a = Person("준")
    println(a) // 객체를 출력할 때 toString() 메서드가 호출되어 "이름: 준"이 출력됨
}

*/





//6페이지 (기본값 설정 가능) 클래스 선언(6)
/*

data class WeatherInformation constructor(
    val currentTemperature: Int,
    val maxTemperature: Int,
    val minTemperture: Int = 0 //기본값 설정
) {
    constructor(currentTemperature: Int,maxTemperature: Int,minTemperture: Int,location: String) : this (
        currentTemperature,
        maxTemperature,
        minTemperture
    )
}

fun main() {


    var weather = WeatherInformation(10,15)
    var weather2 = WeatherInformation(20,30, location = "강남구 대치동") //주 생성자의 기본값은 부생성자에서 호출 시 사용x
    println("weather: ${weather}")
    println("weather2: ${weather2}")
}*/



//부 생성자 (패스)
/*
class Student {
    var name: String
    var age: Int
    var height: Int
    var gender: Boolean

    constructor(_name: String, _age: Int, _height: Int, _gender: Boolean) {
        name = _name
        age = _age
        height = _height
        gender = _gender
    }

    fun run() = println("$name 달립니다.")
    fun jump() = println("$name 점프합니다.")
    fun sing() = println("$name 노래합니다.")
    fun study() = println("$name 공부합니다.")
} */


//주 생성자
/*class Student(_name: String, _age: Int, _height: Int, _gender: Boolean) {
    var name: String = _name
    var age: Int = _age
    var height: Int = _height
    var gender: Boolean = _gender

    fun run() = println("$name 달립니다.")
    fun jump() = println("$name 점프합니다.")
    fun sing() = println("$name 노래합니다.")
    fun study() = println("$name 공부합니다.")
}*/

//내부의 프로퍼티를 생략한 주 생성자 (패스)
/*class Student(val name: String, val age: Int, val height: Int, val gender: Boolean) {
    fun run() = println("$name 달립니다.")
    fun jump() = println("$name 점프합니다.")
    fun sing() = println("$name 노래합니다.")
    fun study() = println("$name 공부합니다.")
}*/


//초기화 블록 init을 통해 기능을 구현한 주 생성자 (패스)
/*class Student(val name: String, val age: Int, val height: Int, val gender: Boolean) {
    init {
        println("init 초기화 블록 호출됩니다.")
    }

    fun run() = println("$name 달립니다.")
    fun jump() = println("$name 점프합니다.")
    fun sing() = println("$name 노래합니다.")
    fun study() = println("$name 공부합니다.")
}*/



//클래스의 추상화란
/*class Student {
    var name: String = "김주엽"
    var age: Int = 18
    var height: Int = 172
    var gender: Boolean = false

    fun run() = println("$name 달립니다.")
    fun jump() = println("$name 점프합니다.")
    fun sing() = println("$name 노래합니다.")
    fun study() = println("$name 공부합니다.")
}*/




//클래스의 상속이란?
/*open class Food(var name: String, var price: Int) {
    fun sell() = println("$name 판매합니다.")
}

class Chicken(var maker: String) : Food("고추 바사삭", 16000) {
    fun fry() {
        println("$name 튀깁니다.")
        sell()
    }
}

fun main() {
    var a =Chicken("bhc")
    println(a.fry())
}*/
//출력 순서 질문
//고추 바사삭 튀깁니다.
//고추 바사삭 판매합니다.
//사실 쉬운건데 제가 처음에 그냥 대충보고 슈퍼클래스 먼저 실행된다고 고정관념이 있어가지고 틀렸던 것 같아요
//fry호출하니 튀깁니다 출력하고 그 뒤 sell() 함수 출력






//클래스의 다형성이란?

//오버로딩
/*
class Calculation {
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y + z
    fun add(x: String, y: String): String = x + y
}
*/


//오버라이딩
/*open class Human {
    open fun sing() = println("노래를 부른다.")
}

class Singer : Human() {
    override fun sing() = println("노래를 잘 부른다.")
}*/






//ComponentN()메소드
/*
data class People(
    val name: String,
    val age: Int
)


fun main() {
    val peopleA = People("H43RO", 23)
    val (name, age) = peopleA

    println("Destructuring Declarations : $name, $age")
}
*/



//data class를 사용하지 않고 개발자가 직접 component1()과 component2()와 같은 메소드를 호출
/* class People(
    val name: String,
    val age: Int
) {
    operator fun component1() = name
    operator fun component2() = age
}

fun main() {
    val peopleA = People("H43RO", 23)

    val name = peopleA.component1() // 직접 component1() 메소드 호출하여 name을 가져옴
    val age = peopleA.component2() // 직접 component2() 메소드 호출하여 age를 가져옴

    println("Name: $name, Age: $age")
} */


//불편