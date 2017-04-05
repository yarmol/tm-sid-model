/**
* Trouble or Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_Q.d.lB.kP.a6E.d2F.u5.zG43E.t.pQ-content.html">Trouble or Problem ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.trouble_or_problem_business_entity ;

/**
* Tracking records allow the tracking of modifications on the Problem. T 
* he tracking records should not be embedded in the problem to allow ret 
* rieving the problem without the tracking records.  
 @since SID_R16.5
*/ 

public  class TrackingRecord  {



/**  
* Field description
* Describes the action being done (ack,clear...) 

*/
protected String description ;




/**  
* Field systemId
* Describes the system Id from which the action was done. </br> 

*/
protected String systemId ;




/**  
* Field time
* Describes the time at which the action was done 

*/
protected DateTime time ;




/**  
* Field userId
* Describes the user id of the user doing the action. 

*/
protected String userId ;


}