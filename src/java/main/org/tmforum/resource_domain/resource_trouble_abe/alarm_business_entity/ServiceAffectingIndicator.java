/**
* Alarm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.e.c.f7AAIWE.eC.gR.b9X.b.l.f.oNQ-content.html">Alarm ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_trouble_abe.alarm_business_entity ;

/**
* This datatype provides the alarm-owning system determination of whethe 
* r or not the alarm affects service.  The possible values for this attr 
* ibute are: service affecting, not service affecting, unknown as to whe 
* ther it is service affecting. 
 @since SID_R16.5
*/ 

public  enum ServiceAffectingIndicator  {



/**  
* Field NOT_SERVICE_AFFECTING
*/
 NOT_SERVICE_AFFECTING ,




/**  
* Field SERVICE_AFFECTING
*/
 SERVICE_AFFECTING ,




/**  
* Field UNKNOWN
*/
 UNKNOWN ,


}