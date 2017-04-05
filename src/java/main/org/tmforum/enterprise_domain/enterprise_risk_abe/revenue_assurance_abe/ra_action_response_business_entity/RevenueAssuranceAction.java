/**
* RA Action_Response ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E942E8EEBA0220-content.html">RA Action_Response ABE</a> 
* A step towards developing a RevenueAssuranceResponse. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_action_response_business_entity ;

/**
* A step towards developing a RevenueAssuranceResponse. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Activity ABE::Activity |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElement @since SID_R16.5
*/ 

public  class RevenueAssuranceAction extends Activity,ProjectElement {



/**  
* Field revenueAssuranceTroubleTicket
*/
protected RevenueAssuranceTroubleTicket revenueAssuranceTroubleTicket ;




/**  
* Field revenueAssuranceResponse
*/
protected List<RevenueAssuranceResponse> revenueAssuranceResponse ;


}