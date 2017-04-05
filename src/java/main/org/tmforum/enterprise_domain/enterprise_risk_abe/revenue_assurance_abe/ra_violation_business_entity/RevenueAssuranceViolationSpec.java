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
* The invariant characteristics of a RevenueAssuranceViolation. Each rel 
* ated RevenueAssuranceViolation instance will have the same invariant c 
* haracteristics. However, the values associated with other characterist 
* ics of the instantiated RevenueAssuranceViolation are specific to each 
*  instance. 
 @since SID_R16.5
*/ 

public  class RevenueAssuranceViolationSpec  {



/**  
* Field revenueAssuranceControlConsequence
*/
protected List<RevenueAssuranceControlConsequence> revenueAssuranceControlConsequence ;




/**  
* Field name
* A word, term, or phrase by which a violation specification is known an 

* d distinguished from other RevenueAssuranceViolationSpecs.</br></br> 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the violation spec is. 

*/
protected String description ;




/**  
* Field validFor
* The period for which the specification is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field revenueAssuranceViolation
*/
protected List<RevenueAssuranceViolation> revenueAssuranceViolation ;




/**  
* Field revenueAssuranceTroubleTicketSpec
*/
protected List<RevenueAssuranceTroubleTicketSpec> revenueAssuranceTroubleTicketSpec ;


}