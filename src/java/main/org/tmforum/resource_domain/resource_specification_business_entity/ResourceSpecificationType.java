/**
* Resource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5CCD30232-content.html">Resource Specification ABE</a> 
* The Resource Specification ABE contains entities that define the share 
* d characteristics and behavior of each of the four types of Resource e 
* ntities. This enables multiple instances to be derived from a single s 
* pecification entity. In this derivation, each instance will use the sh 
* ared characteristics and behavior defined in its associated template. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_business_entity ;

/**
* A ResourceSpecificationType entity is used to categorize sets of Resou 
* rceSpecifications. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecificationType @since SID_R16.5
*/ 

public  class ResourceSpecificationType extends EntitySpecificationType {



/**  
* Field resourceSpecType
*/
protected List<ResourceSpecificationType> resourceSpecType ;




/**  
* Field resourceSpecType1
*/
protected List<ResourceSpecificationType> resourceSpecType1 ;




/**  
* Field resourceSpecification
*/
protected List<ResourceSpecification> resourceSpecification ;


}