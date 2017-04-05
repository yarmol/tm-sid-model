/**
* Metric Job ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/__4B.bEJP.mE.eO.iIN0.e.pOQZO.g-content.html">Metric Job ABE</a> 
* The Metric Job ABE contains entities corresponding to the differnt typ 
* e of measurement jobs for Metric. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.metric_abe.metric_monitoring_abe.metric_job_business_entity ;

/**
* A MetricManagementJob is a management activity that may consist of sev 
* eral steps but is performed as a single logical unit in a Metric conte 
* xt.It can be a one-time activity or a regular one. In the latter case, 
*  a schedule definition is attached to it.A MetricMeasurementJob define 
* s a measurement job for a scope of monitored objects using the Monitor 
* edMetricObjectCriterion.  
 @since SID_R16.5
*/ 

public abstract class MetricMeasurementJob  {



/**  
* Field consumingApplicationId
* The identifier of the application that produces MetricMeasures. 

*/
protected String consumingApplicationId ;




/**  
* Field producingApplicationId
* The identifier of the application that consumes MetricMeasures. 

*/
protected String producingApplicationId ;




/**  
* Field granularity
* The sampling rate of MetricMeasure as determined when they are produce 

* d. In many cases a different granularity of an indicator will be refle 

* cted in a different indicator value (e.g. a gauge) 

*/
protected TimeGranularity granularity ;




/**  
* Field monitoredMetricObjectCriterion
*  Monitored objects are specified by the MonitoredMetricObjectCriterion 

* . 

*/
protected MonitoredMetricObjectCriterion monitoredMetricObjectCriterion ;




/**  
* Field metricDefMeasure
*/
protected List<MetricDefMeasure> metricDefMeasure ;




/**  
* Field metricDefMeasureGroup
*/
protected List<MetricDefMeasureGroup> metricDefMeasureGroup ;




/**  
* Field test
*/
protected List<Test> test ;




/**  
* Field jobId
* The ID of the management job.   

*/
protected String jobId ;




/**  
* Field creationTime
* The creation time of the management job 

*/
protected DateTime creationTime ;




/**  
* Field adminState
* The administrative state of the management job 

*/
protected AdministrativeState adminState ;




/**  
* Field jobPriority
* The priority of the management job.</br></br>The way the management ap 

* plication will use the JobPriority to schedule job execution is applic 

* ation specific and outside of the scope. 

*/
protected JobPriority jobPriority ;




/**  
* Field executionState
* The execution state of the management job.</br></br>It is used to indi 

* cate a failure in the execution of the job.  

*/
protected ExecutionState executionState ;




/**  
* Field scheduleDefinition
*/
protected List<ScheduleDefinition> scheduleDefinition ;




/**  
* Field metricmeasurementobservation
*/
protected List<MetricMeasurementObservation> metricmeasurementobservation ;


}