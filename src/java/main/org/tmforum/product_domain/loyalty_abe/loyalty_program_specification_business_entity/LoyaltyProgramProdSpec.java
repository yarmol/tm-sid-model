/**
* Loyalty Program Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.y.bS.b.wLT5E.eO.s.zOI.e.h.a.dD.bQ-content.html">Loyalty Program Specification ABE</a> 
* The Loyalty Program Specification ABE contains all entities specifying 
*  a loyalty program such as LoyaltyProgramProdSpec and LoyaltyRule. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.loyalty_abe.loyalty_program_specification_business_entity ;

/**
* A LoyaltyProgramProdSpec is a type of AtomicProductSpecification, is p 
* ackaged through ProductOffering and is instantiated in the same manner 
*  in the installed base (LoyaltyProgramProduct that is a type of Produc 
* tComponent).A LoyaltyProgramProdSpec defines one or more LoyaltyRules  
* that have to be checked in order to identify the actions to apply. 

Inheritance tree: |- 
 SID Models::Product Domain::Product Specification ABE::AtomicProductSpecification |- 
 SID Models::Product Domain::Product Specification ABE::ProductSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LoyaltyProgramProdSpec extends AtomicProductSpecification,ProductSpecification,EntitySpecification,RootEntity {



/**  
* Field loyaltyProgramProduct
*/
protected List<LoyaltyProgramProduct> loyaltyProgramProduct ;




/**  
* Field loyaltyRule
*/
protected LoyaltyRule loyaltyRule ;




/**  
* Field needsLoyaltyAccount
* If TRUE, a LoyaltyAccount is needed for each LoyaltyProgramProduct cre 

* ated according to the LoyaltyProgramProdSpec. 

*/
protected Boolean needsLoyaltyAccount ;


}