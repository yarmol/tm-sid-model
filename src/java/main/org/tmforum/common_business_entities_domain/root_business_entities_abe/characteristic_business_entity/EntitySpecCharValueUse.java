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
* A use of the CharacteristicSpecificationValue by an EntitySpecificatio 
* n to which additional properties (attributes) apply or override the pr 
* operties of similar properties contained in CharacteristicSpecificatio 
* nValue. 
 @since SID_R16.5
*/ 

public  class EntitySpecCharValueUse  {



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
* Field entitySpecCharUse
*/
protected EntitySpecCharUse entitySpecCharUse ;




/**  
* Field characteristicSpecValue
*/
protected CharacteristicSpecValue characteristicSpecValue ;




/**  
* Field charPriceDepMember
*/
protected List<CharPriceDepMember> charPriceDepMember ;




/**  
* Field entitySpecCharValueUseRelationship
*/
protected List<EntitySpecCharValueUse> entitySpecCharValueUseRelationship ;




/**  
* Field entitySpecCharValueUseRelationship1
*/
protected List<EntitySpecCharValueUse> entitySpecCharValueUseRelationship1 ;




/**  
* Field configurationSpecConstraint2
*/
protected List<ConfigurationSpecConstraint> configurationSpecConstraint2 ;




/**  
* Field configSpecConstraintMember2
*/
protected List<ConfigSpecConstraintMember> configSpecConstraintMember2 ;




/**  
* Field policySet
*/
protected PolicySet policySet ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;


}