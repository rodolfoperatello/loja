package br.com.bicycleshop.bicycleshop.controller.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProductRequest {

    @NotNull(message = "O nome não pode ser nulo")
    private String nome;
    @Min(message = "O valor mínimo é 0", value = 0)
    private BigDecimal price;
}
