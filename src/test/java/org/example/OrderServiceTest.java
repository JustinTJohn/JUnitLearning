package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class OrderServiceTest {

    @Mock
    private PaymentGateway paymentGateway;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void placeOrder_whenPayment100_thenReturnTrue(){
        //setting up
        when(paymentGateway.makePayment(100)).thenReturn(true);

        //making the actual call
        boolean result = orderService.placeOrder(100);

        //checking if the answer is correct for the input
        assertEquals(true,result);

        //verify
        verify(paymentGateway).makePayment(100);
    }
}