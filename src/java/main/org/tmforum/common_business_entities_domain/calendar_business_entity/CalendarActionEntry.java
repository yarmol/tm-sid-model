/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* This is an abstract entity that contains common properties and associa 
* tionsfor CalendarEvents & ToDos 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::CalendarEntry" href="_3E3F0EC000E93E41B1110189-content.html">SID Models::Common Business Entities Domain::Calendar ABE::CalendarEntry</a> @since SID_R16.5
*/ 

public abstract class CalendarActionEntry extends CalendarEntry {



/**  
* Field validFor
* The date range that this entry can be considered valid within</br>Note 

* :</br>refer to TimePeriod in the Base Types addendum 

*/
protected TimePeriod validFor ;




/**  
* Field priority
* Allows for overlapping events to be prioritized</br></br>Note:</br>PRI 

* ORITY [Calendar] 

*/
protected Integer priority ;




/**  
* Field resources
* The equipment or resource requirements</br>Note:</br>RESOURCES [iCalen 

* dar] 

*/
protected String resources ;




/**  
* Field calendarAlarm
*/
protected List<CalendarAlarm> calendarAlarm ;




/**  
* Field place
*/
protected Place place ;


}