# kt-pluralize

A function that returns the singular or plural form of a word depending on a count.

```kotlin
"friend".pluralize(5) // "friends"
"friend".pluralize(1) // "friend"

"goose".pluralize(5, "geese") // "geese"
"goose".pluralize(1, "geese") // "goose"
```