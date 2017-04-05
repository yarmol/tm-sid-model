/**
* Party Bill ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.e.bI.sE4.cE.eO_X.pEX.s37Q.e.w-content.html">Party Bill ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_revenue_abe.party_bill_business_entity ;

/**
* A billing time period. It can be recurring (for example, a week, a mon 
* th, a quarter of year, a year) or partyom (in this case additional bus 
* iness entities to describe partyom dates would be needed). 
 @since SID_R16.5
*/ 

public  class BillingPeriod  {



/**  
* Field name
* A short descriptive name such as "week", "month" and "quarter of a yea 

* r".</br> 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail the semantics of this component. 

*/
protected String description ;




/**  
* Field partyBillingCycleSpecification
*/
protected List<PartyBillingCycleSpecification> partyBillingCycleSpecification ;


}