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
* Goal for a RevenueAssuranceParameter defined in terms of metrics, thre 
* sholds, and tolerances. 
 @since SID_R16.5
*/ 

public  class RevenueAssuranceObjective  {



/**  
* Field name
* A word, term, or phrase by which an objective is known and distinguish 

* ed from other RevenueAssuranceObjectives. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the objective is. 

*/
protected String description ;




/**  
* Field conformanceTarget
* A value used to determine if the objective is met. 

*/
protected long conformanceTarget ;




/**  
* Field conformanceComparator
* An operator that specifies whether an objective is violated above or b 

* elow the conformanceTarget. 

*/
protected String conformanceComparator ;




/**  
* Field conformancePeriod
* An interval of time during which the conformanceTarget must be measure 

* d. 

*/
protected Duration conformancePeriod ;




/**  
* Field thresholdTarget
* A percent that is used to specify when a warning should be used that i 

* ndicates an objective is in danger of not being met. 

*/
protected long thresholdTarget ;




/**  
* Field toleranceTarget
* A percent that specifies the allowable variation of a conformanceTarge 

* t. 

*/
protected long toleranceTarget ;




/**  
* Field tolerancePeriod
* An interval of time over which the toleranceTarget is acceptable befor 

* e indication of an objective violation. 

*/
protected Duration tolerancePeriod ;




/**  
* Field gracePeriods
* The number of times an objective can remain un-updated in reference to 

*  the conformancePeriod without a objective violation being created. 

*/
protected Integer gracePeriods ;




/**  
* Field validFor
* The period of time during which the objective is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field policySet
*/
protected List<PolicySet> policySet ;




/**  
* Field revenueAssuranceParameter
*/
protected List<RevenueAssuranceParameter> revenueAssuranceParameter ;




/**  
* Field revenueAssuranceApplicability
*/
protected List<RevenueAssuranceApplicability> revenueAssuranceApplicability ;




/**  
* Field revenueAssuranceConsequence
*/
protected List<RevenueAssuranceConsequence> revenueAssuranceConsequence ;




/**  
* Field revenueAssuranceAssessmentItem
*/
protected List<RevenueAssuranceAssessmentItem> revenueAssuranceAssessmentItem ;


}