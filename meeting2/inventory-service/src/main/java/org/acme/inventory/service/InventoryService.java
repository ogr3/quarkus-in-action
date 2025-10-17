package org.acme.inventory.service;
import io.quarkus.grpc.MutinyService;

import jakarta.annotation.Generated;

@Generated(
        value = "by Mutiny Grpc generator",
        comments = "Source: inventory.proto")
public interface InventoryService extends MutinyService {
    io.smallrye.mutiny.Uni<org.acme.inventory.model.CarResponse>
    add(org.acme.inventory.model.InsertCarRequest request);
    io.smallrye.mutiny.Uni<org.acme.inventory.model.CarResponse>
    remove(org.acme.inventory.model.RemoveCarRequest request);
}