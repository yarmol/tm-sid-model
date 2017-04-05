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
* A trouble ticket opened to resolve one or serveral causes (for example 
* , RevenueAssuranceViolations) that resulted in a RevenueAssuranceKPI e 
* xceeding one or more Revenue AssuranceObjective thresholds. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Trouble Ticket ABE::TroubleTicket |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class RevenueAssuranceTroubleTicket extends TroubleTicket,BusinessInteraction {



/**  
* Field revenueAssuranceAction
*/
protected List<RevenueAssuranceAction> revenueAssuranceAction ;




/**  
* Field revenueAssuranceTroubleTicketSpec
*/
protected RevenueAssuranceTroubleTicketSpec revenueAssuranceTroubleTicketSpec ;




/**  
* Field revenueAssuranceParmValue
*/
protected List<RevenueAssuranceParmValue> revenueAssuranceParmValue ;




/**  
* Field revenueAssuranceViolation
*/
protected List<RevenueAssuranceViolation> revenueAssuranceViolation ;


}