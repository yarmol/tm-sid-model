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
* An action taken if a RevenueAssuranceObjective is not met. 
 @since SID_R16.5
*/ 

public abstract class RevenueAssuranceConsequence  {



/**  
* Field name
* A word, term, or phrase by which an consequence is known and distingui 

* shed from other RevenueAssuranceConsequences. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the consequence is. 

*/
protected String description ;




/**  
* Field prescribedAction
* Recommended remedy for a violated RevenueAssuranceControl or RevenueAs 

* suranceKPI. 

*/
protected String prescribedAction ;




/**  
* Field validFor
* The period for which a consequence applies. 

*/
protected TimePeriod validFor ;




/**  
* Field revenueAssuranceObjective
*/
protected List<RevenueAssuranceObjective> revenueAssuranceObjective ;




/**  
* Field revenueAssuranceApplicability
*/
protected List<RevenueAssuranceApplicability> revenueAssuranceApplicability ;




/**  
* Field policyAction
*/
protected PolicyAction policyAction ;




/**  
* Field revenueAssuranceParmValue
*/
protected List<RevenueAssuranceParmValue> revenueAssuranceParmValue ;




/**  
* Field revenueAssuranceAssessmentItem
*/
protected List<RevenueAssuranceAssessmentItem> revenueAssuranceAssessmentItem ;


}