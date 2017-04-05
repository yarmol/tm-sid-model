/**
* Project Element ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF53744030A-content.html">Project Element ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.project_element_business_entity ;

/**
* This is an abstract entity used to hold the attributes and association 
* s common to Project, WBS Element and Activity. 
 @since SID_R16.5
*/ 

public abstract class ProjectElement  {



/**  
* Field projectElementSpec
*/
protected ProjectElementSpec projectElementSpec ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field BCWS
* budgeted cost of work scheduled 

*/
protected Money BCWS ;




/**  
* Field BCWP
* budgeted cost of work performed 

*/
protected Money BCWP ;




/**  
* Field ACWP
* actual cost of work scheduled 

*/
protected Money ACWP ;




/**  
* Field plannedDuration
* The duration expected during the planning process 

*/
protected TimePeriod plannedDuration ;




/**  
* Field actualDuration
* the duration that actually occurred 

*/
protected TimePeriod actualDuration ;




/**  
* Field currentDuration
* the latest expected duration before the actual occurrence 

*/
protected TimePeriod currentDuration ;




/**  
* Field scheduledDuration
* the duration expected during the detailed scheduling process 

*/
protected TimePeriod scheduledDuration ;




/**  
* Field lifecycleStatus
* the current status 

*/
protected String lifecycleStatus ;




/**  
* Field priority
*/
protected Integer priority ;




/**  
* Field description
* descriptive text about the ProjectElement 

*/
protected String description ;




/**  
* Field timingConstraint
*/
protected String timingConstraint ;




/**  
* Field timingConstraintDate
*/
protected Object timingConstraintDate ;




/**  
* Field projectElement
*/
protected ProjectElement projectElement ;




/**  
* Field projectElement1
*/
protected ProjectElement projectElement1 ;




/**  
* Field workOrderItem
*/
protected List<WorkOrderItem> workOrderItem ;




/**  
* Field workOrder
*/
protected List<WorkOrder> workOrder ;




/**  
* Field place
*/
protected List<Place> place ;


}