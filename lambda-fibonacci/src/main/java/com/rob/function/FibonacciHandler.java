package com.rob.function;

import com.controlhub.enums.MessagesEnums;
import com.controlhub.exceptions.FibonacciException;
import com.controlhub.models.FibonacciRequest;
import com.controlhub.models.FibonacciResponse;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Introspected
public class FibonacciHandler extends MicronautRequestHandler<FibonacciRequest, FibonacciResponse> {

    @Override
    public FibonacciResponse execute(FibonacciRequest request) {
        if(Objects.isNull(request.getIndex())){
            throw new FibonacciException(MessagesEnums.INVALID_INDEX.getAll());
        }
        Map<Integer, Integer> lookup = new HashMap<>();
        int result = fibonacci(request.getIndex(), lookup);

        FibonacciResponse response = FibonacciResponse.builder().value(result).build();
        return response;
    }

    public static int fibonacci(int n, Map<Integer, Integer> lookup) {
        if (n <= 1) {
            return n;
        }
        lookup.putIfAbsent(n, fibonacci(n - 1, lookup) + fibonacci(n - 2, lookup));
        return lookup.get(n);
    }
}
