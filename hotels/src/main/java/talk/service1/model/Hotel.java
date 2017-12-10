package talk.service1.model;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class Hotel {

    private static final AtomicLong whateverCounter = new AtomicLong();

    public Hotel() {
        this.id = UUID.randomUUID().toString();
        this.name = "hotel " + whateverCounter.incrementAndGet();
    }

    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
