package org.acme.reservation.inventory;

import io.smallrye.mutiny.Uni;
import org.acme.reservation.entity.Reservation;

import java.util.List;

public interface InventoryClient {
    Uni<List<Car>> allCars();
    Reservation save(Reservation reservation);
}
