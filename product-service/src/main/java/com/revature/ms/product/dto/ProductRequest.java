package com.revature.ms.product.dto;

import java.math.BigDecimal;

public record ProductRequest(Long id, String name, String description,
                             String skuCode, BigDecimal price) { }
