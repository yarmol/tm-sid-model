/**
* Loyalty Program Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.y.bS.b.wLT5E.eO.s.zOI.e.h.a.dD.bQ-content.html">Loyalty Program Specification ABE</a> 
* The Loyalty Program Specification ABE contains all entities specifying 
*  a loyalty program such as LoyaltyProgramProdSpec and LoyaltyRule. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.loyalty_abe.loyalty_program_specification_business_entity ;

/**
* A LoyaltyAction may correspond either to a CustomerOrder (Ex: 100 SMS  
* free), or to an Interaction (Ex: a SMS notifying the 100 SMS free) or  
* to a LoyaltyEarn (Ex: 100 points on the LoyaltyAccount) 
 @since SID_R16.5
*/ 

public  class LoyaltyAction  {



/**  
* Field loyaltyRule
*/
protected LoyaltyRule loyaltyRule ;




/**  
* Field loyaltyExecutionPoint
*/
protected List<LoyaltyExecutionPoint> loyaltyExecutionPoint ;


}