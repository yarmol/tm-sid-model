/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* Allows documents, spreadsheets etc. to be associated to a CalendarEntr 
* y. This is an abstract class that needs to be implemented with a concr 
* ete attachment type. (e.g. inline file(s) or a URL to open) 
 @since SID_R16.5
*/ 

public abstract class CalendarEntryAttachment  {



/**  
* Field calendarEntry
*/
protected CalendarEntry calendarEntry ;


}