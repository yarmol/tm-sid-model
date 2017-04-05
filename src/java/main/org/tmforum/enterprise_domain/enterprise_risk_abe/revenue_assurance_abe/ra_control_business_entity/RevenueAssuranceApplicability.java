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
* The time of day or days during which a RevenueAssuranceObjective or Re 
* venueAssuranceConsequence is relevant or not. 
 @since SID_R16.5
*/ 

public  class RevenueAssuranceApplicability  {



/**  
* Field revenueAssuranceParameter
*/
protected List<RevenueAssuranceParameter> revenueAssuranceParameter ;




/**  
* Field name
* A word, term, or phrase by which an applicability is known and disting 

* uished from other RevenueAssuranceApplicabilities. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the applicability is. 

*/
protected String description ;




/**  
* Field unapplicableApplicableCode
* Indicator that specifies whether an instance represents applicability  

* or un-applicability. 

*/
protected String unapplicableApplicableCode ;




/**  
* Field unappAppDuring
* A period of time representing applicability or un-applicability. For e 

* xample, from 8AM to 12PM. 

*/
protected TimePeriod unappAppDuring ;




/**  
* Field unappAppDays
* A day or days representing applicability or un-applicability. For exam 

* ple 2, 3 represents Monday and Tuesday. 

*/
protected String unappAppDays ;




/**  
* Field validFor
* The period of time during which the applicability is in force. 

*/
protected TimePeriod validFor ;




/**  
* Field revenueAssuranceObjective
*/
protected List<RevenueAssuranceObjective> revenueAssuranceObjective ;




/**  
* Field revenueAssuranceConsequence
*/
protected List<RevenueAssuranceConsequence> revenueAssuranceConsequence ;




/**  
* Field revenueAssuranceAssessmentItem
*/
protected List<RevenueAssuranceAssessmentItem> revenueAssuranceAssessmentItem ;


}