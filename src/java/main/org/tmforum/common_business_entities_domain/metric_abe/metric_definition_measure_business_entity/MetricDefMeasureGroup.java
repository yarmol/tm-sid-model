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
* A MetricDefMeasureGroup is a set of MetricDefMeasures, usually reporte 
* d in the same message by the equipment or the EMS. 
 @since SID_R16.5
*/ 

public  class MetricDefMeasureGroup  {



/**  
* Field name
* A word, term, or phrase by which a MetricDefMeasureGroup is known and  

* distinguished from other MetricDefMeasureGroup. 

*/
protected String name ;




/**  
* Field metricDefMeasure
*/
protected List<MetricDefMeasure> metricDefMeasure ;




/**  
* Field metricMeasureGroup
*/
protected List<MetricMeasureGroup> metricMeasureGroup ;




/**  
* Field metricMeasurementJob
*/
protected List<MetricMeasurementJob> metricMeasurementJob ;


}