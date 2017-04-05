/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* This represents 'an action-item or assignment. For example, it can be  
* used to represent an item of work assigned to an individual; such as " 
* turn in travel expense today".' 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::CalendarActionEntry" href="_3E3F0EC000E93E41B1D50113-content.html">SID Models::Common Business Entities Domain::Calendar ABE::CalendarActionEntry</a> |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::CalendarEntry" href="_3E3F0EC000E93E41B1110189-content.html">SID Models::Common Business Entities Domain::Calendar ABE::CalendarEntry</a> @since SID_R16.5
*/ 

public  class CalendarToDo extends CalendarActionEntry,CalendarEntry {



/**  
* Field dueDate
* The DateTime the toDo is expected to be completed</br>Notes:</br>DUE [ 

* iCalendar]</br></br> 

*/
protected Object dueDate ;




/**  
* Field actionItem
*/
protected String actionItem ;




/**  
* Field percentComplete
* Shows progress from 0 (not started to 100 (complete)</br>Notes:</br>PE 

* RCENT-COMPLETE  [iCalendar] </br></br> 

*/
protected Integer percentComplete ;




/**  
* Field actualCompletionDate
* The date the toDo was actually completed</br>Notes:</br>COMPLETED [iCa 

* lendar]</br> 

*/
protected Object actualCompletionDate ;


}