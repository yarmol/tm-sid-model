/**
* Schedule Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_R.m.u_8N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">Schedule Definition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_abe.schedule_definition_business_entity ;

/**
* The monthly schedule by days of month is used to define a schedule tha 
* t is based on specifying which days of month are requited, e.g. the10t 
* h, 20th, 30th of each month. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::RecurringScheduleDefinition" href="_R.m.wOL.t.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::RecurringScheduleDefinition</a> |- 
 <a title="SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::ScheduleDefinition" href="_R.m.v.n0N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">SID Models::Common Business Entities Domain::Calendar ABE::Schedule Definition ABE::ScheduleDefinition</a> @since SID_R16.5
*/ 

public  class MonthlyScheduleDayofMonthDefinition extends RecurringScheduleDefinition,ScheduleDefinition {



/**  
* Field daysOfMonthRecurrence
* The list of days of month when the monthly schedule definition is acti 

* ve on, e.g. 10th , 15th , 20th. 

*/
protected List<DaysOfMonth> daysOfMonthRecurrence ;


}