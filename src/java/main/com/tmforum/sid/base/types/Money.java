package com.tmforum.sid.base.types;

/**
 * A base / value business entity used to represent money
 * @units Currency.    Notes:  refer to [ISO 4217]
 * @amount A positive floating point number.
 * Created by vitaly on 31.03.17.
 */
public class Money {
    private String units;
    private long amount;
}
