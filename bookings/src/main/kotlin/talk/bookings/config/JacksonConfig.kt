package talk.bookings.config

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration

@Configuration
class JacksonConfig {

    @Autowired
    fun jackson(mapper: ObjectMapper) {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
    }

}