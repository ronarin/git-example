package git.example.gitexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitExampleApplication

fun main(args: Array<String>) {
	runApplication<GitExampleApplication>(*args)
}
