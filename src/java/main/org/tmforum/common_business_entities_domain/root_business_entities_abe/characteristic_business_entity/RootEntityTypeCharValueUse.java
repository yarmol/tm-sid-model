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
* A use of the CharacteristicSpecificationValue by a RootEntityType to w 
* hich additional properties (attributes) apply or override the properti 
* es of similar properties contained in CharacteristicSpecificationValue 
* . 
 @since SID_R16.5
*/ 

public  class RootEntityTypeCharValueUse  {



/**  
* Field isDefault
* Indicates if the value is the default value for a characteristic. 

*/
protected Boolean isDefault ;




/**  
* Field validFor
* The period of time for which the use of the CharacteristicSpecificatio 

* nValue is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field rootEntityTypeCharUse
*/
protected RootEntityTypeCharUse rootEntityTypeCharUse ;




/**  
* Field characteristicSpecValue
*/
protected CharacteristicSpecValue characteristicSpecValue ;




/**  
* Field rootEntityTypeCharValueUseRelationship
*/
protected List<RootEntityTypeCharValueUse> rootEntityTypeCharValueUseRelationship ;




/**  
* Field rootEntityTypeCharValueUseRelationship1
*/
protected List<RootEntityTypeCharValueUse> rootEntityTypeCharValueUseRelationship1 ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;


}