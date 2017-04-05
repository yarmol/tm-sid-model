/**
* Project Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF539C00247-content.html">Project Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.project_calendar_business_entity ;

/**
* null 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Calendar ABE::CalendarEvent |- 
 SID Models::Common Business Entities Domain::Calendar ABE::CalendarActionEntry |- 
 SID Models::Common Business Entities Domain::Calendar ABE::CalendarEntry @since SID_R16.5
*/ 

public  class SpecialWorkPeriod extends CalendarEvent,CalendarActionEntry,CalendarEntry {



/**  
* Field period
*/
protected TimePeriod period ;




/**  
* Field isWorkingPeriod
*/
protected Boolean isWorkingPeriod ;


}