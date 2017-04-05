/**
* Workforce Resource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aGN2AN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Resource ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_resource_business_entity ;

/**
* Defines the concept of various types of roles associated with Workforc 
* eResources (both physical and logical). For example, tools (meter, lad 
* der), Truck, GPS, Handheld, etc. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::ResourceRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntityRole |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Role |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class WorkforceResourceRole extends ResourceRole,EntityRole,Role,RootEntity {



/**  
* Field workforceResourcePoolAssignment
*/
protected List<WorkforceResourcePoolAssignment> workforceResourcePoolAssignment ;




/**  
* Field workforceResourceReservation
*/
protected List<WorkforceResourceReservation> workforceResourceReservation ;




/**  
* Field workforceResourceAssignment
*/
protected List<WorkforceResourceAssignment> workforceResourceAssignment ;




/**  
* Field workingStatus
* Indicates the working status of the resource 

*/
protected String workingStatus ;


}