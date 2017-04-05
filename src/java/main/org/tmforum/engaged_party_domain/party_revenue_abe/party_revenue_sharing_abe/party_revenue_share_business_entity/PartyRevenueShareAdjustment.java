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
* An adjustment to the revenue to be shared among an enterprise and one  
* or more other parties. This could be required, but not limited to, bas 
* ed on changes to a revenue sharing model associated with a party reven 
* ue sharing agreement or based on discrepancies found by the Party Reve 
* nue Share Reconciliation process. 
 @since SID_R16.5
*/ 

public  class PartyRevenueShareAdjustment  {



/**  
* Field componentRevShareProdOfferItem
*/
protected ComponentRevShareProdOfferItem componentRevShareProdOfferItem ;




/**  
* Field dateDetermined
* The date the adjustment was determined. 

*/
protected DateTime dateDetermined ;




/**  
* Field adjustmentReason
* The reason the adjustment was determined. 

*/
protected String adjustmentReason ;




/**  
* Field amount
* Amount of the adjustment to be made. 

*/
protected Money amount ;




/**  
* Field partyRevShareReconDiscrepancy
*/
protected PartyRevShareReconDiscrepancy partyRevShareReconDiscrepancy ;


}