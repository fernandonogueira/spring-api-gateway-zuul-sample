package talk.hotels.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import talk.hotels.model.Hotel;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hotel")
public class SampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);

    private static List<Hotel> hotels;

    @GetMapping
    public List<Hotel> getHotels() {
        LOGGER.info("Returning hotels list...");
        return hotels;
    }

    static {
        hotels = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            hotels.add(new Hotel());
        }
    }

}
