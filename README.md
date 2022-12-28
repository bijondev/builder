# builder
Android builder design pattern


Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object.

    Creational Patterns

Rules for making a Builder class

The following rules are followed to make a Builder class:

    A private constructor
    An inner class usually called Builder
    function for each field to set the field value return
    function build return instance of the Main class

Following is the example of Builder class in Kotlin:

class Hamburger private constructor(
    val cheese: Boolean,
    val beef: Boolean,
    val onions: Boolean
) {
    class Builder {
        private var cheese: Boolean = true
        private var beef: Boolean = true
        private var onions: Boolean = true

        fun cheese(value: Boolean) = apply { cheese = value }
        fun beef(value: Boolean) = apply { beef = value }
        fun onions(value: Boolean) = apply { onions = value }

        fun build() = Hamburger(cheese, beef, onions)
    }
}
