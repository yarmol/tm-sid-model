/**
* Alarm Severity Assignment Profile ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.uVV.r.oE.mWE.eCN.m.p.x.w.x3LZL.g-content.html">Alarm Severity Assignment Profile ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_severity_assignment_profile_business_entity ;

/**
* The assigned severity is allocated to a probable cause using the alarm 
*  severity assignment profile. The identified probable cause should be  
* raised with the assigned severity. The assignment of severities is ext 
* ended beyond PerceivedSeverity to cover the case where:- no alarm shou 
* ld be raised: "NOT_ALARMED" - the target OS/NE is free to make a choic 
* e based upon its local criteria: "FREE_CHOICE". 
 @since SID_R16.5
*/ 

public  enum AssignedSeverity  {



/**  
* Field CRITICAL
*/
 CRITICAL ,




/**  
* Field FREE_CHOICE
*/
 FREE_CHOICE ,




/**  
* Field INDETERMINATE
*/
 INDETERMINATE ,




/**  
* Field MAJOR
*/
 MAJOR ,




/**  
* Field MINOR
*/
 MINOR ,




/**  
* Field NOT_ALARMED
*/
 NOT_ALARMED ,




/**  
* Field WARNING
*/
 WARNING ,


}