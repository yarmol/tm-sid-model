/**
* Calendar ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E41B0930200-content.html">Calendar ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_business_entity ;

/**
* This is used when a Calendar Entry has a simple single start and end D 
* ateTime. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::TemporalExpression" href="_3E3F0EC000E93E7F9C9A03B4-content.html">SID Models::Common Business Entities Domain::Calendar ABE::TemporalExpression</a> @since SID_R16.5
*/ 

public  class SimpleTemporalExpression extends TemporalExpression {



/**  
* Field timePeriod
* The TimePeriod that the related entry is for</br>Note:</br>Refer to th 

* e SID Base Types addendum 

*/
protected TimePeriod timePeriod ;




/**  
* Field calendarEntry2
*/
protected CalendarEntry calendarEntry2 ;


}