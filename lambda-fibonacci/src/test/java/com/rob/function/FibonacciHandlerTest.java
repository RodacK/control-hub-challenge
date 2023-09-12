package com.rob.function;

import com.controlhub.exceptions.FibonacciException;
import com.controlhub.models.FibonacciRequest;
import com.controlhub.models.FibonacciResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciHandlerTest {

    private FibonacciHandler handler = new FibonacciHandler();

    private FibonacciRequest fibonacciRequest = new FibonacciRequest();


    @Test
    public void when_request_is_valid_then_response() {
        fibonacciRequest.setIndex(6);
        FibonacciResponse response = handler.execute(fibonacciRequest);
        Assertions.assertEquals(8,response.getValue());
    }

    @Test
    public void when_request_is_invalid_then_error() {
        fibonacciRequest.setIndex(null);
        FibonacciException exception = Assertions.assertThrows(FibonacciException.class, () -> handler.execute(fibonacciRequest));
        Assertions.assertTrue(exception.getMessage().contains("400"));
    }
}
