/**
* Schedule Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_R.m.u_8N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">Schedule Definition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_abe.schedule_definition_business_entity ;

/**
* The RecurringScheduleDefinition entity holds the parameters related to 
*  a schedule that defines recurrent executions. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::ScheduleDefinition" href="_R.m.v.n0N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::ScheduleDefinition</a> @since SID_R16.5
*/ 

public abstract class RecurringScheduleDefinition extends ScheduleDefinition {



/**  
* Field scheduleDefinitionExcludedDates
* A list of specific dates that should be excluded from the Schedule Def 

* inition.  

*/
protected ScheduleDefinitionExcludedDates scheduleDefinitionExcludedDates ;




/**  
* Field scheduled Activation
*/
protected ScheduledDuration scheduled Activation ;




/**  
* Field scheduleDefinitionStartTime
* The Start time of the Schedule Definition. If the attribute is empty t 

* he Schedule will be active immediately. 

*/
protected DateTime scheduleDefinitionStartTime ;




/**  
* Field scheduleDefinitionEndTime
* The Endtime of the Schedule Definition. If the attribute is empty the  

* Schedule run forever, not having a time constraint. 

*/
protected DateTime scheduleDefinitionEndTime ;




/**  
* Field scheduleDefinitionHoursRange
* A list of time ranges within a specific day that the schedule will be  

* active on, for example 08:00-12:00, 16:00-19:00. 

*/
protected TimePeriod scheduleDefinitionHoursRange ;




/**  
* Field recurringFrequency
* A recurring frequency to run a job within day that is included in sche 

* dule definition, for example: every 5 minutes, 15 minuute, 30 minutes, 

*  1 hour. 

*/
protected RecurrentInterval recurringFrequency ;




/**  
* Field ScheduleStartOffset
* This is an offeset relating  to the recurring interval. For example, i 

* f the recurring interval is 1 hour and the offset is 10 minutes, a job 

*  will be executed at 1:10, 2:10, 3:10, etc. 

*/
protected Duration ScheduleStartOffset ;


}