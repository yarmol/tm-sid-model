/**
* Metric Monitoring ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.r.o.r.u.oH0WE.eO.iY.q.x.wU.q84N.g-content.html">Metric Monitoring ABE</a> 
* The Metric Monitoring ABE contains all entities enabling the monitorin 
* g of MetricMeasures such as MetricMeasurementJob. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_monitoring_business_entity ;

/**
* A MonitoredMetricClassCriterion is a type of MonitoredMetricObjectCrit 
* erion.It defines the scope of monitored objects for which a Measuremen 
* tJob is executed.by a filter on a class through the relationship with  
* RootEntityType. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Metric ABE::Metric Monitoring ABE::MonitoredMetricObjectCriterion" href="_.r.o.r.u.uH0WE.eO.iY.q.x.wU.q84N.g-content.html">SID Models::Common Business Entities Domain::Metric ABE::Metric Monitoring ABE::MonitoredMetricObjectCriterion</a> @since SID_R16.5
*/ 

public  class MonitoredMetricClassCriterion extends MonitoredMetricObjectCriterion {



/**  
* Field objectInstanceFilter
*  A filter that can be used in conjunction with the  monitored object c 

* lass for specifying the set of instancesthat are referenced by a PM qu 

* ery. 

*/
protected Filter objectInstanceFilter ;




/**  
* Field rootEntityType
*/
protected RootEntityType rootEntityType ;




/**  
* Field metricDefMeasureThreshold
*/
protected MetricDefMeasureThresholdSet metricDefMeasureThreshold ;


}