/**
* RA Violation ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E94300F8E20045-content.html">RA Violation ABE</a> 
* A discrepancy identified based on applying Policies associated with RA 
* Control(s) to Revenue Assurance related entities, such as Products and 
*  ResourceUsage. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_violation_business_entity ;

/**
* A descrepency identified by applying RevenueAssuranceObjectives and/or 
*  Policies to Revenue Assurance related entities, such as Products and  
* ResourecUsage. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class RevenueAssuranceViolation extends BusinessInteraction {



/**  
* Field revenueAssuranceParmValue
*/
protected List<RevenueAssuranceParmValue> revenueAssuranceParmValue ;




/**  
* Field revenueAssuranceViolationSpec
*/
protected RevenueAssuranceViolationSpec revenueAssuranceViolationSpec ;




/**  
* Field revenueAssuranceTroubleTicket
*/
protected List<RevenueAssuranceTroubleTicket> revenueAssuranceTroubleTicket ;


}