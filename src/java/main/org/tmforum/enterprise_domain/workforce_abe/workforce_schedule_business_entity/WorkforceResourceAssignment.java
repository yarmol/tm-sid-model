/**
* Workforce Schedule ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_UOH.aMN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Schedule ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_schedule_business_entity ;

/**
* Represents an assignment of a particular resource for particular work  
* in a specific timeframe. For example, assignment of a fiber test kit ( 
* or, additional example, a role of a test kit) to a fiber rollout work  
* for a date. 
 @since SID_R16.5
*/ 

public  class WorkforceResourceAssignment  {



/**  
* Field work
*/
protected Work work ;




/**  
* Field workforceResourceRole
*/
protected WorkforceResourceRole workforceResourceRole ;




/**  
* Field workforceResourceReservation
*/
protected WorkforceResourceReservation workforceResourceReservation ;




/**  
* Field calendarEntry
*/
protected CalendarEntry calendarEntry ;




/**  
* Field actualCost
* Actual Cost of the assignment of the resource (tools) to the work. 

*/
protected Money actualCost ;


}