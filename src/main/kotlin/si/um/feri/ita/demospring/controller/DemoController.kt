package si.um.feri.ita.demospring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping("/hello")
    fun hello() = "Hello World!"
}