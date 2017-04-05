/**
* Capacity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_WB.e.n.kD.gGE.eGEK_B.c.w.f.w4.zQ-content.html">Capacity ABE</a> 
* A generalized ABE and specializations that provide capacity and capaci 
* ty demand for products, services, and resources. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.capacity_business_entity ;

/**
* Specific ability of an entity measured in quantity and units of quanti 
* ty over an extended period. 
 @since SID_R16.5
*/ 

public abstract class Capacity  {



/**  
* Field plannedOrActualCapacity
* An indicator that specifies whether the capacity is planned or actual. 

*/
protected String plannedOrActualCapacity ;




/**  
* Field capacitySchedule
*/
protected ApplicableTimePeriod capacitySchedule ;




/**  
* Field availableCapacityAmount
*/
protected List<CapacityAmount> availableCapacityAmount ;




/**  
* Field geographicPlace
*/
protected List<GeographicPlace> geographicPlace ;


}