/**
* Metric Definition Measure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_LG5.m0A8.rE.eOYVLP.tPBF.v2.g-content.html">Metric Definition Measure ABE</a> 
* The MetricDefMeasure specifies a measure of a specific aspect of an en 
* tity and is the main part of a MetricDefinition.The Metric Definition  
* Measure ABE contains all entities describing the MetricDefMeasure such 
*  as the related threshold, notification and consequence. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_business_entity ;

/**
* A MetricDefMeasureConsequence defines the action (prescribed action or 
*  notification) to take when a MetricDefMeasureThresholdRule is crossed 
* .The same MetricDefMeasureConsequence might be reused by several Metri 
* cDefMeasureThresholdRules.Different consequences (MetricDefMeasureCons 
* equence) can be defined for different severities. 
 @since SID_R16.5
*/ 

public  class MetricDefMeasureConsequence  {



/**  
* Field ID
* A unique identifier for the MetricDefMeasureConsequence. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a MetricDefMeasureConsequence is know 

* n and distinguished from other MetricDefMeasureConsequences. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the PerforrmanceConsequence i 

* s. 

*/
protected String description ;




/**  
* Field prescribedAction
* Recommended remedy for a violated threshold. 

*/
protected String prescribedAction ;




/**  
* Field validFor
* The period for which a MetricDefMeasureConsequence applies. 

*/
protected TimePeriod validFor ;




/**  
* Field metricThresholdRule
*/
protected List<MetricDefMeasureThresholdRule> metricThresholdRule ;




/**  
* Field metricMeasureConsequence
*/
protected List<MetricMeasureConsequence> metricMeasureConsequence ;




/**  
* Field consequenceMetricNotificationSpec
*/
protected List<ConsequenceMetricNotificationSpec> consequenceMetricNotificationSpec ;




/**  
* Field metricApplicability
*/
protected List<MetricDefMeasureApplicability> metricApplicability ;




/**  
* Field metricDefMeasureExpression
*/
protected List<MetricDefMeasureExpression> metricDefMeasureExpression ;




/**  
* Field metricDefMeasureThreshConsDependency
*/
protected List<MetricDefMeasureThreshConsDependency> metricDefMeasureThreshConsDependency ;




/**  
* Field metricDefMeasureThresholdConsequence
*/
protected MetricDefMeasureThresholdConsequence metricDefMeasureThresholdConsequence ;




/**  
* Field repeatAction
* An indicator use to specify that a consequence should cease  being app 

* lied if a value is in the same range as the previous value</br>or cont 

* inue being applied if a value is in the same range as the previous val 

* ue.</br></br>If the repeatApplication is True, if the consequence is a 

* lways applied as soon as the MetricMeasure value is in the range of va 

* lues and if the repeatApplication is False, the consequence is applied 

*  only if the previous MetricMeasure value wasn’t in the same range. 

*/
protected Boolean repeatAction ;




/**  
* Field metricDefMeasureThresholdRule
*/
protected List<MetricDefMeasureThresholdRule> metricDefMeasureThresholdRule ;




/**  
* Field metricDefMeasureThresholdRule2
*/
protected MetricDefMeasureThresholdRule metricDefMeasureThresholdRule2 ;


}