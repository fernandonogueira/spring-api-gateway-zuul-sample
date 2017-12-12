package talk.bookings.dto

import talk.bookings.model.Booking

class Hotel {
    var id: String? = null
    var name: String? = null
    var bookings: ArrayList<Booking>? = null
}