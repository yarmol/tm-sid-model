/**
* Trouble or Problem ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_Q.d.lB.kP.a6E.d2F.u5.zG43E.t.pQ-content.html">Trouble or Problem ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.trouble_or_problem_business_entity ;

/**
* Describe a comment on a problem or an alarm. 
 @since SID_R16.5
*/ 

public  class Comment  {



/**  
* Field userId
* Describes the user id of the user doing the action. 

*/
protected String userId ;




/**  
* Field time
* Describes the time at which the action was done 

*/
protected DateTime time ;




/**  
* Field systemId
* Describes the system Id from which the action was done. 

*/
protected String systemId ;




/**  
* Field comment
* text of the comment 

*/
protected String comment ;


}