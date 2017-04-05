/**
* Metric Definition Measure Threshold ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.i.x.kCUN54E.eK.r.x6.vY.l-.rD.f.g-content.html">Metric Definition Measure Threshold ABE</a> 
* The Metric Definition Measure Threshold ABE contains all entities desc 
* ribing the threshold used for MetricDefMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_abe.metric_definition_measure_threshold_business_entity ;

/**
* The MetricDefMeasureThresholdRelationship enables specifying any kind  
* of relationships between MetricDefMeasureThresholdRule such as depends 
*  on, follows, and so forth. 
 @since SID_R16.5
*/ 

public  class MetricDefMeasureThresholdRelationship  {



/**  
* Field metricDefMeasureThresholdRule
*/
protected MetricDefMeasureThresholdRule metricDefMeasureThresholdRule ;




/**  
* Field metricDefMeasureThresholdRule2
*/
protected MetricDefMeasureThresholdRule metricDefMeasureThresholdRule2 ;




/**  
* Field thresholdRelationshipType
* The kind of relationship between two MetricDefMeasureThresholdRules, s 

* uch as depends on, follows, and so forth. 

*/
protected String thresholdRelationshipType ;


}