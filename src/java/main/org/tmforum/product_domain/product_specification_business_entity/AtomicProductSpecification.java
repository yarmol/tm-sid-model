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
* A type of ProductSpecification that does not have any subordinate Prod 
* uctSpecifications, that is, an AtomicProductSpecification is a leaf-le 
* vel ProductSpecification. 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Specification ABE::ProductSpecification" href="_3E3F0EC000E93C5DB97B0118-content.html">SID Models::Product Domain::Product Specification ABE::ProductSpecification</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class AtomicProductSpecification extends ProductSpecification,EntitySpecification,RootEntity {



/**  
* Field atomicProductUsageSpec
*/
protected List<AtomicProductUsageSpec> atomicProductUsageSpec ;


}