/**
* RA Action_Response ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E942E8EEBA0220-content.html">RA Action_Response ABE</a> 
* A step towards developing a RevenueAssuranceResponse. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_action_response_business_entity ;

/**
* The result of reconciling a RATroubleTicket represented by a series of 
*  one or more activities being initiated and performed. The RAResponse  
* can also determine the root cause for RATroubleTickets based on rules  
* that trigger the analysis. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class RevenueAssuranceResponse extends BusinessInteraction {



/**  
* Field revenueAssuranceAction
*/
protected RevenueAssuranceAction revenueAssuranceAction ;


}