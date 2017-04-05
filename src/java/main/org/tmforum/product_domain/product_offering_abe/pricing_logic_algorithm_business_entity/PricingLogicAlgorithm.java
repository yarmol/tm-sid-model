/**
* Pricing Logic Algorithm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_T.r5BABP5E.d-O57.wBCB.zL.fA-content.html">Pricing Logic Algorithm ABE</a> 
* The PricingLogicAlgorithm ABE contains entities representing an instan 
* tiation of an interface specification to external rating function (wit 
* hout a modeled bahavior in SID). 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.pricing_logic_algorithm_business_entity ;

/**
* The PricingLogicAlgorithm entity represents an instantiation of an int 
* erface specification to external rating function (without a modeled ba 
* havior in SID). Some of the parameters of the interface definiition ma 
* y be already set (such as price per unit) and some may be gathered dur 
* ing the rating process from the event (such as call duration) or from  
* ProductCharacteristicValues (such as assigned bandwidth)  
 @since SID_R16.5
*/ 

public  class PricingLogicAlgorithm  {



/**  
* Field pricingLogicAlgorithmSpec
*/
protected PricingLogicAlgorithmSpec pricingLogicAlgorithmSpec ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field componentProdOfferPrice
*/
protected List<ComponentProdOfferPrice> componentProdOfferPrice ;




/**  
* Field productCharacteristicValue
*/
protected List<ProductCharacteristicValue> productCharacteristicValue ;




/**  
* Field ID
* Unique ID of this PricingLogicAlgorithm 

*/
protected String ID ;




/**  
* Field name
* Meaningful name for this PricingLogicAlgorithm (such as "usage rating  

* at $0.20/minute") 

*/
protected String name ;




/**  
* Field description
* Desctiption of this PricingLogicAlgorithm 

*/
protected String description ;




/**  
* Field validFor
* The period during which the PricingLogicAlgorithm is applicable. 

*/
protected TimePeriod validFor ;


}