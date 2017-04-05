/**
* Usage Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.kX.g.wIBQBE.d-O57.wBCB.zL.fA-content.html">Usage Spec ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_abe.usage_spec_business_entity ;

/**
* A detailed description of an attribute that defines a particular type  
* of usage, described by its name, category, type, presence and a set of 
*  allowed values. 
 @since SID_R16.5
*/ 

public  class UsageSpecCharacteristic  {



/**  
* Field ID
* A unique identifier for the UsageSpecCharacteristic. 

*/
protected String ID ;




/**  
* Field name
* The name of the usage characteristic. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the usage characteristic. 

*/
protected String description ;




/**  
* Field unique
* An indicator that specifies if a value is unique for the specification 

* .</br></br>Permitted Values: "unique while value is in effect" and "un 

* ique whether value is in effect or not"</br> 

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
* Field usageCharacteristicCategory
*/
protected UsageCharacteristicCategory usageCharacteristicCategory ;




/**  
* Field usageSpecification
*/
protected List<UsageSpecification> usageSpecification ;




/**  
* Field usageSpecCharacteristicValue
*/
protected List<UsageSpecCharacteristicValue> usageSpecCharacteristicValue ;




/**  
* Field usageCharacteristicValue
*/
protected List<UsageCharacteristicValue> usageCharacteristicValue ;




/**  
* Field usageSpecCharacteristic
*/
protected List<UsageSpecCharacteristic> usageSpecCharacteristic ;




/**  
* Field usageSpecCharacteristic1
*/
protected List<UsageSpecCharacteristic> usageSpecCharacteristic1 ;




/**  
* Field usagePLASpec
*/
protected List<UsagePLASpec> usagePLASpec ;




/**  
* Field usageCharacteristicSumSpec
*/
protected List<UsageCharacteristicSumSpec> usageCharacteristicSumSpec ;




/**  
* Field usageCharacteristicSumSpec2
*/
protected List<UsageCharacteristicSumSpec> usageCharacteristicSumSpec2 ;


}