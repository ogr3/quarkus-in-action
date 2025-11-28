package org.acme.reservation.inventory;

import org.acme.reservation.entity.Reservation;

import java.util.List;

public interface InventoryClient {
    List<Car> allCars();
    Reservation save(Reservation reservation);
}
