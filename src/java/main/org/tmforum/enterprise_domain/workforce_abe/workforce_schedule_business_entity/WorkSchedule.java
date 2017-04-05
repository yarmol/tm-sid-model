/**
* Workforce Schedule ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_UOH.aMN.mYE.eC.z9.a.o.eR.f.u.g.hA-content.html">Workforce Schedule ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_schedule_business_entity ;

import org.tmforum.common_business_entities_domain.calendar_business_entity.Calendar;
import org.tmforum.enterprise_domain.workforce_abe.workforce_resource_business_entity.WorkforceOrganizationRole;

/**
* Being a subclass of SimpleCalendar, WorkSchedule and its variants desc 
* ribes various appointment, reservation, and assignment schedules of an 
*  organization. For example, a WorkSchedule shows that a contractor tea 
* m responsible for the New York area has been receiving 100 requests fo 
* r fiber installation during July and is currently scheduled to perform 
*  80 of them. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Calendar ABE::Calendar @since SID_R16.5
*/ 

public  class WorkSchedule extends Calendar {



/**  
* Field workforceOrganizationRole
*/
protected WorkforceOrganizationRole workforceOrganizationRole ;




/**  
* Field granularity
* Represents the granularity of the timeslots in the WorkSchedule. For e 

* xample, with granularity = 2 hours, a work task that lasts 1 hour shou 

* ld take the whole two hours.</br></br>Permitted Values: Hour</br></br> 

* Notes:  This is to accommodate business rules of certain organizations 

*  about the granularity of work windows. It is to be considered with th 

* e granularity of employee pools (not introduced in this release). This 

*  attribute is optional, since there can be irregular or mixed granular 

* ity. For example, work should take 4 hours during business hours, and  

* 2 hours after business hours. 

*/
protected Integer granularity ;


}