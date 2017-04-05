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
* A LoyaltyAccount corresponds to a set of balances to carry loyalty mov 
* ement according to different valid period and unit.A LoyaltyAccount ma 
* y be required to realize a LoyaltyProgramProduct according to the rule 
* s carried by the corresponding LoyaltyProgramProdSpec. This is defined 
*  by the needsLoyaltyAccount attribute on the LoyaltyProgramProdSpec en 
* tity.A LoyaltyAccount may collect results from one or more LoyaltyProg 
* ramProduct. 
 @since SID_R16.5
*/ 

public  class LoyaltyAccount  {



/**  
* Field loyaltyProgramProduct
*/
protected LoyaltyProgramProduct loyaltyProgramProduct ;




/**  
* Field loyatyBurnPM
*/
protected List<LoyaltyBurnPM> loyatyBurnPM ;




/**  
* Field loyaltyBalance
*/
protected LoyaltyBalance loyaltyBalance ;




/**  
* Field loyaltyProgramMember
*/
protected LoyaltyProgramMember loyaltyProgramMember ;


}