package com.example.Ewallet.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payment_id;

    @Column(name = "payment_uuid")
    private UUID payment_uuid;

    @Enumerated(value = EnumType.STRING)
    private Payment_Method payment_method;

    @Column(name = "amount")
    private double amount;

    @Column(name = "date")
    private LocalDateTime date;

    public Payment() {
    }

    public Payment(Long payment_id, UUID payment_uuid, Payment_Method payment_method, double amount, LocalDateTime date) {
        this.payment_id = payment_id;
        this.payment_uuid = payment_uuid;
        this.payment_method = payment_method;
        this.amount = amount;
        this.date = date;
    }

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public UUID getPayment_uuid() {
        return payment_uuid;
    }

    public void setPayment_uuid(UUID payment_uuid) {
        this.payment_uuid = payment_uuid;
    }

    public Payment_Method getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(Payment_Method payment_method) {
        this.payment_method = payment_method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
