/**
* Party Billing Statistic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.b.wD04.cE.eO_X.pEX.s37Q.e.w-content.html">Party Billing Statistic ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_abe.party_billing_statistic_business_entity ;

/**
* Collected data derived from PartyBills. It is defined by PartyBillingS 
* tatisticSpecification. 
 @since SID_R16.5
*/ 

public abstract class PartyBillingStatistic  {



/**  
* Field statisticForPeriod
* The period for which the statistic is calculated. 

*/
protected TimePeriod statisticForPeriod ;




/**  
* Field partyBillingStatisticBalance
*/
protected PartyBillingStatisticBalance partyBillingStatisticBalance ;




/**  
* Field partyBillingStatisticSpec
*/
protected PartyBillingStatisticSpec partyBillingStatisticSpec ;


}