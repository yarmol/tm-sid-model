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
* A ProductOffering which qualifies for revenue sharing.  
 @since SID_R16.5
*/ 

public  class PartyRevenueShareProdOffer  {



/**  
* Field partyRevenueShare
*/
protected PartyRevenueShare partyRevenueShare ;




/**  
* Field quantity
* The number of Products associated with an ProductOffering for which th 

* e  PartyRevenueShareProdOffer amount is determined. 

*/
protected Quantity quantity ;




/**  
* Field amount
* Amount that represents the revenue shared for a ProductOffering with a 

*  party by the enterprise or a party that will share with the enterpris 

* e. 

*/
protected Money amount ;




/**  
* Field partyRevenueSharingModelInvolvement
*/
protected PartyRevenueSharingModelInvolvement partyRevenueSharingModelInvolvement ;




/**  
* Field aggregateRevShareProdOffer
*/
protected AggregateRevShareProdOffer aggregateRevShareProdOffer ;




/**  
* Field partyRevenueShareProdOfferItem
*/
protected List<PartyRevenueShareProdOfferItem> partyRevenueShareProdOfferItem ;




/**  
* Field revenueShareProdOfferRelationship1
*/
protected List<RevenueShareProdOfferRelationship> revenueShareProdOfferRelationship1 ;




/**  
* Field revenueShareProdOfferRelationship
*/
protected List<RevenueShareProdOfferRelationship> revenueShareProdOfferRelationship ;


}