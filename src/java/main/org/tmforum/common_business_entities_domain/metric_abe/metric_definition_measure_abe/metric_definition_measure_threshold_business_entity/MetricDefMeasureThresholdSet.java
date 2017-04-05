/**
* Metric Definition Measure Threshold ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.i.x.kCUN54E.eK.r.x6.vY.l-.rD.f.g-content.html">Metric Definition Measure Threshold ABE</a> 
* The Metric Definition Measure Threshold ABE contains all entities desc 
* ribing the threshold used for MetricDefMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_abe.metric_definition_measure_threshold_business_entity ;

/**
* A MetricDefMeasureThresholdSet provides a way to group a set of one or 
*  more MetricDefMeasureThresholdRules specifying the condition to evalu 
* ate for applying consequences.A MetricDefMeasureThresholdSet is used t 
* o evaluate one or more MetricDefMesures.A MetricDefMeasureThresholdSet 
*  contains either MetricThresholdRuleDefinition instances or PreDefined 
* MetricThresholdRule instances. 
 @since SID_R16.5
*/ 

public  class MetricDefMeasureThresholdSet  {



/**  
* Field metricDefMeasurement
*/
protected MetricDefMeasure metricDefMeasurement ;




/**  
* Field ID
* A unique identifier for the MetricDefMeasureThresholdSet. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a MetricDefMeasureThresholdSet is kno 

* wn and distinguished from other thresholds. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the MetricDefMeasureThreshold 

* Set is. 

*/
protected String description ;




/**  
* Field thresholdType
* The thresholdType specifies the type of MetricDefMeasureThresholdRule  

* contained in the MetricDefMeasureThresholdSet.</br>The value is “Logic 

* Definition” if the MetricDefMeasureThresholdSet contains only MetricTh 

* resholdRuleDefinition instances and “PreDefined” if it contains only P 

* reDefinedMetricThresholdRule instances. 

*/
protected MetricThresholdType thresholdType ;




/**  
* Field metricDefMeasureThresholdRule
*/
protected MetricDefMeasureThresholdRule metricDefMeasureThresholdRule ;




/**  
* Field metricMeasurementThresholdJob
*/
protected List<MetricMeasurementThresholdJob> metricMeasurementThresholdJob ;




/**  
* Field monitoredMetricClassCriterion
*/
protected MonitoredMetricClassCriterion monitoredMetricClassCriterion ;


}