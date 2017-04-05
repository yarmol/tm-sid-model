/**
* Capacity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_WB.e.n.kD.gGE.eGEK_B.c.w.f.w4.zQ-content.html">Capacity ABE</a> 
* A generalized ABE and specializations that provide capacity and capaci 
* ty demand for products, services, and resources. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.capacity_business_entity ;

/**
* The period of time for which Capacity or CapacityDemand applies. 
 @since SID_R16.5
*/ 

public  class ApplicableTimePeriod  {



/**  
* Field fromToDateTime
* The period of time for which the schedule is applicable.</br></br>Inst 

* ance values are mutually exclusive with daysOfWeek values. 

*/
protected TimePeriod fromToDateTime ;




/**  
* Field rangeInterval
* An indicator that specifies the inclusion or exclusion of the from and 

*  to DateTime attributes.</br></br>Possible values are "open", "closed" 

* , "closedBottom" and "closedTop". 

*/
protected String rangeInterval ;




/**  
* Field daysOfWeek
* A day or days representing when the schedule is applicable.  For examp 

* le 2, 3 represent Monday and Tuesday. 

*/
protected String daysOfWeek ;




/**  
* Field validFor
* The period of time during which the schedule is considered of interest 

*  to the business. 

*/
protected TimePeriod validFor ;




/**  
* Field capacity
*/
protected List<Capacity> capacity ;




/**  
* Field capacityDemand
*/
protected List<CapacityDemand> capacityDemand ;


}