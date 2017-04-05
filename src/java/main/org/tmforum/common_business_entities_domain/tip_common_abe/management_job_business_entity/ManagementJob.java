/**
* Management Job ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_Q.u.e.s0N.u.tE.eGD0K.rE.cT.g.u.rQ-content.html">Management Job ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.tip_common_abe.management_job_business_entity ;

/**
* A Management Job is a  management activity that may consist of several 
*  steps but is performed as a single logical unit.It can be a one time  
* activity or a regular one. In the latter case , a schedule definition  
* is attached to the management job. 
 @since SID_R16.5
*/ 

public abstract class ManagementJob  {



/**  
* Field jobId
* The ID of the management job.   

*/
protected String jobId ;




/**  
* Field creationTime
* The creation time of the management job 

*/
protected DateTime creationTime ;




/**  
* Field lastModifiedTime
* Defines the time when the management job was last modified.  

*/
protected DateTime lastModifiedTime ;




/**  
* Field adminState
* The administrative state of the management job 

*/
protected AdministrativeState adminState ;




/**  
* Field jobPriority
* The priority of the management job.</br></br>The way the management ap 

* plication will use the JobPriority to schedule job execution is applic 

* ation specific and outside of the scope. 

*/
protected JobPriority jobPriority ;




/**  
* Field executionState
* The execution state of the management job.</br></br>It is used to indi 

* cate a failure in the execution of the job.  

*/
protected ExecutionState executionState ;




/**  
* Field scheduleDefinition
* If the management job is a regular one, then it will include a schedul 

* e definition.</br></br>Not present for one-time jobs. 

*/
protected ScheduleDefinition scheduleDefinition ;




/**  
* Field protocolTransferData
* Defines the information required for a data transfer.</br></br>Based o 

* n the transport protocol value(s), the corresponding information class 

* es will be used.  

*/
protected ProtocolTransferData protocolTransferData ;


}