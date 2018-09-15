package io.polarian.poolfeign.config

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.Configuration

@EnableFeignClients(basePackages = ["io.polarian.poolfeign"])
@Configuration
class FeignConfig