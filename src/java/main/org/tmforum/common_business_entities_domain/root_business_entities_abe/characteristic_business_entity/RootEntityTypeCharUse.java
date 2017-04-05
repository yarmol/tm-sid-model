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
* A use of the CharacteristicSpecification by a RootEntityType to which  
* additional properties (attributes) apply or override the properties of 
*  similar properties contained in CharacteristicSpecification. 
 @since SID_R16.5
*/ 

public  class RootEntityTypeCharUse  {



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

* . Possible values are; "unique while value is in effect" and "unique w 

* hether value is in effect or not". 

*/
protected String unique ;




/**  
* Field isPackage
* An indicator that specifies that the associated CharacteristicSpecific 

* ation is a composite. 

*/
protected Boolean isPackage ;




/**  
* Field canBeOveridden
* An indicator that specifies that the CharacteristicSpecValues associat 

* ed with the </br>CharacteristicSpec cannot be changed when instantiati 

* ng a CharacteristicValue. </br>For example, a bandwidth of 64 MB canno 

* t be changed. 

*/
protected Boolean canBeOveridden ;




/**  
* Field minCardinality
* The minimum number of instances a CharacteristicValue can take on. For 

*  example, </br>zero to five phone numbers in a group calling plan, whe 

* re zero is the value for the minCardinality. 

*/
protected Integer minCardinality ;




/**  
* Field maxCardinality
* The maximum number of instances a CharacteristicValue can take on. For 

*  example, </br>zero to five phone numbers in a group calling plan, whe 

* re five is the value for the maxCardinality. 

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
* Field validFor
* The period of time for which the use of the CharacteristicSpecificatio 

* n is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field rootEntityType
*/
protected RootEntityType rootEntityType ;




/**  
* Field characteristicSpecification
*/
protected CharacteristicSpecification characteristicSpecification ;




/**  
* Field rootEntityTypeCharValueUse
*/
protected List<RootEntityTypeCharValueUse> rootEntityTypeCharValueUse ;




/**  
* Field rootEntityTypeCharUseRelationship
*/
protected List<RootEntityTypeCharUse> rootEntityTypeCharUseRelationship ;




/**  
* Field rootEntityTYpeCharUseRelationship1
*/
protected List<RootEntityTypeCharUse> rootEntityTYpeCharUseRelationship1 ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field partyPrivacyProfileTypeCharacteristic
*/
protected List<PartyPrivacyProfileTypeCharacteristic> partyPrivacyProfileTypeCharacteristic ;


}