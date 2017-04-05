/**
* Product ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA6D00A4-content.html">Product ABE</a> 
* Represents an instance of a product offering subscribed to by a party, 
*  such as a customer, the place where the product is in use, as well as 
*  configuration characteristics, such as assigned telephone numbers and 
*  internet addresses.  The Product ABE also tracks the services and/or  
* resources through which the product is realized. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_business_entity ;

/**
* A value of a ProductSpecCharacteristic chosen for a Product that furth 
* er defines what the Product is. 
 @since SID_R16.5
*/ 

public  class ProductCharacteristicValue  {



/**  
* Field resourceCharacteristicValue
*/
protected List<ResourceCharacteristicValue> resourceCharacteristicValue ;




/**  
* Field serviceCharacteristicValue
*/
protected List<ServiceCharacteristicValue> serviceCharacteristicValue ;




/**  
* Field productSpecCharacteristic
*/
protected ProductSpecCharacteristic productSpecCharacteristic ;




/**  
* Field productSpecCharacteristicValue
*/
protected ProductSpecCharacteristicValue productSpecCharacteristicValue ;




/**  
* Field value
* A fact that describes a Product.</br>Required if the association there 

*  is an association with ProductSpecCharacteristic only. 

*/
protected String value ;




/**  
* Field validFor
* The period for which the characteristic value is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field product
*/
protected Product product ;




/**  
* Field pricingLogicAlgorithm
*/
protected List<PricingLogicAlgorithm> pricingLogicAlgorithm ;




/**  
* Field matrixCharValueIndex
*/
protected List<MatrixCharValueIndex> matrixCharValueIndex ;


}