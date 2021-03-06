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
* A LoyaltyEarn represents a gain credited on a LoyaltyBalance. 
 @since SID_R16.5
*/ 

public  class LoyaltyEarn  {



/**  
* Field loyaltyExecutionPoint
*/
protected LoyaltyExecutionPoint loyaltyExecutionPoint ;




/**  
* Field loyaltyBalance
*/
protected LoyaltyBalance loyaltyBalance ;




/**  
* Field quantity
* The quantity of earn. 

*/
protected Quantity quantity ;


}