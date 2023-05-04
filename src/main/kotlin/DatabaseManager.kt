object DatabaseManager {
    private val database = mutableMapOf<Int, Person>()

    fun store(key: Int, value: Person) {
        database[key] = value
    }

    fun getValueById(key: Int): Person? {
        return database[key]
    }

    fun getValueByName(key: String): Person? {
        return database.values.find { it.name == key }
    }

    fun getValueByLastName(key: String): Person? {
        return database.values.find { it.lastName == key }
    }

    fun getValueByEmail(key: String): Person? {
        return database.values.find { it.email == key }
    }

}