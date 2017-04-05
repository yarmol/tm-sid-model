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
* A number or text that can be assigned to a CharacteristicSpecification 
* . 
 @since SID_R16.5
*/ 

public  class CharacteristicSpecValue  {



/**  
* Field valueType
* A kind of value that the characteristic can take on, such as numeric,  

* text, and so forth. 

*/
protected String valueType ;




/**  
* Field isDefault
* Indicates if the value is the default value for a characteristic. 

*/
protected Boolean isDefault ;




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
* Field characteristicSpecification
*/
protected CharacteristicSpecification characteristicSpecification ;




/**  
* Field characteristicSpecValue
*/
protected List<CharacteristicSpecValue> characteristicSpecValue ;




/**  
* Field characteristicSpecValue1
*/
protected List<CharacteristicSpecValue> characteristicSpecValue1 ;




/**  
* Field performanceCharacteristicValue
*/
protected List<PerformanceCharacteristicValue> performanceCharacteristicValue ;




/**  
* Field performanceCatSpecification
*/
protected List<PerformanceCatSpecification> performanceCatSpecification ;




/**  
* Field performanceSpecification
*/
protected List<PerformanceSpecification> performanceSpecification ;




/**  
* Field entitySpecCharValueUse
*/
protected List<EntitySpecCharValueUse> entitySpecCharValueUse ;




/**  
* Field rootEntityTypeCharValueUse
*/
protected List<RootEntityTypeCharValueUse> rootEntityTypeCharValueUse ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;


}