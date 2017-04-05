/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* A Calendar is "a collection of calendaring and scheduling information" 
*  [iCalendar] 
 @since SID_R16.5
*/ 

public abstract class Calendar  {



/**  
* Field id
* Unique identifier 

*/
protected String id ;




/**  
* Field calendricalSystem
* The default calendrical system for the Calendar</br>Note:</br>CALSCALE 

*  [iCalendar] 

*/
protected String calendricalSystem ;




/**  
* Field description
* Records the calendar purpose and any other comments 

*/
protected String description ;




/**  
* Field compoundCalendar
*/
protected List<CompoundCalendar> compoundCalendar ;




/**  
* Field calendarEntry
*/
protected List<CalendarEntry> calendarEntry ;




/**  
* Field timeZone
* The default time zone for the Calendar</br>Note:</br>refer SID Party A 

* ddendum 

*/
protected TimeZone timeZone ;




/**  
* Field calendarOwner
*/
protected PartyRole calendarOwner ;




/**  
* Field language
* The default language for the Calendar</br>Note:</br>refer SID Party Ad 

* dendum 

*/
protected Language language ;


}