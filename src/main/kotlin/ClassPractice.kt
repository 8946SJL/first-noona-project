import kotlin.math.max

//클래스를 만드는 이유

//4페이지

/*
fun main () {
    var a= WeatherInformation(20,30,19,"강남구 대치동") //클래스를 사용해서 객체를 만들 때 필요한 정보들을 생성자 파라미터로 선언
    println("${a}")
}

class WeatherInformation  (
    val currentTemperature: Int,
    val maTemperature: Int,
    val minTemperture: Int,
    val location: String
)
*/



//5페이지

/*data class WeatherInformation (
    val currentTemperature: Int,
    val maxTemperature: Int,
    val minTemperture: Int,


) {
    constructor(currentTemperature: Int,maxTemperature: Int,minTemperture: Int,location: String) : this (
        currentTemperature,
        maxTemperature,
        minTemperture,

    )
}

fun main() {
    var weather = WeatherInformation(20,30,19,"강남구 대치동")
    println("weather: ${weather}")
}*/

//5페이지 주생성자 부생성자 모두 location 추가 (오류뜨는 이유?)
/*data class WeatherInformation(
    val currentTemperature: Int,
    val maxTemperature: Int,
    val minTemperture: Int,
    val location: String
) {
    constructor(currentTemperature: Int, maxTemperature: Int, minTemperture: Int, location: String) : this(
        currentTemperature,
        maxTemperature,
        minTemperture,
        location
    )
}

fun main() {
    var weather = WeatherInformation(20, 30, 19, "강남구 대치동")
    println("weather: ${weather}")
}*/

/*//6페이지 (기본값 설정 가능) 클래스 선언(6)

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


//6페이지 부생성자(constructor)없이 location을 주생성자에 넣고 minTemperturere 기본값
/*data class WeatherInformation constructor(
    val currentTemperature: Int,
    val maxTemperature: Int,
    val minTemperture: Int,
    val location: String = "강남구 대치동" //location 기본값 설정 가능
    //이 값을 항상 전달할 수는 없다라는 가정이 있어서 불러올 수 있는 객체로 만들어놓음으로써 생성자 유형 여러가지 지원
)

fun main() {
    var weather = WeatherInformation(20,30,10, location = "성동구 장안동")
    var weather2 = WeatherInformation(20,30,35)
    println("weather: ${weather}")
    println("weather: ${weather2}")
}*/








//12페이지 상위 프로퍼티 재정의

/*

open class WeatherInformation (
    open val currentTemperature: Int,
    open val maxTemperature: Int,
    open val minTemperture: Int,
    open val location: String
)

data class TemperatureInformation(override val currentTemperature: Int, override val maxTemperature: Int, override val minTemperture: Int) : WeatherInformation (
    currentTemperature,
    maxTemperature,
    minTemperture,
    ""
) {
    val displayTemperature: String
        get() = "최고: ${maxTemperature}, 최저: ${minTemperture}"
}


fun main() {
    var weather = WeatherInformation(20,30,19,"강남구 대치동")
    println(weather.location)

    var weather2 = TemperatureInformation(20,30,19)
    println(weather2)
}
*/



//14페이지
/*
open class Shape(vertextCount: Int) {
    init {
        println("Superclass 초기화, vertextCount=${vertextCount}")
    }
    open fun draw() {
        println("Drawing a shape")
    }
}

class Rectangle(vertextCount: Int) : Shape(vertextCount) {
    init {
        println("Subclass 초기화, vertextCount=${vertextCount}")
    }

    override fun draw() {
        super.draw()
        println("Drawing a rectangle")
    }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(4)
    rectangle.draw()

    println(" ")
    val shape = Shape(4)
    shape.draw()
}*/


