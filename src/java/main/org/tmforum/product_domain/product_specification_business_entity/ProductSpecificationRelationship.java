/**
* Product Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA5302C4-content.html">Product Specification ABE</a> 
* The Product Specification ABE contains all what represent a product sp 
* ecification as perceived by the business user and specifies what the m 
* arketing operator wants to sell at a functional level (i.e. what are t 
* he capacities, which usages are available…). 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_specification_business_entity ;

/**
* A migration, substitution, dependency, or exclusivity relationship bet 
* ween/among ProductSpecifications. 
 @since SID_R16.5
*/ 

public  class ProductSpecificationRelationship  {



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




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;




/**  
* Field productSpecification2
*/
protected ProductSpecification productSpecification2 ;


}