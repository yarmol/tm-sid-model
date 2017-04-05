/**
* Workforce Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aGN2AN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_resource_business_entity ;

/**
* Represents an employee pool, as a set or group of employees available  
* for assignment to work tasks. A WorkforceOrganizationRole can have man 
* y workforce pools, and vice versa, a pool can contain employees from m 
* ore than one organization. Examples of a Pool are Fiber installation t 
* eam, service repair team, etc. A Pool contains people/resources with p 
* articular skills, availability, location, other restrictions, and pref 
* erences. Pool is associated with Capacity. For example, a WorkForceEmp 
* olyeePool shows that on July 1, from 8 am to 12 pm there are 100 man h 
* ours available with the skill of fiber layout for the New York area. A 
*  detailed model of the capacity of the pool down to timeslot, skill/wo 
* rk level is a subject for a future SID release. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Resource ABE::ProjectResourcePool @since SID_R16.5
*/ 

public  class WorkforceEmployeePool extends ProjectResourcePool {



/**  
* Field isWfSupplierEmployeePool
* Indicates whether this pool is managed by the workforce provider compa 

* ny, or by a 3rd-party contractor 

*/
protected boolean isWfSupplierEmployeePool ;




/**  
* Field workforceOrganizationRole
*/
protected List<WorkforceOrganizationRole> workforceOrganizationRole ;




/**  
* Field workforceEmployeePoolAssignment
*/
protected List<WorkforceEmployeePoolAssignment> workforceEmployeePoolAssignment ;




/**  
* Field workforceEmployeeReservation
*/
protected List<WorkforceEmployeeReservation> workforceEmployeeReservation ;


}