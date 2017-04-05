/**
* PLA Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6.w.dB.sBP5E.d-O57.wBCB.zL.fA-content.html">PLA Spec ABE</a> 
* The PLA Spec ABE specifies Pricing Logic Algorithm. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.pricing_logic_algorithm_abe.pla_spec_business_entity ;

/**
* The PricingLogicAlgorithmSpec entity specifies an interface to (potent 
* ially external) rating function that can rate billing events (usage, r 
* ecurring or on time). This entity lists all the parameters that should 
*  be passed to the rating function in order to rate the events correctl 
* y. Parameters can be determined when instantiating this entity as Pric 
* ingLogicAlgorithm (e.g. price per unit) or come from the rated event ( 
* e.g. call duration) or the ProductCharacteristicValue (e.g. bandwidth) 
* . 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PricingLogicAlgorithmSpec extends EntitySpecification,RootEntity {



/**  
* Field pricingLogicAlgorithm
*/
protected List<PricingLogicAlgorithm> pricingLogicAlgorithm ;




/**  
* Field productSpecCharacteristic
*/
protected List<ProductSpecCharacteristic> productSpecCharacteristic ;


}