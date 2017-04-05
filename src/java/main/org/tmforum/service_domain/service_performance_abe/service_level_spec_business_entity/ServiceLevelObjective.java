/**
* Service Level Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EB1D7B80071-content.html">Service Level Spec ABE</a> 
* The Service Specification ABE contains entities that define the invari 
* ant characteristics and behavior of both types of Service entities. Th 
* is enables multiple instances to be derived from a single specificatio 
* n entity. In this derivation, each instance will use the invariant cha 
* racteristics and behavior defined in its associated template.This ABE  
* includes a third type of Service Specification entity: that of a Servi 
* ceLevelSpecification. This type of specification templatizes Services  
* that are bound to a Service Level Agreement. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_performance_abe.service_level_spec_business_entity ;

/**
* Quality goal for a ServiceLevelSpecification defined in terms of param 
* eters and metrics, thresholds, and tolerances associated with the para 
* meters. 
 @since SID_R16.5
*/ 

public  class ServiceLevelObjective  {



/**  
* Field conformanceTarget
* A value used to determine if ServiceLevelObjective is met. 

*/
protected long conformanceTarget ;




/**  
* Field conformanceComparator
* An operator that specifies whether a ServiceLevelObjective is violated 

*  above or below the conformanceTarget. 

*/
protected String conformanceComparator ;




/**  
* Field conformancePeriod
* An interval of time during which the conformanceTarget must be measure 

* d. 

*/
protected TimePeriod conformancePeriod ;




/**  
* Field thresholdTarget
* A value that used to specify when a warning should be used that indica 

* tes an objective is danger of not being met. 

*/
protected long thresholdTarget ;




/**  
* Field toleranceTarget
* A value that specifies the allowable variation of a conformanceTarget. 

*/
protected long toleranceTarget ;




/**  
* Field tolerancePeriod
* An interval of time over which the toleranceTarget is acceptable befor 

* e indication of an objective violation. 

*/
protected TimePeriod tolerancePeriod ;




/**  
* Field gracePeriods
* The number of times an objective can remain un-updated without a viola 

* tion of a ServiceLevelAgreement in reference to a measurement period a 

* nd/or ServiceLevelAgreement reporting period. 

*/
protected Integer gracePeriods ;




/**  
* Field validFor
* The period of time during which the objective is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field serviceLevelSpecParameter
*/
protected ServiceLevelSpecParameter serviceLevelSpecParameter ;




/**  
* Field serviceLevelSpecApplicability
*/
protected List<ServiceLevelSpecApplicability> serviceLevelSpecApplicability ;




/**  
* Field serviceLevelSpecification
*/
protected ServiceLevelSpecification serviceLevelSpecification ;




/**  
* Field serviceLevelSpecConsequence
*/
protected List<ServiceLevelSpecConsequence> serviceLevelSpecConsequence ;




/**  
* Field serviceLevelSpecificationExpression
*/
protected List<ServiceLevelSpecExpression> serviceLevelSpecificationExpression ;


}