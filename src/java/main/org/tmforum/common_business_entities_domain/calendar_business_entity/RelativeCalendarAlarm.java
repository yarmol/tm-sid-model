/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* A CalendarAlarm that is triggered relative to the start or end of a Ca 
* lendarEntry 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::CalendarAlarm" href="_3E3F0EC000E93E41B18E02C9-content.html">SID Models::Common Business Entities Domain::Calendar ABE::CalendarAlarm</a> @since SID_R16.5
*/ 

public  class RelativeCalendarAlarm extends CalendarAlarm {



/**  
* Field alarmTrigger
* specifies if the alarm trigger durationOffset relates to the start or  

* the end of the Entry 

*/
protected String alarmTrigger ;




/**  
* Field durationOffset
* specifies the alarm offset. e.g. -5 mins is 5 minutes before and 10hr  

* is 10 hours after 

*/
protected String durationOffset ;


}