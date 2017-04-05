/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* An Appointment is an arrangement to do something or meet someone at a  
* particular time and location. 
 @since SID_R16.5
*/ 

public  class Appointment  {



/**  
* Field calendarEntry
*/
protected CalendarEntry calendarEntry ;




/**  
* Field work
*/
protected List<Work> work ;




/**  
* Field agreement
*/
protected Agreement agreement ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field customerOrderItem
*/
protected List<CustomerOrderItem> customerOrderItem ;


}