/**
* RA Action_Response ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E942E8EEBA0220-content.html">RA Action_Response ABE</a> 
* A step towards developing a RevenueAssuranceResponse. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_action_response_business_entity ;

/**
* The invariant characteristics of a RevenueAssuranceAction. Each relate 
* d RevenueAssuranceAction instance will have the same invariant charact 
* eristics. However, the values associated with other characteristics of 
*  the instantiated RevenueAssuranceAction are specific to each instance 
* . 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Activity ABE::ActivitySpec |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElementSpec @since SID_R16.5
*/ 

public  class RevenueAssuranceActionSpec extends ActivitySpec,ProjectElementSpec {



/**  
* Field revenueAssuranceResponseSpec
*/
protected List<RevenueAssuranceResponseSpec> revenueAssuranceResponseSpec ;




/**  
* Field revenueAssuranceTroubleTicketSpec
*/
protected List<RevenueAssuranceTroubleTicketSpec> revenueAssuranceTroubleTicketSpec ;


}