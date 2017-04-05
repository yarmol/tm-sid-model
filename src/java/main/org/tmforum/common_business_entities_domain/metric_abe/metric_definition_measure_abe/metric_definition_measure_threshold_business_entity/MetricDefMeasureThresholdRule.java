/**
* Metric Definition Measure Threshold ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.i.x.kCUN54E.eK.r.x6.vY.l-.rD.f.g-content.html">Metric Definition Measure Threshold ABE</a> 
* The Metric Definition Measure Threshold ABE contains all entities desc 
* ribing the threshold used for MetricDefMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_abe.metric_definition_measure_threshold_business_entity ;

/**
* A MetricDefMeasureThresholdRule is a rule that defines the condition ( 
* raise or clear) to achieve to apply consequences when a threshold (Met 
* ricDefMeasureThreshold) is crossed or ceased to be crossed. It also de 
* fines the severity of the raise or clear of the threshold. 
 @since SID_R16.5
*/ 

public abstract class MetricDefMeasureThresholdRule  {



/**  
* Field thresholdRuleSeverity
* A threshold can be generated in different severity levels. A crossing  

* for each level may require a different condition and possibly trigger  

* a different consequence.  

*/
protected MetricPerceivedSeverity thresholdRuleSeverity ;




/**  
* Field metricDefMeasureConsequence
*/
protected List<MetricDefMeasureConsequence> metricDefMeasureConsequence ;




/**  
* Field metricDefMeasureThreshold
*/
protected MetricDefMeasureThresholdSet metricDefMeasureThreshold ;




/**  
* Field metricMeasureThreshold
*/
protected List<MetricMeasureThresholdRule> metricMeasureThreshold ;




/**  
* Field name
* Name for the MetricDefMeasureThresholdRule . 

*/
protected String name ;




/**  
* Field description
* Description for the MetricDefMeasureThresholdRule . 

*/
protected String description ;




/**  
* Field metricApplicability
*/
protected List<MetricDefMeasureApplicability> metricApplicability ;




/**  
* Field metricDefMeasureExpression
*/
protected List<MetricDefMeasureExpression> metricDefMeasureExpression ;




/**  
* Field metricDefMeasureThresholdRelationship
*/
protected List<MetricDefMeasureThresholdRelationship> metricDefMeasureThresholdRelationship ;




/**  
* Field metricDefMeasureThresholdRelationship2
*/
protected List<MetricDefMeasureThresholdRelationship> metricDefMeasureThresholdRelationship2 ;




/**  
* Field metricDefMeasureThreshConsDependency
*/
protected List<MetricDefMeasureThreshConsDependency> metricDefMeasureThreshConsDependency ;




/**  
* Field metricDefMeasureThresholdConsequence
*/
protected MetricDefMeasureThresholdConsequence metricDefMeasureThresholdConsequence ;




/**  
* Field metricDefMeasureConsequence
*/
protected List<MetricDefMeasureConsequence> metricDefMeasureConsequence ;




/**  
* Field metricDefMeasureConsequence2
*/
protected MetricDefMeasureConsequence metricDefMeasureConsequence2 ;


}