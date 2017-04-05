/**
* Resource Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EA5CCD30232-content.html">Resource Specification ABE</a> 
* The Resource Specification ABE contains entities that define the share 
* d characteristics and behavior of each of the four types of Resource e 
* ntities. This enables multiple instances to be derived from a single s 
* pecification entity. In this derivation, each instance will use the sh 
* ared characteristics and behavior defined in its associated template. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_business_entity ;

/**
* This is an abstract base class that is used to define the invariant ch 
* aracteristics and behavior (attributes, methods, constraints, and rela 
* tionships) of a managed or unmanaged Resource. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::EntitySpecification |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class ResourceSpecification extends EntitySpecification,RootEntity {



/**  
* Field businessInteractionItem
*/
protected List<BusinessInteractionItem> businessInteractionItem ;




/**  
* Field resourceSpecVersion
*/
protected List<ResourceSpecVersion> resourceSpecVersion ;




/**  
* Field resourceSpecification2
*/
protected List<ResourceSpecification> resourceSpecification2 ;




/**  
* Field resourceSpecification1
*/
protected List<ResourceSpecification> resourceSpecification1 ;




/**  
* Field resourceSpecType
*/
protected List<ResourceSpecificationType> resourceSpecType ;




/**  
* Field resource
*/
protected List<Resource> resource ;




/**  
* Field compoundResourceSpec
*/
protected List<CompoundResourceSpec> compoundResourceSpec ;




/**  
* Field resourceUsageSpec
*/
protected List<ResourceUsageSpec> resourceUsageSpec ;




/**  
* Field resourceFacingServiceSpec
*/
protected List<ResourceFacingServiceSpec> resourceFacingServiceSpec ;




/**  
* Field productSpecification2
*/
protected List<ProductSpecification> productSpecification2 ;




/**  
* Field networkAddressSpecification
*/
protected List<NetworkAddressSpecification> networkAddressSpecification ;




/**  
* Field resourceSpecCharacteristic
*/
protected List<ResourceSpecCharacteristic> resourceSpecCharacteristic ;




/**  
* Field performancespecification
*/
protected List<PerformanceSpecification> performancespecification ;




/**  
* Field sapSpec
*/
protected List<SapSpecification> sapSpec ;




/**  
* Field resourceCapacity
*/
protected List<ResourceCapacity> resourceCapacity ;




/**  
* Field resourceCapacityDemand
*/
protected List<ResourceCapacityDemand> resourceCapacityDemand ;




/**  
* Field resourceCandidate
*/
protected List<ResourceCandidate> resourceCandidate ;




/**  
* Field supplier
*/
protected Supplier supplier ;




/**  
* Field softwareSpecification
*/
protected List<SoftwareSpecification> softwareSpecification ;




/**  
* Field resourceConfigSpec
*/
protected List<ResourceConfigSpec> resourceConfigSpec ;




/**  
* Field resourceTestSpecRole
*/
protected List<ResourceTestSpec> resourceTestSpecRole ;




/**  
* Field fulfilledSalesProdSpec
*/
protected List<FulfilledSalesProdSpec> fulfilledSalesProdSpec ;




/**  
* Field purchaseProductSpecification
*/
protected List<PurchaseProductSpecification> purchaseProductSpecification ;




/**  
* Field resourceSpecificationRelationship
*/
protected List<ResourceSpecificationRelationship> resourceSpecificationRelationship ;




/**  
* Field resourceSpecificationRelationship2
*/
protected List<ResourceSpecificationRelationship> resourceSpecificationRelationship2 ;


}