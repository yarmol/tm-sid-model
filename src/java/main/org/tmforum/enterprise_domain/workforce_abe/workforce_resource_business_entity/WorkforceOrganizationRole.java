/**
* Workforce Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aGN2AN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_resource_business_entity ;

/**
* This is a PartyRole that represents organizations involved in field op 
* erations. It can be the CSP Field Technician department itself, or a 3 
* rd-party contractor company. Note that OrganizationRole has Calendar,  
* inherited from Calendar of PartyRole. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class WorkforceOrganizationRole extends PartyRole {



/**  
* Field workSpecFulfillmentRate
*/
protected List<WorkSpecFulfillmentRate> workSpecFulfillmentRate ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field workSchedule
*/
protected List<WorkSchedule> workSchedule ;




/**  
* Field workforceEmployeePool
*/
protected List<WorkforceEmployeePool> workforceEmployeePool ;




/**  
* Field workforceResourcePool
*/
protected List<WorkforceResourcePool> workforceResourcePool ;




/**  
* Field organizationRoleName
* Name of the OrganizationRole 

*/
protected String organizationRoleName ;


}