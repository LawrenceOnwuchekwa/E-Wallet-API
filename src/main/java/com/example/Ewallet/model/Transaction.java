package com.example.Ewallet.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transaction_id;

    @Column(name = "transaction_uuid")
    private UUID transaction_uuid;


    @ManyToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

    @Enumerated(value = EnumType.STRING)
    private Transaction_Type transaction_type;

    @Column(name = "amount")
    private double amount;

    @Column(name = "date")
    private Date date;

    @Column(name = "description")
    private String description;

    public Transaction() {
    }

    public Transaction(Long transaction_id, UUID transaction_uuid, Wallet wallet, Transaction_Type transaction_type, double amount, Date date, String description) {
        this.transaction_id = transaction_id;
        this.transaction_uuid = transaction_uuid;
        this.wallet = wallet;
        this.transaction_type = transaction_type;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public Long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public UUID getTransaction_uuid() {
        return transaction_uuid;
    }

    public void setTransaction_uuid(UUID transaction_uuid) {
        this.transaction_uuid = transaction_uuid;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Transaction_Type getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(Transaction_Type transaction_type) {
        this.transaction_type = transaction_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
