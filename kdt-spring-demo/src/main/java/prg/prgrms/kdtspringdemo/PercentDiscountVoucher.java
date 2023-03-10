package prg.prgrms.kdtspringdemo;

import java.util.UUID;

public class PercentDiscountVoucher implements Voucher{
    private final UUID voucherId;
    private final long percent;

    public PercentDiscountVoucher(UUID voucherId, long amount) {
        this.voucherId = voucherId;
        this.percent = amount;
    }

    @Override
    public UUID getVoucherId() {
        return null;
    }

    @Override
    public long discount(long beforeDiscount) {
        return beforeDiscount * (percent / 100);
    }
}
