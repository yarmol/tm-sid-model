/**
* Metric Monitoring ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.r.o.r.u.oH0WE.eO.iY.q.x.wU.q84N.g-content.html">Metric Monitoring ABE</a> 
* The Metric Monitoring ABE contains all entities enabling the monitorin 
* g of MetricMeasures such as MetricMeasurementJob. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_monitoring_business_entity ;

/**
* A MonitoredMetricObjectCriterion defines the scope of monitored object 
* s for which a MeasurementJob is executed.The scope is either defined:• 
* &nbsp;&nbsp;&nbsp;&nbsp;by a filter on a Class (sub-class MonitoredMet 
* ricClassCriterion) •&nbsp;&nbsp;&nbsp;&nbsp;or by a list of instances  
* (sub-class MonitoredMetricInstanceCriterion). 
 @since SID_R16.5
*/ 

public abstract class MonitoredMetricObjectCriterion  {



/**  
* Field metricMeasurementJob
*/
protected List<MetricMeasurementJob> metricMeasurementJob ;




/**  
* Field metricMeasurementObservation
*/
protected List<MetricMeasurementObservation> metricMeasurementObservation ;


}