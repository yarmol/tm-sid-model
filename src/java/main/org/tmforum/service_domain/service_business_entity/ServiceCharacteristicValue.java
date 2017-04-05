/**
* Service ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D5091860236-content.html">Service ABE</a> 
* The Service ABE contains entities that are used to represent both cust 
* omer-facing and resource-facing types of services. Entities in this AB 
* E provide different views to examine, analyze, configure, monitor and  
* repair Services of all types. Entities in this ABE are derived from Se 
* rvice Specification entities. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_business_entity ;

/**
* A ServiceCharacteristicValue object is used to define a set of attribu 
* tes, each of which can be assigned to a corresponding set of attribute 
* s in a ServiceCharacteristic object. The values of the attributes in t 
* he ServiceCharacteristicValue object describe the values of the attrib 
* utes that a corresponding ServiceCharacteristic object can take on. 
 @since SID_R16.5
*/ 

public  class ServiceCharacteristicValue  {



/**  
* Field value
* A fact that describes an entity. 

*/
protected String value ;




/**  
* Field validFor
* The period for which the characteristic value is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field service
*/
protected Service service ;




/**  
* Field serviceSpecCharacteristicValue
*/
protected ServiceSpecCharacteristicValue serviceSpecCharacteristicValue ;




/**  
* Field serviceSpecCharacteristic
*/
protected ServiceSpecCharacteristic serviceSpecCharacteristic ;




/**  
* Field productCharacteristicValue
*/
protected List<ProductCharacteristicValue> productCharacteristicValue ;




/**  
* Field resourceCharacteristicValue
*/
protected List<ResourceCharacteristicValue> resourceCharacteristicValue ;




/**  
* Field serviceCharacteristicValue
*/
protected ServiceCharacteristicValue serviceCharacteristicValue ;




/**  
* Field serviceCharacteristicValue2
*/
protected List<ServiceCharacteristicValue> serviceCharacteristicValue2 ;


}