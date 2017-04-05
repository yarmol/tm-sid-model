/**
* Service Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D50919203C4-content.html">Service Specification ABE</a> 
* The Service Specification ABE contains entities that define the shared 
*  characteristics of both types of Service entities. This enables multi 
* ple instances to be derived from a single specification entity. In thi 
* s derivation, each instance will use the characteristics  defined in i 
* ts associated specification.Entities in this ABE focus on adherence to 
*  standards, distinguishing features of a Service, dependencies (both p 
* hysical and logical, as well as on other services), quality, and cost. 
*  In general, entities in this ABE enable Services to be bound to Produ 
* cts and run using Resources.Network services are one example of Servic 
* es that can be built. Additional examples include installation, mainte 
* nance, monitoring, and content authentication, authorization, accounti 
* ng, and auditing functions. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_business_entity ;

/**
* A ServiceSpecCharacteristicValue object is used to define a set of att 
* ributes, each of which can be assigned to a corresponding set of attri 
* butes in a ServiceSpecCharacteristic object. The values of the attribu 
* tes in the ServiceSpecCharacteristicValue object describe the values o 
* f the attributes that a corresponding ServiceSpecCharacteristic object 
*  can take on. 
 @since SID_R16.5
*/ 

public  class ServiceSpecCharacteristicValue  {



/**  
* Field valueType
* A kind of value that the characteristic can take on, such as numeric,  

* text, and so forth. 

*/
protected String valueType ;




/**  
* Field isDefault
* Indicates if the value is the default value for a characterisitc. 

*/
protected String isDefault ;




/**  
* Field value
* A discrete value that the characteristic can take on. 

*/
protected String value ;




/**  
* Field unitOfMeasure
* A length, surface, volume, dry measure, liquid measure, money, weight, 

*  time, and the like. Iin general, a determinate quantity or magnitude  

* of the kind designated, taken as a standard of comparison for others o 

* f the same kind, in assigning to them numerical values, as 1 foot, 1 y 

* ard, 1 mile, 1 square foot. 

*/
protected String unitOfMeasure ;




/**  
* Field valueFrom
* The low range value that a characteristic can take on. 

*/
protected String valueFrom ;




/**  
* Field valueTo
* The upper range value that a characteristic can take on. 

*/
protected String valueTo ;




/**  
* Field rangeInterval
* An indicator that specifies the inclusion or exclusion of the valueFro 

* m and valueTo attributes.</br></br>Possible values are "open", "closed 

* ", "closedBottom" and "closedTop".</br> 

*/
protected String rangeInterval ;




/**  
* Field validFor
* The period of time for which a value is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field serviceCharacteristicValue
*/
protected List<ServiceCharacteristicValue> serviceCharacteristicValue ;




/**  
* Field serviceSpecCharUse
*/
protected List<ServiceSpecCharUse> serviceSpecCharUse ;




/**  
* Field productSpecCharacteristicValue
*/
protected List<ProductSpecCharacteristicValue> productSpecCharacteristicValue ;




/**  
* Field resourceSpecCharacteristicValue
*/
protected List<ResourceSpecCharacteristicValue> resourceSpecCharacteristicValue ;




/**  
* Field serviceSpecCharacteristic
*/
protected ServiceSpecCharacteristic serviceSpecCharacteristic ;




/**  
* Field containsSscvList
*/
protected List<ServiceSpecCharacteristicValue> containsSscvList ;




/**  
* Field containedInSscv
*/
protected ServiceSpecCharacteristicValue containedInSscv ;


}