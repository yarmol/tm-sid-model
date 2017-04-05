/**
* Party Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.bI.sE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Bill ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_business_entity ;

/**
* A detailed description of a party's bill structure. The current versio 
* n of this class is serving as a placeholder. It will be further develo 
* ped in the next version of this document. 
 @since SID_R16.5
*/ 

public  class PartyBillSpec  {



/**  
* Field name
* A short descriptive name. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail the specification. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the PartyBillSpec is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field partyBillFormat
*/
protected List<PartyBillFormat> partyBillFormat ;




/**  
* Field partyBill
*/
protected List<PartyBill> partyBill ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;




/**  
* Field partyBillingCycleSpecification
*/
protected List<PartyBillingCycleSpecification> partyBillingCycleSpecification ;




/**  
* Field partyBillingCycle
*/
protected List<PartyBillingCycle> partyBillingCycle ;


}