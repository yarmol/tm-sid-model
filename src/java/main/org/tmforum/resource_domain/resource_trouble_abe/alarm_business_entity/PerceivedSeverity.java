/**
* Alarm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.e.c.f7AAIWE.eC.gR.b9X.b.l.f.oNQ-content.html">Alarm ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_business_entity ;

/**
* This datatype lists the possible severities that can be allocated to a 
*  Alarm. The values are consistent with ITU-T Recommendation X.733. Thi 
* s specification does not recommend the use of indeterminate. 
 @since SID_R16.5
*/ 

public  enum PerceivedSeverity  {



/**  
* Field CLEARED
*/
 CLEARED ,




/**  
* Field CRITICAL
*/
 CRITICAL ,




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
* Field WARNING
*/
 WARNING ,


}