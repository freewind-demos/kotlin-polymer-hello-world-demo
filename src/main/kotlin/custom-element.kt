@JsName("window")
external object window {
    object Polymer {
        open class Element
    }

    object customElements {
        fun define(elementName: String, element: dynamic)
    }
}

// Define the class for a new element called custom-element
class CustomElement : window.Polymer.Element() {
    val textContent = "I'm a custom-element."
}

fun main(args: Array<String>) {
    // Register the new element with the browser
    window.customElements.define("custom-element", CustomElement::class.js)
}

