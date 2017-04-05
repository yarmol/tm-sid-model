/**
* Metric Measure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V6H.b.gJM.yE.eO.bUN.v1_8.v.h8.w-content.html">Metric Measure ABE</a> 
* The Metric Measure ABE contains entities describing measures according 
*  to a MetricDefMeasure such as MetricMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_measure_business_entity ;

/**
* A numerical value or text determined for a MetricDefMeasure that may b 
* e collected for a RootEntity, such as a connection or a dealer.A Metri 
* cMeasure might be part of a group of MetricMeasures realized at a spec 
* ific moment (MetricMeasureGroup).For example, a value of .005 ms that  
* represents average packet delay. 
 @since SID_R16.5
*/ 

public  class MetricMeasure  {



/**  
* Field rootEntity
*/
protected RootEntity rootEntity ;




/**  
* Field value
* A discrete value determined for the Metric.</br>. 

*/
protected String value ;




/**  
* Field metricDefinitionDeterminationMethod
*/
protected List<MetricDefinitionDeterminationMethod> metricDefinitionDeterminationMethod ;




/**  
* Field metricMeasureThreshold
*/
protected List<MetricMeasureThresholdRule> metricMeasureThreshold ;




/**  
* Field metricMeasureGroup
*/
protected MetricMeasureGroup metricMeasureGroup ;




/**  
* Field metricDefMeasure
*/
protected MetricDefMeasure metricDefMeasure ;




/**  
* Field metricMeasurementObservation
*/
protected MetricMeasurementObservation metricMeasurementObservation ;


}