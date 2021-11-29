package com.ubosque.deliveryservices.repository;

import com.ubosque.deliveryservices.model.Store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryStoreRepository implements StoreRepository {

    private static final String IMG_PREFIX = "logo-store-";

    private List<Store> stores;

    @Value("${delivery.image-path}")
    private String imagePath;

    @PostConstruct
    public void initialize() {
        stores = new ArrayList<>();
        stores.add(new Store(1, "PRESTO12", "Hamburguesas", "Carnes",
                "http://10.0.2.2:8080/stores/1/logo"));
        stores.add(new Store(1, "KFC", "Pollo", "Carnes",
                "http://10.0.2.2:8080/stores/2/logo"));
        stores.add(new Store(1, "Fridays", "Pizza", "Pastas",
                "http://10.0.2.2:8080/stores/3/logo"));
    }

    @Override
    public List<Store> getStores() {
        return stores;
    }

    @Override
    public byte[] getImageWithMediaType(String storeId) throws IOException {
        String imageFileName = IMG_PREFIX + storeId;
        String completePath = imagePath + "/" + imageFileName + ".jpg";
        System.out.println("complete path is " + completePath);
        FileInputStream fis = new FileInputStream(completePath);
        return fis.readAllBytes();
    }
}
