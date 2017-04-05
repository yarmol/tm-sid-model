/**
* Product Configuration ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_U.h.o7.gLEUE.eO.zH-.sW.b.tWA.yQ-content.html">Product Configuration ABE</a> 
* The definition of how a Product operates or functions in terms of Char 
* acteristicSpecification(s) and related ResourceSpec(s), ProductSpec(s) 
* , ServiceSpec(s) as well as a representation of how a Product operates 
*  or functions in terms of characteristics and related Resource(s), Pro 
* duct(s), Service(s). 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_configuration_business_entity ;

/**
* The definition of how a Product operates or functions in terms of Char 
* acteristicSpecification(s) and related ResourceSpec(s), ProductSpec(s) 
* , ServiceSpec(s). 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Configuration and Profiling ABE::ConfigurationSpecification @since SID_R16.5
*/ 

public  class ProductConfigSpec extends ConfigurationSpecification {



/**  
* Field productConfiguration
*/
protected List<ProductConfiguration> productConfiguration ;




/**  
* Field productSpecification2
*/
protected ProductSpecification productSpecification2 ;




/**  
* Field product2
*/
protected Product product2 ;




/**  
* Field productConfigSpecAction
*/
protected List<ProductConfigSpecAction> productConfigSpecAction ;




/**  
* Field productConfigSpecAction2
*/
protected List<ProductConfigSpecAction> productConfigSpecAction2 ;


}