/**
* Work ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_A.x.hCIN.mZE.eC.z9.a.o.eR.f.u.g.hA-content.html">Work ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workforce_resource_abe.work_business_entity ;

/**
* The Work entity is used to record actual executed work, i.e. an instan 
* ce of that entity is created for the actual work described by the Work 
* Specification. If there are characteristics defined for the WorkSpecif 
* ication, the work instance has a distinct value assigned for those cha 
* racteristics. Instances of Work are associated to the WorkOrderItem. T 
* he quantity attribute can be used if the same work has been done more  
* than once identically (based on the similar attribute in WorkOrderItem 
* ). 
 @since SID_R16.5
*/ 

public  class Work  {



/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field workRole
*/
protected List<WorkRole> workRole ;




/**  
* Field workforceEmployeeAssignment
*/
protected List<WorkforceEmployeeAssignment> workforceEmployeeAssignment ;




/**  
* Field workforceEmployeeReservation
*/
protected List<WorkforceEmployeeReservation> workforceEmployeeReservation ;




/**  
* Field workforceResourceAssignment
*/
protected List<WorkforceResourceAssignment> workforceResourceAssignment ;




/**  
* Field workforceResourceReservation
*/
protected List<WorkforceResourceReservation> workforceResourceReservation ;




/**  
* Field workOrderItem
*/
protected List<WorkOrderItem> workOrderItem ;




/**  
* Field quantity
* Represents how many times the same work task has been done identically 

* .</br></br>Notes: Default is 1 

*/
protected Quantity quantity ;




/**  
* Field appointment
*/
protected Appointment appointment ;


}