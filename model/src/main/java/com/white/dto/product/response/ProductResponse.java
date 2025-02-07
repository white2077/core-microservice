package com.white.dto.product.response;

import lombok.Builder;

@Builder
public record ProductResponse(
    String id,
    String name,
    String description,
    Double price
) {
}
