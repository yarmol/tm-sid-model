/**
* Schedule Definition ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_R.m.u_8N.u.sE.eGD0K.rE.cT.g.u.rQ-content.html">Schedule Definition ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.calendar_abe.schedule_definition_business_entity ;

/**
* The Scheduled Duration entity defines a set of parameters related to t 
* he duration of a job/activity, such as the planned base duration and p 
* ossible extensions. 
 @since SID_R16.5
*/ 

public  class ScheduledDuration  {



/**  
* Field baseDuration
* The expected duration of a job (amount & units). 

*/
protected Duration baseDuration ;




/**  
* Field extensionDuration
* The duration of the expected extensions. 

*/
protected Duration extensionDuration ;




/**  
* Field meanExtensions
* The mean number of expected extensions. 

*/
protected Integer meanExtensions ;




/**  
* Field maxExtensions
* The maximal number of expected extensions. 

*/
protected Integer maxExtensions ;


}