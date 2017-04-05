/**
* Capacity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_WB.e.n.kD.gGE.eGEK_B.c.w.f.w4.zQ-content.html">Capacity ABE</a> 
* A generalized ABE and specializations that provide capacity and capaci 
* ty demand for products, services, and resources. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.capacity_business_entity ;

/**
* The amount of CapcityDemand applied to a CapacityAmount. 
 @since SID_R16.5
*/ 

public  class AppliedCapacityDemand  {



/**  
* Field appliedDemandAmount
* An amount of demand applied to a CapacityAmount.</br></br>Note that th 

* is is a composite attribute defined by CapacityAmount. 

*/
protected CapacityAmount appliedDemandAmount ;




/**  
* Field capacityAmount
*/
protected CapacityAmount capacityAmount ;




/**  
* Field capacityDemand
*/
protected CapacityDemand capacityDemand ;


}