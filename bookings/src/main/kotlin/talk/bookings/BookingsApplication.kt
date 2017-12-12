package talk.bookings

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
class BookingsApplication

fun main(args: Array<String>) {
    SpringApplication.run(BookingsApplication::class.java, *args)
}
