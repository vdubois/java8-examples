package io.github.vdubois.streams.practice;

import lombok.Data;

/**
 * Created by vdubois on 27/04/15.
 */
@Data
public class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}
