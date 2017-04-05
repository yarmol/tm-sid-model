/**
* Metric Measure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V6H.b.gJM.yE.eO.bUN.v1_8.v.h8.w-content.html">Metric Measure ABE</a> 
* The Metric Measure ABE contains entities describing measures according 
*  to a MetricDefMeasure such as MetricMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_measure_business_entity ;

/**
* A MetricMeasureConsequence is the MetricDefMeasureConsequence applied  
* for a specific MetricMeasureThresholdRule. 
 @since SID_R16.5
*/ 

public  class MetricMeasureConsequence  {



/**  
* Field metricDefMeasureConsequence
*/
protected MetricDefMeasureConsequence metricDefMeasureConsequence ;




/**  
* Field metricMeasureThresholdRule
*/
protected MetricMeasureThresholdRule metricMeasureThresholdRule ;




/**  
* Field consequenceMetricNotification
*/
protected List<ConsequenceMetricNotification> consequenceMetricNotification ;


}