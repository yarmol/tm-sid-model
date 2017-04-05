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
* A LoyaltyProgramMember is defined on each LoyaltyAccount. A LoyaltyPro 
* gramMember is a type of PartyRole and is granted with the rights on th 
* e LoyaltyAccount such as to execute LoyaltyBurn used to realize a Cust 
* omerPayment. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class LoyaltyProgramMember extends PartyRole {



/**  
* Field loyaltyAccount
*/
protected LoyaltyAccount loyaltyAccount ;


}