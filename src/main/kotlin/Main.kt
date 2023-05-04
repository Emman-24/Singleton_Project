import io.github.serpro69.kfaker.Faker
import kotlin.random.Random

fun main() {

    for (i in 1..5) {
        val faker = Faker()
        val randomId = Random.nextInt(1, 100)
        val randomName = faker.name.firstName()
        val randomLastName = faker.name.lastName()
        val randomAge = Random.nextInt(1, 100)
        val randomEmail = faker.internet.email()
        val randomIsWorking = Random.nextBoolean()

        val person = Person(randomName, randomLastName, randomAge, randomEmail, randomIsWorking)
        DatabaseManager.store(randomId, person)

        val storedPerson = DatabaseManager.getValueById(randomId)
        println("Id    : $randomId")
        println("Name  : ${storedPerson?.name} Last name: ${storedPerson?.lastName}")
        println("Age   : ${storedPerson?.age}")
        println("Email : ${storedPerson?.email}")
        println("**____________________________________**)")
    }

}