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
* A MetricDefMeasure specifies a measure of a specific aspect of an enti 
* ty, such as lost packets or dealer sales target achievement, defined f 
* or a MetricDefinition that may trigger consequence (s) (MetricDefMeasu 
* reConsequence) if a threshold (MetricDefMeasureThreshold) is crossed. 
 @since SID_R16.5
*/ 

public  class MetricDefMeasure  {



/**  
* Field unitOfMeasure
* The unit of measure for the Metric values associated with a MetricDefM 

* easure, such as meters, cubic yards, kilograms [ISO 1000]. 

*/
protected Quantity unitOfMeasure ;




/**  
* Field accuracy
* The number of digits of accuracy captured for Metrics associated with  

* a MetricDefMeasure. 

*/
protected Integer accuracy ;




/**  
* Field capturePeriod
* The period during which Metrics associated with a MetricDefMeasure are 

*  captured.</br></br></br>Note:  This may be replaced by a set of entit 

* ies similar to the Performance Monitoring ABEs. 

*/
protected TimePeriod capturePeriod ;




/**  
* Field valueType
* A kind of value that the Metric value associated with a MetricDefMeasu 

* re can take on, such as numeric, text, and so forth. 

*/
protected MetricValueType valueType ;




/**  
* Field captureMethod
* The method used to capture the Metrics associated with a MetricDefMeas 

* ure.</br></br></br>Note:  This may be replaced by a set of entities si 

* milar to the Performance Monitoring ABEs. 

*/
protected String captureMethod ;




/**  
* Field captureFrequency
* The frequency of capture for the MetricDefMeasure.</br></br>Note:  Thi 

* s may be replaced by a set of entities similar to the Performance Moni 

* toring ABEs. 

*/
protected String captureFrequency ;




/**  
* Field validFor
* The period for which the MetricDefMeasure is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field metricDefinition
*/
protected MetricDefinition metricDefinition ;




/**  
* Field metricDefinitionThresholdSet
*/
protected List<MetricDefMeasureThresholdSet> metricDefinitionThresholdSet ;




/**  
* Field metricDefinitionDeterminationMethod
*/
protected List<MetricDefinitionDeterminationMethod> metricDefinitionDeterminationMethod ;




/**  
* Field predefinedMetricThresholdRuleParam
*/
protected List<PreDefinedMetricThresholdRuleParam> predefinedMetricThresholdRuleParam ;




/**  
* Field metricDefMeasureGroup
*/
protected MetricDefMeasureGroup metricDefMeasureGroup ;




/**  
* Field metricMeasurementJob
*/
protected List<MetricMeasurementJob> metricMeasurementJob ;




/**  
* Field metricMeasure
*/
protected List<MetricMeasure> metricMeasure ;




/**  
* Field metricDefMeasureExpression
*/
protected List<MetricDefMeasureExpression> metricDefMeasureExpression ;




/**  
* Field metricApplicability
*/
protected List<MetricDefMeasureApplicability> metricApplicability ;


}