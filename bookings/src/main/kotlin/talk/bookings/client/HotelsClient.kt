package talk.bookings.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import talk.bookings.dto.Hotel

@FeignClient("hotels-service")
interface HotelsClient {

    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/hotel")
    fun getHotels(): List<Hotel>

}