package si.um.feri.ita.demospring

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoSpringApplicationTests {

	@Autowired
	private val restTemplate: TestRestTemplate? = null

	@Test
	fun contextLoads() {
		var body = this.restTemplate?.getForObject("/hello", String::class.java)
		assert(body == "Hello World!")
	}

}
