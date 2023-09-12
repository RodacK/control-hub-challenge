package com.controlhub.models;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Introspected
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class FibonacciRequest {

    private Integer index;
}
