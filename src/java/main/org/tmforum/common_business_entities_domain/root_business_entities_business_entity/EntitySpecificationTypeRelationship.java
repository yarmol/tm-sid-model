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
* The EntitySpecificationTypeRelationship enables specifying any kind of 
*  relationships between EntitySpecificationTypes such as contains.As an 
*  example, an EntitySpecificationType “Family roles” may contain many E 
* ntitySpecificationTypes such as “parent”, “children”, “grand parents”… 
 @since SID_R16.5
*/ 

public  class EntitySpecificationTypeRelationship  {



/**  
* Field entitySpecificationType
*/
protected EntitySpecificationType entitySpecificationType ;




/**  
* Field entitySpecificationType2
*/
protected EntitySpecificationType entitySpecificationType2 ;




/**  
* Field type
* A categorization of the relationship, such as aggregation, migration,  

* substitution, dependency, exclusivity. 

*/
protected String type ;


}