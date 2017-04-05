/**
* WorkSpecification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_I1020N.mZE.eC.z9.a.o.eR.f.u.g.hA-content.html">WorkSpecification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workspecification_business_entity ;

/**
* WorkSpecification describes the characteristics of a type of (manual)  
* work. The characteristic/characteristic value pattern may be applied f 
* or WorkSpecification (and work as an instance). For example, WorkSpeci 
* fication could be “Assembly of server blade in a shelf”. 
 @since SID_R16.5
*/ 

public  class WorkSpecification  {



/**  
* Field workSpecificationVersion
*/
protected List<WorkSpecificationVersion> workSpecificationVersion ;




/**  
* Field workSpecFulfillmentRate
*/
protected List<WorkSpecFulfillmentRate> workSpecFulfillmentRate ;




/**  
* Field isAppointmentRequired
* Specifies if this kind of work requires an appointment with the custom 

* er/owner to be performed at their location 

*/
protected Boolean isAppointmentRequired ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field workSpecificationType
*/
protected WorkSpecificationType workSpecificationType ;




/**  
* Field workSpecificationCost
*/
protected List<WorkSpecificationCost> workSpecificationCost ;




/**  
* Field workSpecificationRole
*/
protected List<WorkSpecificationRole> workSpecificationRole ;




/**  
* Field workOrderItem
*/
protected List<WorkOrderItem> workOrderItem ;




/**  
* Field lifeCycleStatus
* Status of the Work Specification, such as planned, approved, active, i 

* nactive 

*/
protected String lifeCycleStatus ;




/**  
* Field standardDuration
* Standard duration of time, under normal condition and assumptions, tha 

* t the work can take to be completed 

*/
protected Integer standardDuration ;




/**  
* Field standardCapacityRequired
* Standard workforce capacity (man hour, man day) under normal condition 

*  and assumptions that the work requires to be completed 

*/
protected Integer standardCapacityRequired ;




/**  
* Field skillSpecification
*/
protected List<SkillSpecification> skillSpecification ;


}