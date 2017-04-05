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
* A particular form or variety of a ProductSpecification that is differe 
* nt from others or from the original. The form represents differences i 
* n properties that characterize a ProductSpecification, that are not en 
* ough to warrant creating a new ProductSpecification. 
 @since SID_R16.5
*/ 

public  class ProductSpecificationVersion  {



/**  
* Field prodSpecRevisionType
* The significance of the revision. 

*/
protected String prodSpecRevisionType ;




/**  
* Field prodSpecRevisionNumber
* A number that represents the occurrence of the version in the sequence 

*  of versions. 

*/
protected String prodSpecRevisionNumber ;




/**  
* Field description
* A narrative that explains the reason for the version's creation. 

*/
protected String description ;




/**  
* Field prodSpecRevisionDate
* The date the version was created. 

*/
protected DateTime prodSpecRevisionDate ;




/**  
* Field validFor
* The period during which the version is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;


}