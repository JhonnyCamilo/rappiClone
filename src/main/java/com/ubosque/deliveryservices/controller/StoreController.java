package com.ubosque.deliveryservices.controller;

import com.ubosque.deliveryservices.model.Store;
import com.ubosque.deliveryservices.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class StoreController {

    @Autowired
    private StoreRepository storeRepository;

    @GetMapping("/stores")
    public List<Store> getStores() {
        return storeRepository.getStores();
    }

    @GetMapping(value = "/stores/{storeId}/logo", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public byte[] getImageWithMediaType(@PathVariable("storeId") String storeId) throws IOException {
        return storeRepository.getImageWithMediaType(storeId);
    }

}
