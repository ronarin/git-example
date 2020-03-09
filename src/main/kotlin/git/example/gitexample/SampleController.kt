package git.example.gitexample

import git.example.gitexample.domain.User
import git.example.gitexample.domain.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class SampleController {

    @Autowired
    lateinit var userMapper: UserMapper

    @GetMapping("/hello")
    fun getHello() :String {
        return "Hello World"
    }

    @GetMapping("/{id}")
    fun findId(@PathVariable("id") id:Int): User {

        return userMapper.select(id)
    }

}