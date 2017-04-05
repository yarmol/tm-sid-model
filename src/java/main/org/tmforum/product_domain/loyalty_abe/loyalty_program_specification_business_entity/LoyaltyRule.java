/**
* Loyalty Program Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.y.bS.b.wLT5E.eO.s.zOI.e.h.a.dD.bQ-content.html">Loyalty Program Specification ABE</a> 
* The Loyalty Program Specification ABE contains all entities specifying 
*  a loyalty program such as LoyaltyProgramProdSpec and LoyaltyRule. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.loyalty_abe.loyalty_program_specification_business_entity ;

/**
*  A LoyaltyRule is a type of PolicyRule defined by a LoyaltyProgramProd 
* Spec.A LoyaltyRule specifies:•&nbsp;&nbsp;&nbsp;&nbsp;Events triggerin 
* g the evaluation of the rule (LoyaltyEvent)   o&nbsp;&nbsp;&nbsp;&nbsp 
* ;Ex: Every first of a month, a CustomerOrder of Top-Up•&nbsp;&nbsp;&nb 
* sp;&nbsp;Conditions that have to be checked (LoyaltyCondition)   o&nbs 
* p;&nbsp;&nbsp;&nbsp;Ex: If the invoice amount is above 100 €, If more  
* than 2 hours of international call•&nbsp;&nbsp;&nbsp;&nbsp;Actions tha 
* t should be performed if the condition clause is evaluated to TRUE (Lo 
* yaltyAction)   o&nbsp;&nbsp;&nbsp;&nbsp;Ex: Give 50 SMS free, Credit 1 
* 0 points on the LoyaltyAccountLoyalty Rules may result in•&nbsp;&nbsp; 
* &nbsp;&nbsp;either rewards directly used / usable by the customer   o& 
* nbsp;&nbsp;&nbsp;&nbsp;Ex: 5% more time on the communications package  
* after 6 months of age, and 10% after one year ...•&nbsp;&nbsp;&nbsp;&n 
* bsp;or loyalty earn that are gathered on an account to be used to pay  
* later a ProductOffering   o&nbsp;&nbsp;&nbsp;&nbsp;Ex: 400 points to w 
* elcome a subscription then 10 points for every Euro charged. The point 
* s collected can be used to buy rewards like a USB stick, 100 SMS… 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy ABE::PolicyRule |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicyRuleBase |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::PolicySet |- 
 SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class LoyaltyRule extends PolicyRule,PolicyRuleBase,PolicySet,Policy,RootEntity {



/**  
* Field loyaltyProgramProdSpec
*/
protected LoyaltyProgramProdSpec loyaltyProgramProdSpec ;




/**  
* Field loyaltyAction
*/
protected LoyaltyAction loyaltyAction ;




/**  
* Field loyaltyCondition
*/
protected LoyaltyCondition loyaltyCondition ;




/**  
* Field loyaltyEvent
*/
protected LoyaltyEvent loyaltyEvent ;




/**  
* Field loyaltyExecutionPoint
*/
protected List<LoyaltyExecutionPoint> loyaltyExecutionPoint ;


}