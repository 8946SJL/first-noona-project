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








//클래스,객체,인스턴스란?
// 클래스 정의
class 자동차 {
    var 브랜드: String = ""
    var 모델: String = ""
}

fun main() {
    // 객체 생성
    val carObject = 자동차() // 객체 'carObject' 생성

    // carObject 객체의 속성 설정
    carObject.브랜드 = "현대"
    carObject.모델 = "그랜저"

    // 객체를 가리키는 변수를 다른 변수에 할당하여 인스턴스 생성
    val carInstance: 자동차 = carObject // 'carObject' 객체를 'carInstance'에 할당

    // 객체와 인스턴스의 메모리 주소 비교
    println("carObject 객체의 주소: ${carObject.hashCode()}")
    println("carInstance의 주소: ${carInstance.hashCode()}")
}




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