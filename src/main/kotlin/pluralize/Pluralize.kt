package pluralize

/**
 * pluralize returns the plural form of the string this function is called on. The plural form is
 *  - when count is 1, the string itself
 *  - when count is not 1 and plural is provided, the plural parameter
 *  - when count is not 1 and plural is not provided, the string with "s" appended to it.
 */
fun String.pluralize(count: Int, plural: String? = null): String =
    if (count == 1) this else plural ?: this + "s"
