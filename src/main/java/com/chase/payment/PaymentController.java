package com.chase.payment;

import java.util.ListIterator;
import org.springframework.web.client.RestTemplate;

import com.chase.payment.Model.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PaymentController {

    @PostMapping("/payment")
    public String postPayment(@RequestBody Payment payment) {

      return "ADJB24214631";
    }
}
