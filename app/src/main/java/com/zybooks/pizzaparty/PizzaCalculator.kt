package com.zybooks.pizzaparty

import kotlin.math.ceil

// const val SLICES_PER_PIZZA = 8

class PizzaCalculator(partySize: Int, var hungerLevel: HungerLevel, var pizzaSize: PizzaSize) {
    var partySize = 0
        set(value) {
            field = if (value >= 0) value else 0
        }

    enum class HungerLevel(var numSlices: Int) {
        LIGHT(2), MEDIUM(3), RAVENOUS(4)
    }

    enum class PizzaSize(var pizzaSlices: Int) {
        SMALL(6), MED(8), LARGE(12)
    }

    val totalPizzas: Int
        get() {
            return ceil(partySize * hungerLevel.numSlices / pizzaSize.pizzaSlices.toDouble()).toInt()
        }

    init {
        this.partySize = partySize
    }
}