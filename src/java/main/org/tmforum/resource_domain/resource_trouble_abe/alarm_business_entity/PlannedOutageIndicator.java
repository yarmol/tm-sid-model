/**
* Alarm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.e.c.f7AAIWE.eC.gR.b9X.b.l.f.oNQ-content.html">Alarm ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_business_entity ;

/**
* This datatype indicates that the Managed Object (related to the alarm) 
*  is in planned outage (out-of-service or in planned maintenance). This 
*  might also be used when an equipment is being commissioned to avoid t 
* he alarms propagating to other systems. 
 @since SID_R16.5
*/ 

public  enum PlannedOutageIndicator  {



/**  
* Field IN_SERVICE
*/
 IN_SERVICE ,




/**  
* Field OUT_OF_SERVICE
*/
 OUT_OF_SERVICE ,


}