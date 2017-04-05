/**
* Management Job ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_Q.u.e.s0N.u.tE.eGD0K.rE.cT.g.u.rQ-content.html">Management Job ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.tip_common_abe.management_job_business_entity ;

/**
* Defines the execution states of a management job.  It is possible for  
* an application to support only a subset of the values. 
 @since SID_R16.5
*/ 

public  enum ExecutionState  {



/**  
* Field EXECUTING
*/
 EXECUTING ,




/**  
* Field EXECUTINGACTIVE
*/
 EXECUTINGACTIVE ,




/**  
* Field EXECUTINGIDLE
*/
 EXECUTINGIDLE ,




/**  
* Field FAILED
*/
 FAILED ,




/**  
* Field SCHEDULED
*/
 SCHEDULED ,




/**  
* Field SUSPENDED
*/
 SUSPENDED ,


}