/**
* Loyalty Program ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.oA.v6ELT6E.eO.s.zOI.e.h.a.dD.bQ-content.html">Loyalty Program ABE</a> 
* The Loyalty Program ABE contains all entities needed to instantiate a  
* loyalty program for a specific customer such as LoyaltyProgram and Loy 
* altyAccount. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.loyalty_abe.loyalty_program_business_entity ;

/**
* A LoyaltyProgramProduct is a type of ProductComponent.It is described  
* by a LoyaltyProgramProdSpec. 

Inheritance tree: |- 
 SID Models::Product Domain::Product ABE::ProductComponent |- 
 SID Models::Product Domain::Product ABE::Product |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LoyaltyProgramProduct extends ProductComponent,Product,Entity,RootEntity {



/**  
* Field loyaltyProgramProdSpec
*/
protected LoyaltyProgramProdSpec loyaltyProgramProdSpec ;




/**  
* Field loyaltyAccount
*/
protected LoyaltyAccount loyaltyAccount ;


}