package com.gang.alphaspoon.validators;

import com.gang.alphaspoon.entity.Product;
import com.gang.alphaspoon.exceptions.ValidateServiceException;

public class ProductValidator {
    public static void save(Product product) {

        if(product.getName() == null || product.getName().trim().isEmpty()) {
            throw new ValidateServiceException("El nombre es requerido");
        }

        if(product.getName().length() > 100) {
            throw new ValidateServiceException("El nombre es muy largo (max 100)");
        }

        if(product.getPrice() == null) {
            throw new ValidateServiceException("El precio es requerido");
        }

        if(product.getPrice() < 0) {
            throw new ValidateServiceException("El precio es incorrecto");
        }
    }
}
