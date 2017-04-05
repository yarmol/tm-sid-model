/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* An expression that defines one or more time periods, often periodic in 
*  nature. This is an abstract entity that abstracts simple and recurrin 
* g time periods from the calendar entry. It may also allow reuse of tem 
* poral expressions in other parts of the SID model. 
 @since SID_R16.5
*/ 

public abstract class TemporalExpression  {



/**  
* Field calendricalSystem
* the calendrical system used to define the dates in this expression</br 

* ></br>Note:</br>CALSCALE [iCalendar] 

*/
protected String calendricalSystem ;




/**  
* Field calendarEntry
*/
protected List<CalendarEntry> calendarEntry ;




/**  
* Field timeZone
*/
protected TimeZone timeZone ;


}