/**
* Performance Threshold  ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aT.i60I.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Threshold  ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_threshold__business_entity ;

/**
* A threshold base entity containing threshold rules. 
 @since SID_R16.5
*/ 

public  class PerformanceThreshold  {



/**  
* Field performanceIndicator
*/
protected List<PerformanceIndicator> performanceIndicator ;




/**  
* Field ID
* A unique identifier for the Performance Threshold. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a Performance threshold is known and  

* distinguished from other thresholds. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains in detail what the Performance threshold is. 

*/
protected String description ;




/**  
* Field measurementThresholdJob
* The Performance Threshold is evaluated by Measurement threshold jobs i 

* n various kinds of scope and time scheduling definitions. 

*/
protected List<MeasurementThresholdJob> measurementThresholdJob ;




/**  
* Field monitoredClassCriteria
* A Performance threshold is defined over a monitored objects class crit 

* eria. 

*/
protected MonitoredClassCriteria monitoredClassCriteria ;




/**  
* Field thresholdRule
* A PerformanceThreshold contains a set of Performance threshold rules o 

* f different conditions (Raise, Clear) and different severities. 

*/
protected PerformanceThresholdRule thresholdRule ;




/**  
* Field validFor
* The period of time during which the Performance threshold is applicabl 

* e. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceIndicatorSpecification
* A Performance threshold defines crossing over a Performance threshold  

* specification. By using this definition, an instance of this indicator 

*  specification will be evaluated by a threshold job. 

*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification ;




/**  
* Field performanceApplicability
*/
protected List<PerformanceApplicability> performanceApplicability ;




/**  
* Field thresholdType
* A threshold can have one of two possible types:  LogicDefinition-an ac 

* tual definition of a threshold logic, PreDefined-a pre-defined logic a 

* s agreed between a PM consumer and a PM producer. 

*/
protected ThresholdType thresholdType ;


}