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
* A measure of the effectiveness of RevenueAssuranceControls, RevenueAss 
* uranceObjectives, and RevenueAssuranceKPIs. RevenueAssuranceAssessment 
*  include recommendations for refining RevenueAssuranceControls, Revenu 
* eAssuranceObjectives and RevenueAssuranceKPIs. 
 @since SID_R16.5
*/ 

public  class RevenueAssuranceAssessment  {



/**  
* Field ID
* Unique identifier for the RevenueAssuranceAssessment. 

*/
protected String ID ;




/**  
* Field description
* A narrative that explains in detail the purpose of the RevenueAssuranc 

* eAssessment. 

*/
protected String description ;




/**  
* Field raAssessmentType
* A category that groups assessments that have strongly marked and readi 

* ly defined similarities. For example, effectivness, trend analysis, an 

* d so forth.</br></br> 

*/
protected String raAssessmentType ;




/**  
* Field dateCreated
* The date on which the RevenueAssuranceAssessment was created. 

*/
protected DateTime dateCreated ;




/**  
* Field dateStarted
* The date on which the RevenueAssuranceAssessement was started. 

*/
protected DateTime dateStarted ;




/**  
* Field dateComplete
* The date on which the RevenueAssuranceAssessment was completed. 

*/
protected DateTime dateComplete ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field revenueAssuranceAssessmentItem
*/
protected List<RevenueAssuranceAssessmentItem> revenueAssuranceAssessmentItem ;


}