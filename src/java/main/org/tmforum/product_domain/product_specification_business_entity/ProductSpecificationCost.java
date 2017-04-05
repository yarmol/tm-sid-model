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
* A monetary amount assigned to a ProductSpecification that represents t 
* he cost to the business to plan, develop, market, and implement the Pr 
* oductSpecification. 
 @since SID_R16.5
*/ 

public  class ProductSpecificationCost  {



/**  
* Field costToBusiness
* The monetary amount that represents the cost. 

*/
protected Money costToBusiness ;




/**  
* Field validFor
* The period during which the cost is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;


}