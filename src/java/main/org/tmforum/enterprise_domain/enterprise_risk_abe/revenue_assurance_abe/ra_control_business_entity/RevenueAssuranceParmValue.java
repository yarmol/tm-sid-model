/**
* RA Control ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E94300F8D702F2-content.html">RA Control ABE</a> 
* Policy-based rules that represent the logical definition of comparison 
* s performed on entities, such as CustomerBills and CallDetailRecords,  
* to identify RAViolations. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_control_business_entity ;

/**
* A numerical value or text determined for a RevenueAssuranceParameter.  
* For example, a value of 10 determined for the number of Customers not  
* billed in a given day. 
 @since SID_R16.5
*/ 

public  class RevenueAssuranceParmValue  {



/**  
* Field value
* A discrete value determined for the parameter. 

*/
protected String value ;




/**  
* Field dateCreated
* The date on which the value was created. 

*/
protected DateTime dateCreated ;




/**  
* Field validFor
* The period for which the parameter value is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field revenueAssuranceParameter
*/
protected RevenueAssuranceParameter revenueAssuranceParameter ;




/**  
* Field revenueAssuranceViolation
*/
protected List<RevenueAssuranceViolation> revenueAssuranceViolation ;




/**  
* Field revenueAssuranceTroubleTicket
*/
protected List<RevenueAssuranceTroubleTicket> revenueAssuranceTroubleTicket ;




/**  
* Field revenueAssuranceConsequence
*/
protected List<RevenueAssuranceConsequence> revenueAssuranceConsequence ;




/**  
* Field rootEntity
*/
protected RootEntity rootEntity ;




/**  
* Field revenueAssuranceTrend
*/
protected List<RevenueAssuranceTrend> revenueAssuranceTrend ;


}