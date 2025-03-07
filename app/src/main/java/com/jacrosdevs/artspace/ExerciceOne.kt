package com.jacrosdevs.artspace

enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

public data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int
)

val event1 = Event(
    title = "Wake up",
    description = "Time to get up",
    daypart = Daypart.MORNING,
    durationInMinutes = 0
)
val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
val event3 =
    Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
val event5 = Event(
    title = "Watch latest DevBytes video",
    daypart = Daypart.AFTERNOON,
    durationInMinutes = 10
)
val event6 = Event(
    title = "Check out latest Android Jetpack library",
    daypart = Daypart.EVENING,
    durationInMinutes = 45
)

val events: MutableList<Event> =
    mutableListOf<Event>(event1, event2, event3, event4, event5, event6)

fun main() {
    val shortEvents = events.filter {
        //es como una condicion devuelve un Boolean
        it.durationInMinutes < 60
    }
    println("You have ${shortEvents.size} short events")

    println("Short Events: ")
    println()
    shortEvents.forEach {
        println("${it.title} -> duration ${it.durationInMinutes}")
    }
    println("exercise 5 ")
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }



    println("exercise 6")
    println(events.last().title)

    println("exercise 7")

}

val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
