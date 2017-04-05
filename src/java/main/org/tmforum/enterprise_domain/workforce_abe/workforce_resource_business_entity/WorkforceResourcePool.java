/**
* Workforce Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aGN2AN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_resource_business_entity ;

/**
* Represents a resource pool as a set of resources (both physical and lo 
* gical) available for assignment to work tasks. For example, the Dallas 
*  pool for fiber rollout for a weekday contains X number of trucks, Y n 
* umber of test kits, etc. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Resource ABE::ProjectResourcePool @since SID_R16.5
*/ 

public  class WorkforceResourcePool extends ProjectResourcePool {



/**  
* Field workforceOrganizationRole
*/
protected List<WorkforceOrganizationRole> workforceOrganizationRole ;




/**  
* Field workforceResourcePoolAssignment
*/
protected List<WorkforceResourcePoolAssignment> workforceResourcePoolAssignment ;




/**  
* Field workforceResourceReservation
*/
protected List<WorkforceResourceReservation> workforceResourceReservation ;




/**  
* Field isWfSupplierResourcePool
* Indicates whether this pool is managed by the workforce provider compa 

* ny, or by a 3rd-party contractor 

*/
protected Boolean isWfSupplierResourcePool ;


}