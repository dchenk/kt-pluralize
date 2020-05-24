# kt-pluralize

A function that returns the singular or plural form of a word depending on a count.

[![Release](https://jitpack.io/v/dchenk/kt-pluralize.svg)](https://jitpack.io/#dchenk/kt-pluralize)

```kotlin
"friend".pluralize(5) // "friends"
"friend".pluralize(1) // "friend"

"goose".pluralize(5, "geese") // "geese"
"goose".pluralize(1, "geese") // "goose"
```