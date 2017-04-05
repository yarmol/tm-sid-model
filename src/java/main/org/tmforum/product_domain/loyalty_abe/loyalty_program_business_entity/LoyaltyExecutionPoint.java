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
* A LoyaltyExecutionPoint is a type of PolicyExecutionPoint.A LoyaltyExe 
* cutionPoint tracks the application of a LoyaltyAction and may trigger  
* BusinessInteraction, CustomerOrder or LoyaltyEarn. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::Policy Server ABE::PolicyExecutionPoint |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Application ABE::PolicyApplication |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LoyaltyExecutionPoint extends PolicyExecutionPoint,PolicyApplication,Entity,RootEntity {



/**  
* Field loyaltyProgramProdSpec
*/
protected LoyaltyRule loyaltyProgramProdSpec ;




/**  
* Field loyaltyEarn
*/
protected LoyaltyEarn loyaltyEarn ;




/**  
* Field businessInteraction
*/
protected BusinessInteraction businessInteraction ;




/**  
* Field customerOrder
*/
protected CustomerOrder customerOrder ;




/**  
* Field loyaltyAction
*/
protected LoyaltyAction loyaltyAction ;


}