package com.example.Ewallet.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "wallet")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private Long wallet_id;

    @Column(name = "wallet_uuid")
    private UUID wallet_uuid;

    @Column(name = "balance")
    private double balance;

    @Column(name = "currency")
    private char currency;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;


    public Wallet() {
    }

    public Wallet(Long wallet_id, UUID wallet_uuid, double balance, char currency, User user) {
        this.wallet_id = wallet_id;
        this.wallet_uuid = wallet_uuid;
        this.balance = balance;
        this.currency = currency;
        this.user = user;
    }

    public Long getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(Long wallet_id) {
        this.wallet_id = wallet_id;
    }

    public UUID getWallet_uuid() {
        return wallet_uuid;
    }

    public void setWallet_uuid(UUID wallet_uuid) {
        this.wallet_uuid = wallet_uuid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
