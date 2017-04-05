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
* A LoyaltyBurn represents the use of a certain quantity on a LoyaltyBal 
* ance. It is used to be gathered into a CustomerPayment. 
 @since SID_R16.5
*/ 

public  class LoyaltyBurn  {



/**  
* Field loyaltyBalance
*/
protected LoyaltyBalance loyaltyBalance ;




/**  
* Field customerPayment
*/
protected CustomerPayment customerPayment ;




/**  
* Field quantity
* The quantity of burn. 

*/
protected Quantity quantity ;


}