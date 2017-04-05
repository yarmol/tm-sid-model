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
* A ProductSpecificationType is a sub-class of EntitySpecificationType.A 
*  classification that groups ProductSpecifications that share common ch 
* aracteristics (this doesn’t necessarily refer to ProductSpecCharacteri 
* ctis). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecificationType @since SID_R16.5
*/ 

public  class ProductSpecificationType extends EntitySpecificationType {



/**  
* Field productSpecification
*/
protected List<ProductSpecification> productSpecification ;




/**  
* Field prodOfferPricePolicyVariable
*/
protected List<ProdOfferPricePolicyVariable> prodOfferPricePolicyVariable ;




/**  
* Field partyRevenueSharingModelInvolvement
*/
protected List<PartyRevenueSharingModelInvolvement> partyRevenueSharingModelInvolvement ;


}