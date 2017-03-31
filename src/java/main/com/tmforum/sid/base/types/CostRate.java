package com.tmforum.sid.base.types;

/**
 * A base / value business entity used to represent a cost per time unit. e.g. $10/hr, 33 pence/min
 * Created by vitaly on 31.03.17.
 */
public class CostRate {
   private Money numerator;
   private Duration	 denominator;
}
