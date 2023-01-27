package prg.prgrms.kdtspringdemo;

import java.util.UUID;

public class OrderItem {
    public final UUID productId;
    public final long productPrice;
    public final long quantituy;

    public OrderItem(UUID productId, long productPrice, int quantituy) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.quantituy = quantituy;
    }

    public UUID getProductId() {
        return productId;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public long getQuantituy() {
        return quantituy;
    }
}
