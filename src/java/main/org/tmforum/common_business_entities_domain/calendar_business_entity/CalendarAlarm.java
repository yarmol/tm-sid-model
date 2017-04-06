/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.Duration;

/**
* Is "a reminder or alarm for an event or a to-do. For example, it may b 
* e used to define a reminder for a pending event or an overdue to-do."  
* [iCalendar] 
 @since SID_R16.5
*/ 

public abstract class CalendarAlarm  {



/**  
* Field alarmAction
* The action to be invoked when an alarm is triggered [iCalendar]</br>No 

* tes</br>ACTION [iCalendar]</br></br></br> 

*/
protected String alarmAction ;




/**  
* Field interval
* The interval between alarm repetitions 

*/
protected Duration interval ;




/**  
* Field repeatCount
* The number of times the alarm should be repeated, after the initial tr 

* igger [iCalendar]</br>Notes:</br>REPEAT [iCalendar]</br> 

*/
protected Integer repeatCount ;




/**  
* Field calendarActionEntry
*/
protected CalendarActionEntry calendarActionEntry ;


}