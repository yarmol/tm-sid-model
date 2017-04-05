/**
* Metric Definition Measure Threshold ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.i.x.kCUN54E.eK.r.x6.vY.l-.rD.f.g-content.html">Metric Definition Measure Threshold ABE</a> 
* The Metric Definition Measure Threshold ABE contains all entities desc 
* ribing the threshold used for MetricDefMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_definition_measure_abe.metric_definition_measure_threshold_business_entity ;

/**
* A pre-defined threshold is a "black-box" logic that resides in the PM  
* Producing Application. A PM consuming application can execute it assig 
* ning values to its parameters. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Metric ABE::Metric Definition Measure ABE::Metric Definition Measure Threshold ABE::MetricDefMeasureThresholdRule" href="_.t6_.v5H0WE.eO.iY.q.x.wU.q84N.g-content.html">SID Models::Common Business Entities Domain::Metric ABE::Metric Definition Measure ABE::Metric Definition Measure Threshold ABE::MetricDefMeasureThresholdRule</a> @since SID_R16.5
*/ 

public  class PreDefinedMetricThresholdRule extends MetricDefMeasureThresholdRule {



/**  
* Field preDefinedMetricThresholdRuleParam
* The parameters of a pre-defined threshold. 

*/
protected List<PreDefinedMetricThresholdRuleParam> preDefinedMetricThresholdRuleParam ;




/**  
* Field derivationAlgorithm
* A step-by-step procedure used to calculate the value of the MetricMeas 

* ure. 

*/
protected String derivationAlgorithm ;


}