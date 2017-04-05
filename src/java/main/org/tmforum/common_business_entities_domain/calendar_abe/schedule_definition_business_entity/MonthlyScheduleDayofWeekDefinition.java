/**
* Schedule Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_R.m.u_8N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">Schedule Definition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_abe.schedule_definition_business_entity ;

/**
* The monthly schedule by days of week is used to define a monthly sched 
* ule  based on the sequnce of day in a month by specifying its instance 
* , e.g. the 1st Monday of the month. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::RecurringScheduleDefinition" href="_R.m.wOL.t.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::RecurringScheduleDefinition</a> |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::ScheduleDefinition" href="_R.m.v.n0N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::ScheduleDefinition</a> @since SID_R16.5
*/ 

public  class MonthlyScheduleDayofWeekDefinition extends RecurringScheduleDefinition,ScheduleDefinition {



/**  
* Field daysOfWeek
* The list of days of week when the monthly schedule definition is activ 

* e on, e.g. Monday, Tuesday, etc. This works with the weekly instance ( 

* 1-5, last) as sprecified in the monthlyDaysOfWeekInstance attribute. F 

* or example: the 2nd Monday in a month. 

*/
protected List<DaysOfWeek> daysOfWeek ;




/**  
* Field monthlyDaysOfWeekInstance
* The instance of a selected day in the monthly schedule definition, 1-5 

*  or "last" instance. For example: the 2nd Monday in a month.This works 

*  in conjunction with the daysOfWeek attribute Permitted Values:</br>1- 

* 4, last</br> 

*/
protected String monthlyDaysOfWeekInstance ;


}