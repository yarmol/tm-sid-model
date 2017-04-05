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
* This is an abstract base class that represents the key features of thi 
* s ServiceSpecification. For example, bandwidth is characteristic of ma 
* ny different types of services; if bandwidth is important (e.g., from  
* the point-of-view of a Customer obtaining this Service via a Product)  
* then bandwidth would be a ServiceSpecCharacteristic for that particula 
* r Service. 
 @since SID_R16.5
*/ 

public  class ServiceSpecCharacteristic  {



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
* Field serviceCharacteristicValue
*/
protected List<ServiceCharacteristicValue> serviceCharacteristicValue ;




/**  
* Field containedBySscRefList
*/
protected List<ServiceSpecCharacteristic> containedBySscRefList ;




/**  
* Field containsSscRefList
*/
protected List<ServiceSpecCharacteristic> containsSscRefList ;




/**  
* Field productSpecCharacteristic
*/
protected List<ProductSpecCharacteristic> productSpecCharacteristic ;




/**  
* Field resourceSpecCharacteristic
*/
protected List<ResourceSpecCharacteristic> resourceSpecCharacteristic ;




/**  
* Field serviceSpecCharacteristicValue
*/
protected List<ServiceSpecCharacteristicValue> serviceSpecCharacteristicValue ;




/**  
* Field serviceSpecification
*/
protected List<ServiceSpecification> serviceSpecification ;


}