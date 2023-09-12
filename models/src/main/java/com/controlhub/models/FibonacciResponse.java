package com.controlhub.models;

import io.micronaut.core.annotation.Introspected;
import lombok.*;

@Introspected
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FibonacciResponse {

    private Integer value;

}
