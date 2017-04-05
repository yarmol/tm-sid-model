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
* A characteristic quality or distinctive feature of a ResourceSpecifica 
* tion. The characteristic can be take on a discrete value, such as colo 
* r, can take on a range of values, (for example, sensitivity of 100-240 
*  mV), or can be derived from a formula (for example, usage time (hrs)  
* = 30 - talk time *3). Certain characteristics, such as color, may be c 
* onfigured during the ordering or some other process. 
 @since SID_R16.5
*/ 

public  class ResourceSpecCharacteristic  {



/**  
* Field ID
* A unique identifier for the CharacteristicSpecification. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the CharacteristicSpecification is kn 

* own and distinguished from other CharacteristicSpecifications. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the CharacteristicSpecification. 

*/
protected String description ;




/**  
* Field unique
* An indicator that specifies if a value is unique for the specification 

* .</br></br>Possible values are; "unique while value is in effect" and  

* "unique whether value is in effect or not"</br> 

*/
protected String unique ;




/**  
* Field valueType
* A kind of value that the characteristic can take on, such as numeric,  

* text, and so forth. 

*/
protected String valueType ;




/**  
* Field minCardinality
* The minimum number of instances a CharacteristicValue can take on. For 

*  example, zero to five phone numbers in a group calling plan, where ze 

* ro is the value for the minCardinality. 

*/
protected Integer minCardinality ;




/**  
* Field maxCardinality
* The maximum number of instances a CharacteristicValue can take on. For 

*  example, zero to five phone numbers in a group calling plan, where fi 

* ve is the value for the maxCardinality. 

*/
protected Integer maxCardinality ;




/**  
* Field extensible
* An indicator that specifies that the values for the characteristic can 

*  be extended by adding new values when instantiating a characteristic  

* for an Entity. 

*/
protected Boolean extensible ;




/**  
* Field derivationFormula
* A rule or principle represented in symbols, numbers, or letters, often 

*  in the form of an equation used to derive the value of a characterist 

* ic value.</br></br> 

*/
protected String derivationFormula ;




/**  
* Field validFor
* The period of time for which a characteristic is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field resourceSpecCharacteristicValue
*/
protected List<ResourceSpecCharacteristicValue> resourceSpecCharacteristicValue ;




/**  
* Field resourceSpecCharacteristic
*/
protected List<ResourceSpecCharacteristic> resourceSpecCharacteristic ;




/**  
* Field resourceSpecCharacteristic1
*/
protected List<ResourceSpecCharacteristic> resourceSpecCharacteristic1 ;




/**  
* Field productSpecCharacteristic
*/
protected List<ProductSpecCharacteristic> productSpecCharacteristic ;




/**  
* Field resourceCharacteristicValue
*/
protected List<ResourceCharacteristicValue> resourceCharacteristicValue ;




/**  
* Field serviceSpecCharacteristic
*/
protected List<ServiceSpecCharacteristic> serviceSpecCharacteristic ;




/**  
* Field resourceSpecification
*/
protected List<ResourceSpecification> resourceSpecification ;


}