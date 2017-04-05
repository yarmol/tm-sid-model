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
* An EntitySpecificationType is a classification that groups EntitySpeci 
* fications.Multiple EntitySpecificationTypes can be related to each oth 
* er using the association through EntitySpecificationTypeRelationship. 
 @since SID_R16.5
*/ 

public  class EntitySpecificationType  {



/**  
* Field entitySpecificationTypeRelationship
*/
protected List<EntitySpecificationTypeRelationship> entitySpecificationTypeRelationship ;




/**  
* Field entitySpecificationTypeRelationship2
*/
protected List<EntitySpecificationTypeRelationship> entitySpecificationTypeRelationship2 ;




/**  
* Field name
* A word, term, or phrase by which the EntitySpecificationType is known  

* and distinguished from others. 

*/
protected String name ;




/**  
* Field descirption
* A narrative that explains in detail what the EntitySpecificationType r 

* epresents. 

*/
protected String descirption ;




/**  
* Field catalogSpecification
*/
protected List<CatalogSpecification> catalogSpecification ;


}