/**
* Work Order ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF539A103B5-content.html">Work Order ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.work_order_business_entity ;

/**
* The purpose for the WorkOrder expressed in terms of a ProductSpecifica 
* tion, ProductOffering, ServiceSpecification or ResourceSpecification o 
* r may refer to a Product, Service, or Resource. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteractionItem @since SID_R16.5
*/ 

public  class WorkOrderItem extends BusinessInteractionItem {



/**  
* Field projectResourceAllocation
*/
protected ProjectResourceAllocation projectResourceAllocation ;




/**  
* Field workOrder
*/
protected WorkOrder workOrder ;




/**  
* Field projectElement
*/
protected ProjectElement projectElement ;




/**  
* Field work
*/
protected Work work ;




/**  
* Field workSpecification
*/
protected WorkSpecification workSpecification ;




/**  
* Field workOrderFulfillment
*/
protected List<WorkOrderFulfillment> workOrderFulfillment ;




/**  
* Field workOrderFulfillment2
*/
protected List<WorkOrderFulfillment> workOrderFulfillment2 ;


}