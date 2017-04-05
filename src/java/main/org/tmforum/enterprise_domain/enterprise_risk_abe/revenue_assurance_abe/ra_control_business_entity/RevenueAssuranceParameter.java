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
* A variable whose value is used to determine compliance with a RevenueA 
* ssuranceObjective. 
 @since SID_R16.5
*/ 

public abstract class RevenueAssuranceParameter  {



/**  
* Field revenueAssuranceApplicability
*/
protected List<RevenueAssuranceApplicability> revenueAssuranceApplicability ;




/**  
* Field name
* A word, term, or phrase by which a parameter is known and distinguishe 

* d from other RevenueAssuranceParameters.</br></br> 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the parmeter is. 

*/
protected String description ;




/**  
* Field raParmPerspective
* The point of view for the parameter, such as a single user instance or 

*  an aggregation. 

*/
protected String raParmPerspective ;




/**  
* Field raParmCategory
* A grouping or set of parameters that are classified together because o 

* f common characteristics, such as technology specific, service specifi 

* c, or technology/service independent.</br></br> 

*/
protected String raParmCategory ;




/**  
* Field calculationFrequency
* The rate of occurrence that a value for a parameter is determined. For 

*  example, hourly, daily, weekly. 

*/
protected String calculationFrequency ;




/**  
* Field raParmDerivationAlgorithm
* A step-by-step procedure used to calculate the parameter. 

*/
protected String raParmDerivationAlgorithm ;




/**  
* Field validFor
* The period of itme during which the parameter is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field revenueAssuranceObjective
*/
protected List<RevenueAssuranceObjective> revenueAssuranceObjective ;




/**  
* Field revenueAssuranceParmValue
*/
protected List<RevenueAssuranceParmValue> revenueAssuranceParmValue ;




/**  
* Field rootEntityType
*/
protected List<RootEntityType> rootEntityType ;




/**  
* Field revenueAssuranceAssessmentItem
*/
protected List<RevenueAssuranceAssessmentItem> revenueAssuranceAssessmentItem ;


}