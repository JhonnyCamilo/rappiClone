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
        stores.add(new Store(1, "KFC", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638224729/descarga_glthij.png","sss"));
        stores.add(new Store(2, "PANAMERICANA", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638224883/descarga_1_fd0dkh.png","sss"));
        stores.add(new Store(3, "KTRONIX", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638224949/descarga_2_exsayw.png","sss"));
        stores.add(new Store(4, "JUMBO", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638224986/descarga_gyb6mh.jpg","sss"));
        stores.add(new Store(5, "FALABELLA", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638227272/descarga_4_w2il1f.jpg","sss"));
        stores.add(new Store(6, "ARROZ PAIZA", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638225095/descarga_4_eqew6k.png","sss"));
        stores.add(new Store(7, "AREPAS DOÑA JUANA", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638225133/descarga_1_ic3wsh.jpg","sss"));
        stores.add(new Store(8, "BUFFALO WINGS", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638227159/descarga_8_icvkkn.png","sss"));
        stores.add(new Store(9, "OLIMPICA", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638225207/descarga_6_rfeegx.png","sss"));
        stores.add(new Store(10, "FLAMINGO", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638227223/descarga_3_k7gncp.jpg","sss"));
       stores.add(new Store(11, "SOPAS DE LA ABUELA", "Calle 57 # 13 - 13 sur", "11.1112, 18.556655",2,1,"ssss","sss",
                "https://res.cloudinary.com/dc04oiqvh/image/upload/v1638225331/descarga_2_df01wx.jpg","sss"));
       
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
