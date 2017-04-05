/**
* Performance Threshold  ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aT.i60I.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Threshold  ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_threshold__business_entity ;

/**
* Various types of threshold logic can be implemented by this entity. Fo 
* r example: Indicator > Value. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Performance ABE::Performance Threshold  ABE::PerformanceThresholdRule" href="_.xR-G8IA.hE.eK.v.bLQ3.iK.x.r.uA-content.html">SID Models::Common Business Entities Domain::Performance ABE::Performance Threshold  ABE::PerformanceThresholdRule</a> @since SID_R16.5
*/ 

public  class PerformanceThresholdRuleDefinition extends PerformanceThresholdRule {



/**  
* Field conformancePeriod
* An interval of time during which the conformanceTarget must be measure 

* d. 

*/
protected Duration conformancePeriod ;




/**  
* Field thresholdTarget
* A percent that is used to specify when a warning should be used that i 

* ndicates a Performance threshold is in danger of being crossed. 

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

* e a Performance threshold Consequence is initiated. 

*/
protected Duration tolerancePeriod ;




/**  
* Field gracePeriods
* The number of allowed crossing occurrences in reference to the conform 

* ancePeriod without a Performance threshold Consequence being initiated 

* . 

*/
protected Integer gracePeriods ;




/**  
* Field conformanceTargetLower
* A value used to determine if the threshold is crossed or ceases to be  

* crossed. It represents the Lower limit.  The value should be less than 

*  the conformanceTargetUpper.   The conformance comparators should also 

*  be logically defined so as to not lead to a logically impossible cond 

* ition. 

*/
protected long conformanceTargetLower ;




/**  
* Field conformanceComparatorLower
* An operator that when applied on a value specifies whether a threshold 

*  is crossed or ceased to be crossed.</br>This operator is used to comp 

* are with the conformanceTargetLower. 

*/
protected MetricThresholdComparator conformanceComparatorLower ;




/**  
* Field conformanceTargetUpper
* A value used to determine if the threshold is crossed or ceases to be  

* crossed. It represents the Upper limit. The value should be greater th 

* an the conformanceTargetLower.   The conformance comparators should al 

* so be logically defined so as to not lead to a logically impossible co 

* ndition. 

*/
protected long conformanceTargetUpper ;




/**  
* Field conformanceComparatorUpper
* An operator that when applied on a value specifies whether a threshold 

*  is crossed or ceased to be crossed.</br>This operator is used to comp 

* are with the conformanceTargetUpper. 

*/
protected MetricThresholdComparator conformanceComparatorUpper ;


}