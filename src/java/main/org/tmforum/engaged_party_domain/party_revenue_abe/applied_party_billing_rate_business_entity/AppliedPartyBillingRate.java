/**
* Applied Party Billing Rate ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eW3QE4.cE.eO_X.pEX.s37Q.e.w-content.html">Applied Party Billing Rate ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.applied_party_billing_rate_business_entity ;

/**
* A charge or a credit assigned to the party's account in the course or  
* for the purpose of the billing process. Subclasses further define thes 
* e elements. 
 @since SID_R16.5
*/ 

public abstract class AppliedPartyBillingRate  {



/**  
* Field date
* A date of creation. 

*/
protected DateTime date ;




/**  
* Field quantity
* A unit (for example, US Dollars) and number of the applied rate. 

*/
protected Money quantity ;




/**  
* Field description
* A textual description. 

*/
protected String description ;




/**  
* Field compositeAppliedPartyBillingRate
*/
protected List<CompositeAppliedPartyBillingRate> compositeAppliedPartyBillingRate ;




/**  
* Field appliedPartyBillingTaxRate
*/
protected List<AppliedPartyBillingTaxRate> appliedPartyBillingTaxRate ;




/**  
* Field appliedPartyBillingProductAlteration
*/
protected List<AppliedPartyBillingProductAlteration> appliedPartyBillingProductAlteration ;




/**  
* Field partyBill
*/
protected PartyBill partyBill ;




/**  
* Field paymentItem
*/
protected List<PartyPaymentItem> paymentItem ;




/**  
* Field appliedPartyBillingRateSpec
*/
protected AppliedPartyBillingRateSpec appliedPartyBillingRateSpec ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field partySettlement
*/
protected PartySettlement partySettlement ;




/**  
* Field componentRevShareProdOfferItem
*/
protected List<ComponentRevShareProdOfferItem> componentRevShareProdOfferItem ;




/**  
* Field partyRevShareReconDiscrepancy
*/
protected PartyRevShareReconDiscrepancy partyRevShareReconDiscrepancy ;




/**  
* Field partyRevShareReconDiscrepancy2
*/
protected List<PartyRevShareReconDiscrepancy> partyRevShareReconDiscrepancy2 ;


}