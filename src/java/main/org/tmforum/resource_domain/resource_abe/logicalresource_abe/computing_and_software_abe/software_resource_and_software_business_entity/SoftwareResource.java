/**
* Software Resource and Software ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_-.j.a.dQIYTE.eKS.k.uU.y3K96T.g-content.html">Software Resource and Software ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.logicalresource_abe.computing_and_software_abe.software_resource_and_software_business_entity ;

/**
* A generalization that contains all attributes and associations that ar 
* e common to Sofware and API .  A SoftwareResource is described by a So 
* ftwareResourceSpecficiation. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::LogicalResource ABE::LogicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class SoftwareResource extends LogicalResource,Resource,Entity,RootEntity {



/**  
* Field targetPlatform
* This is an enumerated integer that defines the target platform that th 

* e SoftwareResource will be deployed on. Values include:</br></br> 0: I 

* ndependent of Platform</br> 1: Other</br> 2: Network Device (specified 

*  in subclasses)</br> 3: Server</br> 4: Desktop Computer</br> 5: Laptop 

*  Computer</br> 6: PDA</br> 7: Phone</br> 8: Other Mobile Device</br> 

*/
protected Integer targetPlatform ;




/**  
* Field dateValue
* This attribute contains the value of the current date. 

*/
protected DateTime dateValue ;




/**  
* Field isDistributedCurrent
* This is a Boolean attribute that, if TRUE, defines this SoftwareResour 

* ce as being currently distributed across several Resource nodes. 

*/
protected Boolean isDistributedCurrent ;




/**  
* Field timeValue
* This attribute contains the value of the current Time. 

*/
protected long timeValue ;




/**  
* Field partyRole1
*/
protected List<PartyRole> partyRole1 ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;


}