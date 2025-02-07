package com.white.dto.product.request;

import lombok.Builder;

@Builder
public record ProductRequest(
    String name,
    String description,
    Double price
) {
}
