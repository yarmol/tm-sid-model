/**
* Capacity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_WB.e.n.kD.gGE.eGEK_B.c.w.f.w4.zQ-content.html">Capacity ABE</a> 
* A generalized ABE and specializations that provide capacity and capaci 
* ty demand for products, services, and resources. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.capacity_business_entity ;

/**
* The amount of capacity that is planned to be consumed or has been cons 
* umed. 
 @since SID_R16.5
*/ 

public abstract class CapacityDemand  {



/**  
* Field plannedOrActualDemand
* An indicator that specifies whether the capacity demand is planned or  

* actual. 

*/
protected String plannedOrActualDemand ;




/**  
* Field capacityDemandAmount
* A value and units that define the CapacityDemand, such as 10000 ea, 10 

* B Mb.</br></br>Instance values are mutually exclusive with From and To 

*  capacityDemandAmounts and range interval. 

*/
protected Quantity capacityDemandAmount ;




/**  
* Field capacityDemandAmountFrom
* The low range value that a CapacityDemand can take on. 

*/
protected Quantity capacityDemandAmountFrom ;




/**  
* Field capacityDemandAmountTo
* The upper range value that a CapacityDemand can take on. 

*/
protected Quantity capacityDemandAmountTo ;




/**  
* Field rangeInterval
* An indicator that specifies the inclusion or exclusion of the capacity 

* DemandAmountFrom and capacityDemandAmountTo attributes.</br></br>Possi 

* ble values are "open", "closed", "closedBottom" and "closedTop". 

*/
protected String rangeInterval ;




/**  
* Field priority
* The relative importance of the CapacityDemand. 

*/
protected String priority ;




/**  
* Field capacitySchedule
*/
protected ApplicableTimePeriod capacitySchedule ;




/**  
* Field appliedCapacityDemand
*/
protected List<AppliedCapacityDemand> appliedCapacityDemand ;


}