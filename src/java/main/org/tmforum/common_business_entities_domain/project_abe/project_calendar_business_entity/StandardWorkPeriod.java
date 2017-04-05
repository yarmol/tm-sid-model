/**
* Project Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF539C00247-content.html">Project Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.project_calendar_business_entity ;

/**
* e.g. working hours are 9-5 on monday from 1-mar-2002 to 1-sep-2002. Th 
* e times then change for daylight savings.A union deal may change the w 
* orking week from a certain date. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Calendar ABE::CalendarEvent |- 
 SID Models::Common Business Entities Domain::Calendar ABE::CalendarActionEntry |- 
 SID Models::Common Business Entities Domain::Calendar ABE::CalendarEntry @since SID_R16.5
*/ 

public  class StandardWorkPeriod extends CalendarEvent,CalendarActionEntry,CalendarEntry {



/**  
* Field dayOfWeek
*/
protected String dayOfWeek ;




/**  
* Field period
*/
protected TimePeriod period ;


}