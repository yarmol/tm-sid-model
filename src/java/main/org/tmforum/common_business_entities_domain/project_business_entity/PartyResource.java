/**
* Project ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E38ABDE00E5-content.html">Project ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_business_entity ;

/**
* null 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Resource ABE::AllocatedProjectResource |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Resource ABE::ProjectResource @since SID_R16.5
*/ 

public  class PartyResource extends AllocatedProjectResource,ProjectResource {



/**  
* Field cost
*/
protected Money cost ;




/**  
* Field skills
*/
protected String skills ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;


}