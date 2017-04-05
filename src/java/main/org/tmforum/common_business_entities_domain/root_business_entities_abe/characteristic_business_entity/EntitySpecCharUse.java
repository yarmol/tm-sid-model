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
* A use of the CharacteristicSpecification by an EntitySpecification to  
* which additional properties (attributes) apply or override the propert 
* ies of similar properties contained in CharacteristicSpecification. 
 @since SID_R16.5
*/ 

public  class EntitySpecCharUse  {



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

* . 

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

* ed with the CharacteristicSpec cannot be changed when instantiating a  

* CharacteristicValue. For example, a bandwidth of 64 MB cannot be chang 

* ed. 

*/
protected Boolean canBeOveridden ;




/**  
* Field minCardinality
* For example, zero to five phone numbers in a group calling plan, where 

*  zero is the value for the minCardinality. 

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
* Field entitySpecCharValueUse
*/
protected List<EntitySpecCharValueUse> entitySpecCharValueUse ;




/**  
* Field entitySpecification
*/
protected EntitySpecification entitySpecification ;




/**  
* Field sapSpec
*/
protected SapSpecification sapSpec ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field entitySpecCharUse1
*/
protected List<EntitySpecCharUse> entitySpecCharUse1 ;




/**  
* Field characteristicSpecification2
*/
protected CharacteristicSpecification characteristicSpecification2 ;




/**  
* Field partyRoleSpecification
*/
protected PartyRoleSpecification partyRoleSpecification ;




/**  
* Field workSpecification
*/
protected WorkSpecification workSpecification ;




/**  
* Field catalogSpecification
*/
protected CatalogSpecification catalogSpecification ;




/**  
* Field metricDefinition
*/
protected MetricDefinition metricDefinition ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field configurationSpecification
*/
protected ConfigurationSpecification configurationSpecification ;




/**  
* Field testSpecification
*/
protected TestSpecification testSpecification ;




/**  
* Field partySettlementSpecification
*/
protected List<PartySettlementSpecification> partySettlementSpecification ;




/**  
* Field paymentMethodSpecification
*/
protected PaymentMethodSpecification paymentMethodSpecification ;




/**  
* Field partyRevenueSharingModelSpecification
*/
protected PartyRevenueSharingModelSpecification partyRevenueSharingModelSpecification ;


}