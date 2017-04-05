/**
* Metric Definition Measure Threshold ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.i.x.kCUN54E.eK.r.x6.vY.l-.rD.f.g-content.html">Metric Definition Measure Threshold ABE</a> 
* The Metric Definition Measure Threshold ABE contains all entities desc 
* ribing the threshold used for MetricDefMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_abe.metric_definition_measure_threshold_business_entity ;

/**
* Various types of threshold logic can be implemented by this entity. Fo 
* r example: Indicator > Value. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Metric ABE::Metric Definition Measure ABE::Metric Definition Measure Threshold ABE::MetricDefMeasureThresholdRule" href="_.t6_.v5H0WE.eO.iY.q.x.wU.q84N.g-content.html">SID Models::Common Business Entities Domain::Metric ABE::Metric Definition Measure ABE::Metric Definition Measure Threshold ABE::MetricDefMeasureThresholdRule</a> @since SID_R16.5
*/ 

public  class MetricThresholdRuleDefinition extends MetricDefMeasureThresholdRule {



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




/**  
* Field tolerancePeriod
* An interval of time of allowed crossing occurrences before a consequen 

* ce being initiated.</br> 

*/
protected Duration tolerancePeriod ;




/**  
* Field numberOfAllowedCrossing
* The number of allowed crossing occurrences in reference to the toleran 

* cePeriod without a consequence being initiated. 

*/
protected Integer numberOfAllowedCrossing ;


}