package pluralize

import kotlin.test.Test
import kotlin.test.assertEquals

class PluralizeTest {
    @Test
    fun pluralizeWithoutSpecifiedPlural() {
        assertEquals("friends", "friend".pluralize(0))
        assertEquals("friend", "friend".pluralize(1))
        assertEquals("friends", "friend".pluralize(2))

        assertEquals("horses", "horse".pluralize(0))
        assertEquals("horse", "horse".pluralize(1))
        assertEquals("horses", "horse".pluralize(35))
    }

    @Test
    fun pluralizeWithSpecifiedPlural() {
        assertEquals("friends", "friend".pluralize(0, "friends"))
        assertEquals("friend", "friend".pluralize(1, "friends"))
        assertEquals("friends", "friend".pluralize(2, "friends"))

        // Custom "plural" form.
        assertEquals("xyz", "friend".pluralize(0, "xyz"))
        assertEquals("friend", "friend".pluralize(1, "xyz"))
        assertEquals("xyz", "friend".pluralize(2, "xyz"))
    }
}
