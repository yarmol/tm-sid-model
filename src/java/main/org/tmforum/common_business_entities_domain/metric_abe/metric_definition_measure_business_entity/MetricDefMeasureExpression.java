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
* MetricDefMeasureExpression describes strict relations between MetricDe 
* fMeasure subordinates (MetricDefMeasureThresholdRule, MetricDefMeasure 
* Applicability, MetricDefMeasureConsequence). The baseline idea of Metr 
* icDefMeasureExpression is to resolve the multiple associations between 
*  MetricDefMeasure subordinates. For example, an expression may consist 
*  of a consequence and its applicability for a MetricDefMeasure. 
 @since SID_R16.5
*/ 

public  class MetricDefMeasureExpression  {



/**  
* Field metricDefMeasure
*/
protected MetricDefMeasure metricDefMeasure ;




/**  
* Field metricDefMeasureApplicability1
*/
protected MetricDefMeasureApplicability metricDefMeasureApplicability1 ;




/**  
* Field metricDefMeasureThresholdRule1
*/
protected MetricDefMeasureThresholdRule metricDefMeasureThresholdRule1 ;




/**  
* Field metricDefMeasureConsequence1
*/
protected MetricDefMeasureConsequence metricDefMeasureConsequence1 ;




/**  
* Field metricDefMeasureApplicability
* An indicator that is set to true if a MetricDefMeasureApplicability is 

*  part of the MetricDefMeasureExpresssion. 

*/
protected Boolean metricDefMeasureApplicability ;




/**  
* Field metricDefMeasureConsequence
* An indicator that is set to true if a MetricDefMeasureConsequence is p 

* art of the MetricDefMeasureExpresssion. 

*/
protected Boolean metricDefMeasureConsequence ;




/**  
* Field metricDefMeasureThresholdRule
* An indicator that is set to true if a MetricDefMeasureThresholdRule is 

*  part of the MetricDefMeasureExpresssion. 

*/
protected Boolean metricDefMeasureThresholdRule ;




/**  
* Field validFor
* The period of time during which the MetricDefMeasureExpression applies 

* . 

*/
protected TimePeriod validFor ;


}