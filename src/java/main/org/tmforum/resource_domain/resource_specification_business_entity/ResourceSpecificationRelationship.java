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
* A migration, substitution, dependency, or exclusivity relationship bet 
* ween/among ResourceSpecifications. 
 @since SID_R16.5
*/ 

public  class ResourceSpecificationRelationship  {



/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;




/**  
* Field resourceSpecification2
*/
protected ResourceSpecification resourceSpecification2 ;




/**  
* Field type
* A categorization of the relationship, such as migration, substitution, 

*  dependency, exclusivity. 

*/
protected String type ;




/**  
* Field validFor
* The period for which the relationship is applicable. 

*/
protected TimePeriod validFor ;


}