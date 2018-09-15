package io.polarian.poolfeign

import io.polarian.poolfeign.github.Repo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(val userClient: UserClient) {

    @GetMapping("/{username}/repos")
    fun getRepoListByUsername(@PathVariable username: String): List<Repo> {
        return userClient.getRepoListByUsername(username)
    }
}