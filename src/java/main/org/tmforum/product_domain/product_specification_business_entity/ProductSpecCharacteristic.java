/**
* Product Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA5302C4-content.html">Product Specification ABE</a> 
* The Product Specification ABE contains all what represent a product sp 
* ecification as perceived by the business user and specifies what the m 
* arketing operator wants to sell at a functional level (i.e. what are t 
* he capacities, which usages are available…). 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_specification_business_entity ;

/**
* A characteristic quality or distinctive feature of a ProductSpecificat 
* ion. The characteristic can be take on a discrete value, such as color 
* , can take on a range of values, (for example, sensitivity of 100-240  
* mV), or can be derived from a formula (for example, usage time (hrs) = 
*  30 - talk time *3). Certain characteristics, such as color, may be co 
* nfigured during the ordering or some other process. 
 @since SID_R16.5
*/ 

public  class ProductSpecCharacteristic  {



/**  
* Field resourceSpecCharacteristic
*/
protected List<ResourceSpecCharacteristic> resourceSpecCharacteristic ;




/**  
* Field serviceSpecCharacteristic
*/
protected List<ServiceSpecCharacteristic> serviceSpecCharacteristic ;




/**  
* Field ID
* A unique identifier for the ProductSpecCharacteristic. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the characteristic is known and disti 

* nguished from characteristics. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the characteristic. 

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
* Field productSpecCharacteristicValue
*/
protected List<ProductSpecCharacteristicValue> productSpecCharacteristicValue ;




/**  
* Field productSpecification
*/
protected List<ProductSpecification> productSpecification ;




/**  
* Field productSpecCharacteristic
*/
protected List<ProductSpecCharacteristic> productSpecCharacteristic ;




/**  
* Field productSpecCharacteristic1
*/
protected List<ProductSpecCharacteristic> productSpecCharacteristic1 ;




/**  
* Field productCharacteristicValue
*/
protected List<ProductCharacteristicValue> productCharacteristicValue ;




/**  
* Field pricingLogicAlgorithmSpec
*/
protected List<PricingLogicAlgorithmSpec> pricingLogicAlgorithmSpec ;




/**  
* Field matrixSpecDimension
*/
protected List<MatrixSpecDimension> matrixSpecDimension ;


}