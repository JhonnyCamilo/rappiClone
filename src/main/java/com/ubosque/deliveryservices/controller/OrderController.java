package com.ubosque.deliveryservices.controller;

import com.ubosque.deliveryservices.model.PushNotificationRequest;
import com.ubosque.deliveryservices.service.PushNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private PushNotificationService pushNotificationService;

    @PostMapping("/order/notification")
    public void sendNotification() {
        PushNotificationRequest pushNotificationRequest = new PushNotificationRequest();
        pushNotificationRequest.setTitle("Delivery UBosque Orden");
        pushNotificationRequest.setMessage("La tienda esta preparando tu pedido");
        pushNotificationRequest.setToken("d-G3Bp9yRCCF5-wu_t8G9r:APA91bGkD8RKWTFsERL7Tt-WY-cttgMPEpcFVfbxbI9UIXmHolPtnzH9a6jCOmn5cqYstW0S6g5nsUow4hg0uZOjGIhgnoHe4KsZ6uj7MavVcmGwBLBKcM-5vTHTHHz27sDdKUu2a2Mj");
        pushNotificationService.sendPushNotificationToToken(pushNotificationRequest);
    }
}
