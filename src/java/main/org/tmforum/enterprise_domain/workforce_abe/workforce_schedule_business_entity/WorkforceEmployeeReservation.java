/**
* Workforce Schedule ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_UOH.aMN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Schedule ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_schedule_business_entity ;

/**
* Represents an implementation of a request for reservation of work time 
*  in some human resource pool. It is also possible to reserve the work  
* time of an individual employee. Note: the reservation, or booking acco 
* rding to appointment, is associated to Calendar Entry. The CalendarEnt 
* ry here can belong to a reservation WorkSchedule. This Calendar entry  
* may be floating. Once the Reservation becomes an Assignment (to be dis 
* patched), a particular time slot (Calendar Entry) can be fixed in the  
* WorkSchedule. 
 @since SID_R16.5
*/ 

public  class WorkforceEmployeeReservation  {



/**  
* Field validFor
* The period of time during which an employee or a pool is reserved for  

* the work.</br></br>Notes: This validFor reservation time may be differ 

* ent from the CalendarEntry defining when exactly the work must be perf 

* ormed. For example, because it considers variables involved in complet 

* ing the work task (such as preparation), the reservation time frame ma 

* y be longer than the time specified by CalendarEntry. 

*/
protected TimePeriod validFor ;




/**  
* Field work
*/
protected Work work ;




/**  
* Field workforceEmployeePool
*/
protected WorkforceEmployeePool workforceEmployeePool ;




/**  
* Field calendarEntry
*/
protected CalendarEntry calendarEntry ;




/**  
* Field workforceEmployeeRole
*/
protected WorkforceEmployeeRole workforceEmployeeRole ;




/**  
* Field workforceEmployeeAssignment
*/
protected WorkforceEmployeeAssignment workforceEmployeeAssignment ;


}