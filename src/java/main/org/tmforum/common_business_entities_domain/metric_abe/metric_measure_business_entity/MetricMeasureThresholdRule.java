/**
* Metric Measure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V6H.b.gJM.yE.eO.bUN.v1_8.v.h8.w-content.html">Metric Measure ABE</a> 
* The Metric Measure ABE contains entities describing measures according 
*  to a MetricDefMeasure such as MetricMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_measure_business_entity ;

/**
* A MetricMeasureThresholdRule specifies the MetricDefMeasureThresholdRu 
* le whose threshold has been crossed by a MetricMeasure.It triggers one 
*  or more MetricMeasureConsequences.For example, the prescribed action  
* (prescribedAction attribute) by a consequence might be to monitor the  
* MetricMeasure more closely or to notify a specific person. 
 @since SID_R16.5
*/ 

public  class MetricMeasureThresholdRule  {



/**  
* Field metricDefMeasureThreshold
*/
protected MetricDefMeasureThresholdRule metricDefMeasureThreshold ;




/**  
* Field metricMeasure
*/
protected MetricMeasure metricMeasure ;




/**  
* Field metricMeasureConsequence
*/
protected List<MetricMeasureConsequence> metricMeasureConsequence ;


}