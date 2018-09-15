package io.polarian.poolfeign

import io.polarian.poolfeign.github.Repo
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "user-api", url = "https://api.github.com")
interface UserClient {
    @GetMapping("/users/{username}/repos")
    fun getRepoListByUsername(@PathVariable username: String): List<Repo>
}
