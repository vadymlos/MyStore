package entity;

import lombok.Data;

@Data
public class Product {
    private String ItemId;

    public Product(String itemId) {
        ItemId = itemId;
    }
}
