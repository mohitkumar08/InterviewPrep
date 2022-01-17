package com.codetest

/**
 * @created 03/01/22}
 * @author Mohit Kumar
 *
 */

fun main() {
    val context = HashMap<String, Any>()
    context["world"] = "John"
    context["count"] = 1
    context["tf"] = true

    val test = HashMap<String, Any>()
    test["world"] = "John"
    test["count"] = 1
    test["tf"] = true

    val status = test.keys.containsAll(context.keys)
    print("" + status)

}