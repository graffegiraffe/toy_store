package org.example.by.rublevskaya.toystore.client.extendClient;

import org.example.by.rublevskaya.toystore.client.AbstractClient;
import org.example.by.rublevskaya.toystore.client.Purchase;
import org.example.by.rublevskaya.toystore.discountSystem.Coupon;
import org.example.by.rublevskaya.toystore.toy.Toy;
import org.example.by.rublevskaya.toystore.worker.extendWorker.Salesperson;

public class PhysicalClient extends AbstractClient {
    private Coupon coupon;

    public PhysicalClient(String name) {
        super(name);
    }

    @Override
    public void buyToy(Toy toy, Salesperson cashier, double price) {
        if (toy == null || cashier == null) {
            throw new IllegalArgumentException("Неверные аргументы: toy или cashier не могут быть null");
        }
        double finalPrice = price;
        if (coupon != null) {
            finalPrice -= coupon.getDiscount(price);
            if (finalPrice < 0) {
                finalPrice = 0;
            }
        }
        Purchase purchase = new Purchase(toy, finalPrice);
        addPurchase(purchase);
        try {
            if (cashier instanceof Salesperson) {
                ((Salesperson) cashier).processPurchase(this, purchase);
            } else {
                throw new IllegalArgumentException("cashier должен быть типа Salesperson");
            }
        } catch (Exception e) {
            System.err.println("Ошибка при покупке: " + e.getMessage());
        }
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public Coupon getCoupon() {
        return coupon;
    }
}