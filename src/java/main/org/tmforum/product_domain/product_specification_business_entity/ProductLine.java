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
* A method used to group related ProductSpecifications that have some ch 
* aracteristics in common but others that are not. For example, health m 
* onitoring device product line whose ProductSpecifications have a numbe 
* r of common characteristics, but come in different colors and can be u 
* sed to monitor a variety of bodily functions. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Specification ABE::ProductSpecificationType" href="_3E3F0EC000E93C5DBB2A01FE-content.html">SID Models::Product Domain::Product Specification ABE::ProductSpecificationType</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecificationType @since SID_R16.5
*/ 

public  class ProductLine extends ProductSpecificationType,EntitySpecificationType {



/**  
* Field competitiveTier
*/
protected List<CompetitiveTier> competitiveTier ;


}