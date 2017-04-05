/**
* Schedule Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_R.m.u_8N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">Schedule Definition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_abe.schedule_definition_business_entity ;

/**
* The weekly schedule is used to define a schedule that is based on the  
* days of the week, e.g. a schedule that will be active only on Monday,  
* Tuesday. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::RecurringScheduleDefinition" href="_R.m.wOL.t.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::RecurringScheduleDefinition</a> |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::ScheduleDefinition" href="_R.m.v.n0N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::ScheduleDefinition</a> @since SID_R16.5
*/ 

public  class WeeklyScheduleDefinition extends RecurringScheduleDefinition,ScheduleDefinition {



/**  
* Field daysOfWeekRecurrence
* The list of days of week when the weekly schedule definition is active 

*  on: e.g. Monday, Tuesday, Wednesday. 

*/
protected List<DaysOfWeek> daysOfWeekRecurrence ;


}