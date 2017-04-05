/**
* RA Assessment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E94300F92E0291-content.html">RA Assessment ABE</a> 
* A measure of the effectivness of RAControls, RAObjectives, and RA KPIs 
* . RAAssessment also includes recommendations for refining RAControls,  
* RAObjectives, and RAKPIs. 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.enterprise_risk_abe.revenue_assurance_abe.ra_assessment_business_entity ;

/**
* The purpose of a RevenueAssuranceAssessment expressed in terms of one  
* or more RevenueAssuranceParameters, RevenueAssuranceObjectives, Revenu 
* eAssuranceConsequences, RevenueAssuranceApplicability. 
 @since SID_R16.5
*/ 

public  class RevenueAssuranceAssessmentItem  {



/**  
* Field description
* A narrative that explains in detail the purpose of the RevenueAssuranc 

* eAssessmentItem. 

*/
protected String description ;




/**  
* Field dateStarted
* The date on which the assessment was started for a RevenueAssuranceAss 

* essmentItem. 

*/
protected DateTime dateStarted ;




/**  
* Field dateComplete
* The date on which the assessment on the RevenueAssuranceAssessmentItem 

*  was completed. 

*/
protected DateTime dateComplete ;




/**  
* Field revenueAssuranceAssessment
*/
protected RevenueAssuranceAssessment revenueAssuranceAssessment ;




/**  
* Field revenueAssuranceAssessmentResult
*/
protected List<RevenueAssuranceAssessmentResult> revenueAssuranceAssessmentResult ;




/**  
* Field revenueAssuranceParameter
*/
protected List<RevenueAssuranceParameter> revenueAssuranceParameter ;




/**  
* Field revenueAssuranceObjective
*/
protected List<RevenueAssuranceObjective> revenueAssuranceObjective ;




/**  
* Field revenueAssuranceConsequence
*/
protected List<RevenueAssuranceConsequence> revenueAssuranceConsequence ;




/**  
* Field revenueAssuranceApplicability
*/
protected List<RevenueAssuranceApplicability> revenueAssuranceApplicability ;


}