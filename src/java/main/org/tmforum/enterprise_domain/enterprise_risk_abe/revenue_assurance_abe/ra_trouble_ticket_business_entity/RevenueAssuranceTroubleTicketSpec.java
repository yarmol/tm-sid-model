/**
* RA Trouble Ticket ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E942E8EEA60253-content.html">RA Trouble Ticket ABE</a> 
* A TroubleTicket opened to resolve one or several causes (for example,  
* RA Violations) that resulted in a RAKeyPerformanceIndicator exceeding  
* one or more RAObjective thresholds. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_trouble_ticket_business_entity ;

/**
* The invariant characteristics of a RevenueAssuranceTroubleTicket. Each 
*  of these instances will have the same invariant characteristics. Howe 
* ver, the values associated with other characteristics of the instantia 
* ted RevenueAssuranceTroubleTicket will be specific to each instance. 
 @since SID_R16.5
*/ 

public  class RevenueAssuranceTroubleTicketSpec  {



/**  
* Field name
* A word, term, or phrase by which a specification is known and distingu 

* ished from other RevenueAssuranceTroubleTicketSpecifications. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the specification is. 

*/
protected String description ;




/**  
* Field validFor
* The period of itme during which the specification is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field revenueAssuranceTroubleTicket
*/
protected List<RevenueAssuranceTroubleTicket> revenueAssuranceTroubleTicket ;




/**  
* Field revenueAssuranceActionSpec
*/
protected List<RevenueAssuranceActionSpec> revenueAssuranceActionSpec ;




/**  
* Field revenueAssuranceViolationSpec
*/
protected List<RevenueAssuranceViolationSpec> revenueAssuranceViolationSpec ;




/**  
* Field revenueAssuranceKPIConsequence
*/
protected List<RevenueAssuranceKPIConsequence> revenueAssuranceKPIConsequence ;


}