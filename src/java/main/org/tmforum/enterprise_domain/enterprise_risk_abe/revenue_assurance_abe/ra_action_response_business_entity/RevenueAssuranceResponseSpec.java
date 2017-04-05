/**
* RA Action_Response ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E942E8EEBA0220-content.html">RA Action_Response ABE</a> 
* A step towards developing a RevenueAssuranceResponse. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_action_response_business_entity ;

/**
* The invariant characteristics of a RevenueAssuranceResponse. Each rela 
* ted RevenueAssuranceResponse instance will have the same invariant cha 
* racteristics. However, the values associated with other characteristic 
* s of the instantiated RevenueAssuranceResponse are specific to each in 
* stance. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionSpec @since SID_R16.5
*/ 

public  class RevenueAssuranceResponseSpec extends BusinessInteractionSpec {



/**  
* Field revenueAssuranceActionSpec
*/
protected List<RevenueAssuranceActionSpec> revenueAssuranceActionSpec ;


}