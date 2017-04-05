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
* A LoyaltyBalance is credited by LoyaltyEarns and debited by LoyaltyBur 
* ns. 
 @since SID_R16.5
*/ 

public  class LoyaltyBalance  {



/**  
* Field validFor
* Time period during wich the LoyaltyEarn can be burnt through LoyaltyBu 

* rn. 

*/
protected TimePeriod validFor ;




/**  
* Field unit
* Unit of the quantity credited and debited from the balance. 

*/
protected String unit ;




/**  
* Field loyaltyAccount
*/
protected LoyaltyAccount loyaltyAccount ;




/**  
* Field loyaltyEarn
*/
protected List<LoyaltyEarn> loyaltyEarn ;




/**  
* Field loyaltyBurn
*/
protected List<LoyaltyBurn> loyaltyBurn ;


}