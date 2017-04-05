/**
* Schedule Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_R.m.u_8N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">Schedule Definition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_abe.schedule_definition_business_entity ;

/**
* The FixedScheduleItem  entity holds a list of specific parameters (e.g 
* . start  date & time) related to a single execution . 
 @since SID_R16.5
*/ 

public  class FixedScheduleItem  {



/**  
* Field fixedScheduleStartTime
* The date & time to start a job/activity. 

*/
protected DateTime fixedScheduleStartTime ;




/**  
* Field havingScheduledDuration
* A fixed schedule item may have a schedule duration entity associated w 

* ith it. 

*/
protected ScheduledDuration havingScheduledDuration ;


}