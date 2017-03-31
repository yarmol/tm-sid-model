package com.tmforum.sid.base.types;

/**
 * A base / value business entity used to represent a period of time, between two timepoints
 * @startDateTime An instant of time, starting at the TimePeriod    Notes:  If null, then represents to the beginning of time
 * @endDateTime An instant of time, ending at the TimePeriod:    Notes:  If null, then represents to the end of time
 * Created by vitaly on 31.03.17.
 */
public class TimePeriod {
    private DateTime startDateTime;
    private DateTime endDateTime;

}
