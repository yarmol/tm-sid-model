/**
* Party Revenue Share Reconciliation ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.q.f.n.rUEK5E.e.a.m.lL.c.v.q.v7Y.pA-content.html">Party Revenue Share Reconciliation ABE</a> 
* The Party Revenue Sharing Reconciliation ABE ensures that two sets of  
* party revenue sharing records are aligned and agreed upon. For example 
* , an enterprise may receive an invoice from another party that is comp 
* ared to the revenue share that has been determined to be shared with t 
* he party contained in the Party Revenue Share ABE.Reconciliation inclu 
* des comparing what is received with what is to be paid, invoiced or cr 
* edited/debited to an bill/invoice or account balance, identifying and  
* resolving discrepancies, identifying adjustments to revenue to be shar 
* ed, and tracking discrepancy resolution. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_revenue_sharing_abe.party_revenue_share_reconciliation_business_entity ;

/**
* A difference between information received from another party with the  
* revenue share determined by an enterprise that is to be resolved. For  
* example, an enterprise's calculated revenue share for a product offeri 
* ng may be missing a product that has been acquired that appears on an  
* bill/invoice from another party.Note: This entity is related to two of 
*  any combination of PartyPayment, PartyPaymentItem, ComponentShareProd 
* OfferItem, AppliedPartyBillingRate. 
 @since SID_R16.5
*/ 

public  class PartyRevShareReconDiscrepancy  {



/**  
* Field partyRevShareReconciliationItem
*/
protected PartyRevShareReconciliationItem partyRevShareReconciliationItem ;




/**  
* Field partyRevenueShareAdjustment
*/
protected List<PartyRevenueShareAdjustment> partyRevenueShareAdjustment ;




/**  
* Field revShareReconDiscrepNotification
*/
protected List<RevShareReconDiscrepNotification> revShareReconDiscrepNotification ;




/**  
* Field appliedPartyBillingRate
*/
protected List<AppliedPartyBillingRate> appliedPartyBillingRate ;




/**  
* Field dateIdentified
* The date the PartyRevShareReconDiscrepancy was identified. 

*/
protected DateTime dateIdentified ;




/**  
* Field description
* A narrative that explains in detail what the PartyRevShareReconDiscrep 

* ancy is. 

*/
protected String description ;




/**  
* Field amount
* Amount of the discrepancy. 

*/
protected Money amount ;




/**  
* Field dateResolved
* The date that a PartyRevShareReconDiscrepancy is resolved. 

*/
protected DateTime dateResolved ;




/**  
* Field actionTaken
* Text that describes what action was taken, such as the creation of a P 

* artyRevenueShareAdjustment, an AppliedPartyBillingRate, an adjustment  

* to a PartyPayment, or a PartyPaymentItem. 

*/
protected String actionTaken ;




/**  
* Field appliedPartyBillingRate2
*/
protected AppliedPartyBillingRate appliedPartyBillingRate2 ;




/**  
* Field partyPayment
*/
protected PartyPayment partyPayment ;




/**  
* Field partyPaymentItem
*/
protected PartyPaymentItem partyPaymentItem ;




/**  
* Field componentRevShareProdOfferItem
*/
protected ComponentRevShareProdOfferItem componentRevShareProdOfferItem ;


}