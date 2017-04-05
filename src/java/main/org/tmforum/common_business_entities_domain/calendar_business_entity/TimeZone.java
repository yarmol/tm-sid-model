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

public  class TimeZone  {



/**  
* Field name
*/
protected String name ;




/**  
* Field timezoneUrl
*/
protected URL timezoneUrl ;




/**  
* Field comment
*/
protected String comment ;




/**  
* Field principalLocation
*/
protected Point principalLocation ;




/**  
* Field timeZoneRule
*/
protected List<TimeZoneRule> timeZoneRule ;




/**  
* Field country
*/
protected Country country ;




/**  
* Field calendar
*/
protected List<Calendar> calendar ;




/**  
* Field temporalExpression
*/
protected List<TemporalExpression> temporalExpression ;




/**  
* Field absoluteCalendarAlarm
*/
protected AbsoluteCalendarAlarm absoluteCalendarAlarm ;


}