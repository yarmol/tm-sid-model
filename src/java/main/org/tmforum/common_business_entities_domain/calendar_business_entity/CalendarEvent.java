/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* "represents a scheduled amount of time on a calendar. For example, it  
* can be an activity; such as a one-hour long, department meeting from 8 
* :00 AM to 9:00 AM, tomorrow. Generally, an event will take up time on  
* an individual calendar." [iCalendar] 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::CalendarActionEntry" href="_3E3F0EC000E93E41B1D50113-content.html">SID Models::Common Business Entities Domain::Calendar ABE::CalendarActionEntry</a> |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::CalendarEntry" href="_3E3F0EC000E93E41B1110189-content.html">SID Models::Common Business Entities Domain::Calendar ABE::CalendarEntry</a> @since SID_R16.5
*/ 

public  class CalendarEvent extends CalendarActionEntry,CalendarEntry {



/**  
* Field freeBusyType
* Determines the event resource reservation on the Calendar</br></br>Not 

* es:</br>TRANSP, FREEBUSY, FBTYPE [iCalendar]</br></br>Permitted Values 

* :</br>FREE, BUSY, BUSY-UNAVAILABLE, BUSY-TENTATIVE</br></br> 

*/
protected String freeBusyType ;


}