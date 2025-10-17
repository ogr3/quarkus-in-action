package org.acme.reservation.inventory;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

import jakarta.inject.Singleton;
import org.acme.reservation.reservation.Reservation;

@Singleton
public class InMemoryInventoryClient implements InventoryClient {
    private final AtomicLong ids = new AtomicLong(0);
    private final List<Reservation> store =
            new CopyOnWriteArrayList<>();

    private static final List<Car> ALL_CARS = List.of(
            new Car(1L, "ABC-123", "Toyota", "Corolla"),
            new Car(2L, "ABC-987", "Honda", "Jazz"),
            new Car(3L, "XYZ-123", "Renault", "Clio"),
            new Car(4L, "XYZ-987", "Ford", "Focus")
    );
    @Override
    public List<Car> allCars() {
        return ALL_CARS;
    }

    @Override
    public Reservation save(Reservation reservation) {
        reservation.id = ids.incrementAndGet();
        store.add(reservation);
        return reservation;
    }
}