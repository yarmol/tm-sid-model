/**
* Metric Monitoring ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.r.o.r.u.oH0WE.eO.iY.q.x.wU.q84N.g-content.html">Metric Monitoring ABE</a> 
* The Metric Monitoring ABE contains all entities enabling the monitorin 
* g of MetricMeasures such as MetricMeasurementJob. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_monitoring_business_entity ;

/**
* A MetricMeasurementObservation represents the contextual information o 
* f a measurement such as the observation period, the MetricMeasurementJ 
* ob used,  the requester of the observation and the scope of the observ 
* ation through the related MonitoredMetricObjectCriterion.The Monitored 
* MetricObjectCriterion related to MetricMeasurementObservation has to b 
* e equal to or a sub-set of the one related to the concerned MetricMeas 
* urementJob.A MetricMeasurementObservation also specifies the MectricMe 
* asures resulting from this observation. 
 @since SID_R16.5
*/ 

public  class MetricMeasurementObservation  {



/**  
* Field observationPeriod
* Period during wich the observation (measurements) are done. 

*/
protected TimePeriod observationPeriod ;




/**  
* Field metricMeasure
*/
protected List<MetricMeasure> metricMeasure ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field monitoredMetricObjectCriterion
*/
protected MonitoredMetricObjectCriterion monitoredMetricObjectCriterion ;




/**  
* Field metricMeasurementJob
*/
protected MetricMeasurementJob metricMeasurementJob ;


}