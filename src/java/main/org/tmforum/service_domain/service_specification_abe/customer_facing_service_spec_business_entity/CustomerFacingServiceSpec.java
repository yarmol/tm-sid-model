/**
* Customer Facing Service Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E379A8B0070-content.html">Customer Facing Service Spec ABE</a> 
* The Customer Facing Service Spec ABE defines the common characteristic 
* s for a set of CustomerFacingServices. This scales by enabling multipl 
* e CustomerFacingServiceSpecs to be defined to model the common charact 
* eristics of different groups of CustomerFacingServices. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_abe.customer_facing_service_spec_business_entity ;

/**
* A CustomerFacingServiceSpec defines the properties (attributes) common 
*  to a particular CustomerFacingService used to realize the associated  
* Product(s). This entity serves as a common basis to build any set of C 
* ustomerFacingServices that the service provider needs.The CustomerFaci 
* ngServiceSpec represents all the Service Provider’s know-how of non-ta 
* ngible goods at a functional level. It would be more appropriate to na 
* me it KonwHowSpec or ProductFacingServiceSpec, but the name is not cha 
* nged as it is well known.The ProductSpecification corresponds to a sub 
* -set of the Service Provider’s know-how according to what marketing pe 
* ople want to sell. Therefore, a ProductSpecification is a restriction  
* of CustomerFacingServiceSpecs. 

Inheritance tree: |- 
 SID Models::Service Domain::Service Specification ABE::ServiceSpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class CustomerFacingServiceSpec extends ServiceSpecification,EntitySpecification,RootEntity {



/**  
* Field resourceFacingServiceSpec
*/
protected ResourceFacingServiceSpec resourceFacingServiceSpec ;




/**  
* Field customerFacingService
*/
protected List<CustomerFacingService> customerFacingService ;




/**  
* Field customerFacingServiceSpecComposite
*/
protected CustomerFacingServiceSpecComposite customerFacingServiceSpecComposite ;




/**  
* Field customerFacingServiceSpecVersion
*/
protected List<CustomerFacingServiceSpecVersion> customerFacingServiceSpecVersion ;




/**  
* Field customerFacingServiceSpecRole
*/
protected List<CustomerFacingServiceSpecRole> customerFacingServiceSpecRole ;




/**  
* Field productSpecification
*/
protected List<ProductSpecification> productSpecification ;




/**  
* Field fulfilledSalesProdSpec
*/
protected List<FulfilledSalesProdSpec> fulfilledSalesProdSpec ;




/**  
* Field purchaseProductSpecification
*/
protected List<PurchaseProductSpecification> purchaseProductSpecification ;


}