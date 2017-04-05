/**
* Party Revenue Share ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.k.gCH.cEK5E.e.a.m.lL.c.v.q.v7Y.pA-content.html">Party Revenue Share ABE</a> 
* The Party Revenue Share ABE represents the amount of revenue shared am 
* ong parties involved in a revenue sharing agreement. Revenue share is  
* determined using existing artifacts such as usage, invoices, product p 
* rices, and applied billing rates. The revenue share may result in a pa 
* yment to/from a party and/or an bill/invoice to/from a party. It may a 
* lso be shown as a reduction of or increase to an bill/invoice sent to  
* or received from a party, or a credit/debit to a party's account balan 
* ce. There are a variety of revenue sharing models, that determines how 
*  revenue may be split among an enterprise and other parties. Based on  
* the type of revenue sharing model different determinants are used to c 
* alculate the final bill/invoice or payment. Flat rate and usage based  
* revenue sharing models are just two of a number of models, which also  
* include but are not limited to tiered, commitment, progressive, along  
* with multi-party variations of each.A party revenue sharing agreement  
* defines the period for which a revenue share for a product offering ar 
* e determined. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_revenue_sharing_abe.party_revenue_share_business_entity ;

/**
* The amount of revenue shared among parties involved in a revenue shari 
* ng agreement. Revenue share is determined using existing artifacts suc 
* h as usage, invoices, product prices, and applied billing rates. The r 
* evenue share may result in a payment to/from a party and/or an bill/in 
* voice to/from a party. It may also be shown as a reduction of or incre 
* ase to an bill/invoice sent to or received from a party, or a credit/d 
* ebit to a party's account balance. 
 @since SID_R16.5
*/ 

public  class PartyRevenueShare  {



/**  
* Field ID
* A unique identifier for the PartyRevenueShare. 

*/
protected String ID ;




/**  
* Field dateDetermined
* The date the revenue share was determined. 

*/
protected DateTime dateDetermined ;




/**  
* Field description
* A narrative that explains in detail what the PartyRevenueShare is. 

*/
protected String description ;




/**  
* Field amount
* Amount of revenue that will be shared with a party by the enterprise o 

* r a party that share with the enterprise for all offerings where reven 

* ue is shared. 

*/
protected Money amount ;




/**  
* Field partyRevenueShareNotification
*/
protected List<PartyRevenueShareNotification> partyRevenueShareNotification ;




/**  
* Field partyRevenueShareProdOffer
*/
protected List<PartyRevenueShareProdOffer> partyRevenueShareProdOffer ;




/**  
* Field partyInteractionRole
*/
protected PartyInteractionRole partyInteractionRole ;




/**  
* Field partyRevShareReconciliationItem
*/
protected List<PartyRevShareReconciliationItem> partyRevShareReconciliationItem ;




/**  
* Field partyRevenueShareRelationship
*/
protected List<PartyRevenueShareRelationship> partyRevenueShareRelationship ;




/**  
* Field partyRevenueShareRelationship1
*/
protected List<PartyRevenueShareRelationship> partyRevenueShareRelationship1 ;




/**  
* Field partyBill
*/
protected PartyBill partyBill ;




/**  
* Field partyPayment
*/
protected PartyPayment partyPayment ;




/**  
* Field partyBill2
*/
protected PartyBill partyBill2 ;


}