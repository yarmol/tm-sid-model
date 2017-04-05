/**
* PhysicalResource ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DDEA0E303D6-content.html">PhysicalResource ABE</a> 
* The Resource ABE contains entities that are used to represent the vari 
* ous aspects of a Resource.PhysicalResource entities are sets of entiti 
* es that represent the physical aspects of a Resource. This is importan 
* t to enable the SID to build a set of reusable managed entities that c 
* an be used to model the physical aspects of different types of Resourc 
* es. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_business_entity ;

/**
* This is an abstract base class for describing different types of hardw 
* are that constitute a Product. It has two main purposes: (1) to collec 
* t common attributes and relationships for all hardware, and (2) to pro 
* vide a convenient, single point where relationships with other managed 
*  objects can be defined.The HasWarrantyInfo association (not shown) de 
* scribes warranty information of hardware. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PhysicalResource extends Resource,Entity,RootEntity {



/**  
* Field uniqueRepresentation
*/
protected List<Representation> uniqueRepresentation ;




/**  
* Field place
*/
protected List<Place> place ;




/**  
* Field localPlace
*/
protected List<LocalPlace> localPlace ;




/**  
* Field replacementSet
*/
protected ReplacementSet replacementSet ;




/**  
* Field manufactureDate
* This is a string attribute that defines the date of manufacture of thi 

* s item in the fixed format "dd/mm/yyyy". This is an optional attribute 

* .</br> 

*/
protected String manufactureDate ;




/**  
* Field otherIdentifier
* This is a string that is used to contain other important identifying d 

* ata, such as a bar code, of the hardware item. This is an optional att 

* ribute. 

*/
protected String otherIdentifier ;




/**  
* Field powerState
* This is an enumerated integer that defines the current power status of 

*  the hardware item. Values include:</br></br> 0: Unknown</br> 1: Not A 

* pplicable</br> 2: No Power Applied</br> 3: Full Power Applied</br> 4:  

* Power Save - Normal</br> 5: Power Save - Degraded</br> 6: Power Save - 

*  Standby</br> 7: Power Save - Critical</br> 8: Power Save - Low Power  

* Mode</br> 9: Power Save - Unknown</br> 10: Power Cycle</br> 11: Power  

* Warning</br> 12: Power Off</br></br>Value 1 means that the hardware it 

* em doesn't require the direct application of power (e.g., a but or bol 

* t). If the value for this item is 3, then the PowerCapability class wi 

* ll describe the particular power requirements of this item through the 

*  HasPower association.</br></br>This is an optional attribute.</br> 

*/
protected Integer powerState ;




/**  
* Field serialNumber
* This is a string that represents a manufacturer-allocated number used  

* to identify different instances of the same hardware item. The ModelNu 

* mber and PartNumber attributes are used to identify different types of 

*  hardware items. This is a REQUIRED attribute. 

*/
protected String serialNumber ;




/**  
* Field versionNumber
* This is a string that identifies the version of this object. This is a 

* n optional attribute. 

*/
protected String versionNumber ;




/**  
* Field logicalResource
*/
protected List<LogicalResource> logicalResource ;




/**  
* Field product
*/
protected Product product ;




/**  
* Field physicalResourceRole
*/
protected List<PhysicalResourceRole> physicalResourceRole ;




/**  
* Field resourceFacingService1
*/
protected List<ResourceFacingService> resourceFacingService1 ;




/**  
* Field network
*/
protected Network network ;




/**  
* Field virtualResource
*/
protected List<VirtualResource> virtualResource ;




/**  
* Field networkFunction
*/
protected List<NetworkFunction> networkFunction ;


}