package com.ubosque.deliveryservices.repository;

import com.ubosque.deliveryservices.model.Store;

import java.io.IOException;
import java.util.List;

public interface StoreRepository {

    List<Store> getStores();
    byte[] getImageWithMediaType(String storeId) throws IOException;

}
