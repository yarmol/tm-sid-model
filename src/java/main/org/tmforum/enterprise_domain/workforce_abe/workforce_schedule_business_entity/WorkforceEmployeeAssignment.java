/**
* Workforce Schedule ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_UOH.aMN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Schedule ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_schedule_business_entity ;

/**
* Represents an assignment of a particular WorforceEmployeeRole for a pa 
* rticular work task in a specific timeframe. For example, assignment of 
*  a person in a network engineer role to a trouble shooting work task f 
* or at least 2 hours. The assignment is associated with a CalendarEntry 
*  of an Assignment WorkSchedule. 
 @since SID_R16.5
*/ 

public  class WorkforceEmployeeAssignment  {



/**  
* Field work
*/
protected Work work ;




/**  
* Field calendarEntry
*/
protected CalendarEntry calendarEntry ;




/**  
* Field workforceEmployeeRole
*/
protected WorkforceEmployeeRole workforceEmployeeRole ;




/**  
* Field workforceEmployeeReservation
*/
protected WorkforceEmployeeReservation workforceEmployeeReservation ;




/**  
* Field assignmentStatus
* Completion status of the assignment, like started, in-progress, uncomp 

* leted, completed. Note: this is not always the same as the status of t 

* he work, as there can be more than one employee assigned to the work. 

*/
protected String assignmentStatus ;


}