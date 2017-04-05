/**
* Metric Definition Measure Threshold ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.i.x.kCUN54E.eK.r.x6.vY.l-.rD.f.g-content.html">Metric Definition Measure Threshold ABE</a> 
* The Metric Definition Measure Threshold ABE contains all entities desc 
* ribing the threshold used for MetricDefMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_abe.metric_definition_measure_threshold_business_entity ;

/**
* A dependency a MetricDefMeasureConsequence has on a MetricDefMeasureTh 
* resholdRule. 
 @since SID_R16.5
*/ 

public  class MetricDefMeasureThreshConsDependency  {



/**  
* Field metricDefMeasureThresholdRule
*/
protected MetricDefMeasureThresholdRule metricDefMeasureThresholdRule ;




/**  
* Field metricDefMeasureConsequence
*/
protected MetricDefMeasureConsequence metricDefMeasureConsequence ;




/**  
* Field typeDependency
* The kind of dependency that exists between the MetricDefMeasureThresho 

* ldRule and the MetricDefMeasureConsequence. For example, "the conseque 

* nce is triggered only if the rule has been applied previously", or "if 

*  the rule has already been applied then do not trigger the consequence 

* ". 

*/
protected String typeDependency ;


}