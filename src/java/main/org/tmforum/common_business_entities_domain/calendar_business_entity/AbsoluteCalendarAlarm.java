/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* A Calendar Alarm that is triggered at an absolute time. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::CalendarAlarm" href="_3E3F0EC000E93E41B18E02C9-content.html">SID Models::Common Business Entities Domain::Calendar ABE::CalendarAlarm</a> @since SID_R16.5
*/ 

public  class AbsoluteCalendarAlarm extends CalendarAlarm {



/**  
* Field alarmDateTime
* an absolute date/ time for the alarm to activate 

*/
protected Object alarmDateTime ;




/**  
* Field timeZone
*/
protected TimeZone timeZone ;


}