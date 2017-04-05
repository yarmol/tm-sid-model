/**
* Characteristic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E94462ADB002F3-content.html">Characteristic ABE</a> 
* A pattern (the content of the ABE) enables attributes unique to a type 
*  of entity to be created via its association to EntitySpecification an 
* d enables attributes unique to a certain entity to be created via its  
* association to RootEntityType.  A RootEntityType is an entity in the S 
* ID.  For example, characteristics could be defined for entities (insta 
* nces of RootEntityType) such as Product, Customer, and ProductSpecific 
* ation that apply to all instances of those entities.   
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.characteristic_business_entity ;

/**
* A quality or distinctive feature that defines an entity. The character 
* istic can be take on a discrete value, such as color, can take on a ra 
* nge of values, (for example, sensitivity of 100-240 mV), or can be der 
* ived from a formula (for example, usage time (hrs) = 30 - talk time *3 
* ). 
 @since SID_R16.5
*/ 

public  class CharacteristicSpecification  {



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

* ic value. 

*/
protected String derivationFormula ;




/**  
* Field validFor
* The period of time for which a CharacteristicSpecification is applicab 

* le. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceSpecification
*/
protected List<PerformanceSpecification> performanceSpecification ;




/**  
* Field characteristicSpecValue
*/
protected List<CharacteristicSpecValue> characteristicSpecValue ;




/**  
* Field characteristicSpecification
*/
protected List<CharacteristicSpecification> characteristicSpecification ;




/**  
* Field characteristicSpecification1
*/
protected List<CharacteristicSpecification> characteristicSpecification1 ;




/**  
* Field performanceCharacteristicValue
*/
protected List<PerformanceCharacteristicValue> performanceCharacteristicValue ;




/**  
* Field performanceCatCharacteristicValue
*/
protected List<PerformanceCatCharacteristicValue> performanceCatCharacteristicValue ;




/**  
* Field performanceCatSpecification
*/
protected List<PerformanceCatSpecification> performanceCatSpecification ;




/**  
* Field performanceIndicatorDerivationParameter
*/
protected List<PerformanceIndicatorDerivationParameter> performanceIndicatorDerivationParameter ;




/**  
* Field matrixSpecDimension
*/
protected List<MatrixSpecDimension> matrixSpecDimension ;




/**  
* Field rootEntityTypeCharUse
*/
protected List<RootEntityTypeCharUse> rootEntityTypeCharUse ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;


}