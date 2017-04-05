/**
* Party Billing Statistic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.b.wD04.cE.eO_X.pEX.s37Q.e.w-content.html">Party Billing Statistic ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_abe.party_billing_statistic_business_entity ;

/**
* A detailed description of a collection of statistical data derived fro 
* m PartyBills (for example, party account charge sum over a certain per 
* iod of time). Statistical data are typically collected during rating a 
* nd billing processes. A specification may be implemented using a rules 
*  engine or a policy to determine collection rules. 
 @since SID_R16.5
*/ 

public abstract class PartyBillingStatisticSpec  {



/**  
* Field name
* The name of the specification. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the specification is. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the specification is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field lifecycleStatus
* The condition of the specification, such as active, inactive, planned. 

*/
protected Integer lifecycleStatus ;




/**  
* Field partyBillingStatistic
*/
protected List<PartyBillingStatistic> partyBillingStatistic ;


}