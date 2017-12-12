package talk.bookings.model

import talk.bookings.dto.Hotel
import java.util.*

class Booking {

    constructor(hotel: Hotel?) {
        this.hotel = hotel
    }

    constructor(id: String) {
        this.id = id
    }

    var id: String = UUID.randomUUID().toString()
    var hotel: Hotel? = null

}