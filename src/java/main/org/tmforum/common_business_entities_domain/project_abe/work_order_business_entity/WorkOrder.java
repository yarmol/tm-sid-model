/**
* Work Order ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF539A103B5-content.html">Work Order ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.work_order_business_entity ;

/**
* A formal signed document to authorize the usage of Products, Services, 
*  and Resources. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class WorkOrder extends BusinessInteraction {



/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field requestedDeliveryDate
* The date upon which the WorkOrder is desired to be completed. 

*/
protected DateTime requestedDeliveryDate ;




/**  
* Field possibleDeliveryDate
* The date upon which the WorkOrder may be completed. 

*/
protected DateTime possibleDeliveryDate ;




/**  
* Field workOrderItem
*/
protected List<WorkOrderItem> workOrderItem ;




/**  
* Field projectElement
*/
protected ProjectElement projectElement ;


}