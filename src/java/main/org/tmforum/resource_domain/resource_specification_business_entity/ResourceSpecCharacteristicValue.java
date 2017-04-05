/**
* Resource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5CCD30232-content.html">Resource Specification ABE</a> 
* The Resource Specification ABE contains entities that define the share 
* d characteristics and behavior of each of the four types of Resource e 
* ntities. This enables multiple instances to be derived from a single s 
* pecification entity. In this derivation, each instance will use the sh 
* ared characteristics and behavior defined in its associated template. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_business_entity ;

/**
* A number or text that can be assigned to a ResourceSpecCharacteristic. 
 @since SID_R16.5
*/ 

public  class ResourceSpecCharacteristicValue  {



/**  
* Field valueType
* A kind of value that the characteristic can take on, such as numeric,  

* text, and so forth. 

*/
protected String valueType ;




/**  
* Field defaultValue
* Indicates if the value is the default value for a characterisitc. 

*/
protected String defaultValue ;




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
* Field resourceSpecCharacteristicValue
*/
protected List<ResourceSpecCharacteristicValue> resourceSpecCharacteristicValue ;




/**  
* Field resourceSpecCharacteristicValue1
*/
protected List<ResourceSpecCharacteristicValue> resourceSpecCharacteristicValue1 ;




/**  
* Field resourceCharacteristicValue
*/
protected List<ResourceCharacteristicValue> resourceCharacteristicValue ;




/**  
* Field resourceSpecCharacteristic
*/
protected ResourceSpecCharacteristic resourceSpecCharacteristic ;




/**  
* Field productSpecCharacteristicValue
*/
protected List<ProductSpecCharacteristicValue> productSpecCharacteristicValue ;




/**  
* Field serviceSpecCharacteristicValue
*/
protected List<ServiceSpecCharacteristicValue> serviceSpecCharacteristicValue ;




/**  
* Field resourceSpecCharUse
*/
protected List<ResourceSpecCharUse> resourceSpecCharUse ;


}