package talk.bookings.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import talk.bookings.client.HotelsClient
import talk.bookings.dto.Hotel
import talk.bookings.model.Booking
import java.util.concurrent.ThreadLocalRandom

@RestController
@RequestMapping("/booking")
class BookingsController {

    @Autowired
    var hotelsClient: HotelsClient? = null

    @GetMapping
    fun getBookings(): List<Booking> {
        if (bookings == null || bookings!!.isEmpty()) {
            populateBookings()
        }
        return bookings!!
    }

    @GetMapping("/perHotel")
    fun perHotel(): ArrayList<Hotel> {
        if (bookings == null || bookings!!.isEmpty()) {
            populateBookings()
        }
        val grouped = bookings!!.groupBy { it.hotel!!.id }
        val newList = ArrayList<Hotel>()
        grouped.forEach({
            val hotel = Hotel()
            hotel.id = it.key
            hotel.bookings = ArrayList()
            it.value.forEach({
                hotel.name = it.hotel!!.name
                hotel.bookings!!.add(Booking(it.id))
            })
            newList.add(hotel)
        })
        return newList
    }

    private fun populateBookings() {
        val hotels = hotelsClient!!.getHotels()
        val tempBookings = ArrayList<Booking>()
        hotels.forEach {
            val numberOfBookings = ThreadLocalRandom.current().nextInt(0, 5)
            for (i in 0..numberOfBookings) {
                tempBookings.add(Booking(it))
            }
        }
        bookings = tempBookings
    }

    companion object {
        var bookings: List<Booking>? = null
    }

}