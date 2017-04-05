/**
* Schedule Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_R.m.u_8N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">Schedule Definition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_abe.schedule_definition_business_entity ;

import org.tmforum.common_business_entities_domain.metric_abe.metric_monitoring_abe.metric_job_business_entity.MetricMeasurementJob;

import java.util.List;

/**
* The Schedule Definition base Entity holds the required parameters for  
* the definition of a schedule that will be attached to jobs. 
 @since SID_R16.5
*/ 

public abstract class ScheduleDefinition  {



/**  
* Field metricMeasurementJob
*/
protected List<MetricMeasurementJob> metricMeasurementJob ;


}