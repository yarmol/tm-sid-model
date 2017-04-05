/**
* Metric Measure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_V6H.b.gJM.yE.eO.bUN.v1_8.v.h8.w-content.html">Metric Measure ABE</a> 
* The Metric Measure ABE contains entities describing measures according 
*  to a MetricDefMeasure such as MetricMeasure. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_measure_business_entity ;

/**
* A MetricMeasureGroup is a set of MetricMeasures, usually reported in t 
* he same message by the equipment or the EMS. 
 @since SID_R16.5
*/ 

public  class MetricMeasureGroup  {



/**  
* Field name
* A word, term, or phrase by which a MetricMeasureGroup is known and dis 

* tinguished from other MetricMeasureGroup. 

*/
protected String name ;




/**  
* Field measureDateTime
* Specifies the date and time of the MetricMeasureGroup. 

*/
protected dateTimeMsec measureDateTime ;




/**  
* Field metricMeasure
*/
protected List<MetricMeasure> metricMeasure ;




/**  
* Field metricDefMeasureGroup
*/
protected MetricDefMeasureGroup metricDefMeasureGroup ;


}