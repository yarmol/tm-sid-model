/**
* Workforce Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aGN2AN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_resource_business_entity ;

/**
* This is a PartyRole that represents individuals who are involved in th 
* e workforce process as employees with particular skills. For example,  
* Field Technician, Network Engineer, Supervisor, etc. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class WorkforceEmployeeRole extends PartyRole {



/**  
* Field workforceEmployeePoolAssignment
*/
protected List<WorkforceEmployeePoolAssignment> workforceEmployeePoolAssignment ;




/**  
* Field workforceEmployeeAssignment
*/
protected List<WorkforceEmployeeAssignment> workforceEmployeeAssignment ;




/**  
* Field workforceEmployeeReservation
*/
protected List<WorkforceEmployeeReservation> workforceEmployeeReservation ;




/**  
* Field skillLevel
* Indicates the qualification level of the technician: for example, inte 

* rn, entry level, senior/highly qualified 

*/
protected String skillLevel ;


}