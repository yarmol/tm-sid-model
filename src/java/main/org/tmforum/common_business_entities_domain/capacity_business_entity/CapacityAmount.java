/**
* Capacity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_WB.e.n.kD.gGE.eGEK_B.c.w.f.w4.zQ-content.html">Capacity ABE</a> 
* A generalized ABE and specializations that provide capacity and capaci 
* ty demand for products, services, and resources. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.capacity_business_entity ;

/**
* A quantity that defines the Capacity. 
 @since SID_R16.5
*/ 

public  class CapacityAmount  {



/**  
* Field capacityAmount
* A value and units that define the CapacityAmount, such as 10000 ea, 10 

* B Mb.</br></br>Instance values are mutually exclusive with From and To 

*  capacityAmounts and range interval. 

*/
protected Quantity capacityAmount ;




/**  
* Field capacityAmountFrom
* The low range value that a CapacityAmount can take on. 

*/
protected Quantity capacityAmountFrom ;




/**  
* Field capacityAmountTo
* The upper range value that a CapacityAmount can take on. 

*/
protected Quantity capacityAmountTo ;




/**  
* Field rangeInterval
* An indicator that specifies the inclusion or exclusion of the capacity 

* AmountFrom and capacityAmountTo attributes.</br></br>Possible values a 

* re "open", "closed", "closedBottom" and "closedTop". 

*/
protected String rangeInterval ;




/**  
* Field availableCapacity
*/
protected Capacity availableCapacity ;




/**  
* Field appliedCapacityDemand
*/
protected List<AppliedCapacityDemand> appliedCapacityDemand ;


}