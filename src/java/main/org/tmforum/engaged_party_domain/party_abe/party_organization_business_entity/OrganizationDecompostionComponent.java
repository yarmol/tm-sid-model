/**
* Party Organization ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_W2.w-8IH.mE.eW.e1.q.f.pS.tFE.qA-content.html">Party Organization ABE</a> 
* Used to model Party Organization. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_organization_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.engaged_party_domain.party_business_entity.Organization;

/**
* Describes certain component after organization decompostion based on d 
* efined type by OrganizationDecompostionType. 
 @since SID_R16.5
*/ 

public  class OrganizationDecompostionComponent  {



/**  
* Field validFor
* The period during which the OrganizationDecompostionComponent is appli 

* cable. 

*/
protected TimePeriod validFor ;




/**  
* Field organizationDecompostionType
*/
protected OrganizationDecompostionType organizationDecompostionType ;




/**  
* Field compositeOrganization
*/
protected CompositeOrganization compositeOrganization ;




/**  
* Field organization
*/
protected Organization organization ;


}