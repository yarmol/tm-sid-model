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
* The outcome of a RevenueAssuranceAssessment. The outcome may be a reco 
* mmendation to refine a RevenueAssuranceParameter, a RevenueAssuranceOb 
* jective, RevenueAssuranceConsequence, RevenueAssuranceApplicability or 
*  the identification of a RevenueAssuranceTrend. 
 @since SID_R16.5
*/ 

public  class RevenueAssuranceAssessmentResult  {



/**  
* Field description
* A narrative that explains in detail the the RevenueAssuranceAssessment 

* Result. 

*/
protected String description ;




/**  
* Field dateCreated
* The date on which the RevenueAssuranceAssessmentResult was created. 

*/
protected DateTime dateCreated ;




/**  
* Field revenueAssuranceAssessmentItem
*/
protected RevenueAssuranceAssessmentItem revenueAssuranceAssessmentItem ;


}