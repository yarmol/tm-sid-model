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
* A day or days representing applicability or un-applicability.  For exa 
* mple 2, 3 represent Monday and Tuesday. 
 @since SID_R16.5
*/ 

public  class MetricDefMeasureApplicability  {



/**  
* Field ID
*/
protected String ID ;




/**  
* Field name
*/
protected String name ;




/**  
* Field description
*/
protected String description ;




/**  
* Field applicableCode
*/
protected String applicableCode ;




/**  
* Field applicableDuring
*/
protected TimePeriod applicableDuring ;




/**  
* Field applicableDays
* A day or days representing applicability or un-applicability.  For exa 

* mple 2, 3 represent Monday and Tuesday. 

*/
protected String applicableDays ;




/**  
* Field validFor
* The period of time during which the applicability is in force. 

*/
protected TimePeriod validFor ;




/**  
* Field metricDefMeasureConsequence
*/
protected List<MetricDefMeasureConsequence> metricDefMeasureConsequence ;




/**  
* Field metricDefMeasureThresholdRule
*/
protected List<MetricDefMeasureThresholdRule> metricDefMeasureThresholdRule ;




/**  
* Field metricDefMeasureExpression
*/
protected List<MetricDefMeasureExpression> metricDefMeasureExpression ;




/**  
* Field metricDefMeasure
*/
protected List<MetricDefMeasure> metricDefMeasure ;


}