/**
* Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D69320232-content.html">Performance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_business_entity ;

/**
* A measure of the manner in which a Service and/or Resource is function 
* ing. 
 @since SID_R16.5
*/ 

public abstract class Performance  {



/**  
* Field intervalTime
* The increment of time (including date) for which the associated Perfor 

* manceIndicators were calculated/determined. 

*/
protected DateTime intervalTime ;




/**  
* Field performanceIndicator
*/
protected List<PerformanceIndicator> performanceIndicator ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field performanceSpecification
*/
protected PerformanceSpecification performanceSpecification ;




/**  
* Field performanceCharacteristicValue
*/
protected List<PerformanceCharacteristicValue> performanceCharacteristicValue ;




/**  
* Field performanceNetworkAddress
*/
protected List<PerformanceNetworkAddress> performanceNetworkAddress ;




/**  
* Field performance
*/
protected List<Performance> performance ;




/**  
* Field performance1
*/
protected List<Performance> performance1 ;




/**  
* Field performanceSpecificationInterval
*/
protected List<PerformanceSpecificationInterval> performanceSpecificationInterval ;




/**  
* Field performanceCategory
*/
protected List<PerformanceCategory> performanceCategory ;




/**  
* Field resource
*/
protected List<Resource> resource ;


}