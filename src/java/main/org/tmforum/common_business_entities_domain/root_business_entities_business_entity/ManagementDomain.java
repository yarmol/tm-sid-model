/**
* Root Business Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93CF68FE80295-content.html">Root Business Entities ABE</a> 
* A set of common business entities that collectively serve as the found 
* ation of the business view. This set of entities enables the entities  
* in different domains of the SID Framework to be associated with each o 
* ther, providing greater overall coherence to the information framework 
* . 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_business_entity ;

/**
* A ManagementDomain class represents a special grouping of ManagedEntit 
* ies that has two important properties. First, it is used to partition  
* managed objects into a meaningful logical grouping. One important use  
* of such a grouping is to provide a means to define which EMS (as well  
* as which NMS) manages, monitors, etc. which set of devices. It also pr 
* ovides a means to show how management functions are distributed and sc 
* aled.Second, it defines a common administrative domain that is used to 
*  administer the managed objects that it contains. This implies that al 
* l of the managed objects contained in this ManagementDomain are admini 
* stered similarly - either by the same user, group of users or policy. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity" href="_3E3F0EC000E93CDA9E0C0384-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity</a> @since SID_R16.5
*/ 

public abstract class ManagementDomain extends RootEntity {



/**  
* Field managedEntity
*/
protected List<ManagedEntity> managedEntity ;




/**  
* Field resource
*/
protected List<Resource> resource ;




/**  
* Field managementDomain
*/
protected List<ManagementDomain> managementDomain ;




/**  
* Field managementDomain1
*/
protected ManagementDomain managementDomain1 ;


}