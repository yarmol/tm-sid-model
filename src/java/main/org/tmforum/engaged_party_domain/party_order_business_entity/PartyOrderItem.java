/**
* Party Order ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eG_.oE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Order ABE</a> 
* The Party Order ABE contains all entities required to specify a commun 
* ication used to procure or update one or many Products in the context  
* of a ProductOffering. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_order_business_entity ;

/**
* The purpose for the Party Order expressed in terms of a Product Offeri 
* ng or a Product (for a change order) inherited from BusinessInteractio 
* nItem. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionItem @since SID_R16.5
*/ 

public  class PartyOrderItem extends BusinessInteractionItem {



/**  
* Field partyOrder
*/
protected PartyOrder partyOrder ;




/**  
* Field purchaseProductSpecification
*/
protected PurchaseProductSpecification purchaseProductSpecification ;




/**  
* Field purchaseProductOffering
*/
protected PurchaseProductOffering purchaseProductOffering ;




/**  
* Field partyAccount
*/
protected List<PartyAccount> partyAccount ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field partyPayment
*/
protected List<PartyPayment> partyPayment ;




/**  
* Field partyOrderItem
*/
protected List<PartyOrderItem> partyOrderItem ;




/**  
* Field partyOrderItem2
*/
protected List<PartyOrderItem> partyOrderItem2 ;




/**  
* Field appointment
*/
protected List<Appointment> appointment ;




/**  
* Field allowedProductAction
*/
protected AllowedProductAction allowedProductAction ;




/**  
* Field productSpecification
*/
protected ProductSpecification productSpecification ;




/**  
* Field productOffering
*/
protected ProductOffering productOffering ;




/**  
* Field product
*/
protected Product product ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field commitmentTermOrCondition
*/
protected List<CommitmentTermOrCondition> commitmentTermOrCondition ;




/**  
* Field customerorderitem
*/
protected CustomerOrderItem customerorderitem ;


}