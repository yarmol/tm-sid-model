/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* null 
 @since SID_R16.5
*/ 

public  class CalendarEntryAttendance  {



/**  
* Field associationType
*/
protected String associationType ;




/**  
* Field requestStatus
*/
protected String requestStatus ;




/**  
* Field actualParticipationStatus
*/
protected String actualParticipationStatus ;




/**  
* Field requestedParticipation
*/
protected String requestedParticipation ;




/**  
* Field entryRole
*/
protected String entryRole ;




/**  
* Field delegatedAttendee
*/
protected List<CalendarEntryAttendee> delegatedAttendee ;




/**  
* Field sender
*/
protected CalendarEntryAttendee sender ;


}