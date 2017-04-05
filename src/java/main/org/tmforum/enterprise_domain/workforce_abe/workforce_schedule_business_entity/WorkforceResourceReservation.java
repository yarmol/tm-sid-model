/**
* Workforce Schedule ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_UOH.aMN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Schedule ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_schedule_business_entity ;

/**
* Represents an implementation of a request for the reservation of usage 
*  time in some resource pool (tools, trucks, materials, etc.). It is al 
* so possible to reserve usage time of a particular resource. 
 @since SID_R16.5
*/ 

public  class WorkforceResourceReservation  {



/**  
* Field work
*/
protected Work work ;




/**  
* Field workforceResourcePool
*/
protected WorkforceResourcePool workforceResourcePool ;




/**  
* Field validFor
* The period of time during which a Resource or a pool is reserved for t 

* he work. 

*/
protected TimePeriod validFor ;




/**  
* Field workforceResourceRole
*/
protected WorkforceResourceRole workforceResourceRole ;




/**  
* Field workforceResourceAssignment
*/
protected WorkforceResourceAssignment workforceResourceAssignment ;




/**  
* Field calendarEntry
*/
protected CalendarEntry calendarEntry ;


}