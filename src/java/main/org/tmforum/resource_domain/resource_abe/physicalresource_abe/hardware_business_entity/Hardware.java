/**
* Hardware ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3EF2015D-content.html">Hardware ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.hardware_business_entity ;

/**
* This is an abstract base class that represents any type of hardware en 
* tity that exists as an atomic unit that is not a PhysicalLink or a Phy 
* sicalConnector. Hardware is defined as any component that has a distin 
* ct physical identity and can be a component of a PhysicalDevice. An ob 
* ject has a physical identity if it has a physical manifestation that e 
* nables it to be held and have a label attached to it. Thus, software,  
* files, protocols, and policies are not physical objects. 

Inheritance tree: |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class Hardware extends PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field depth
* This attribute defines the depth of the ManagedComponent using the uni 

* ts specified in the MeasurementUnits attribute. This is an optional at 

* tribute. 

*/
protected String depth ;




/**  
* Field height
* This attribute defines the height of the ManagedComponent using the un 

* its specified in the MeasurementUnits attribute. This is an optional a 

* ttribute. 

*/
protected String height ;




/**  
* Field measurementUnits
* This attribute defines the MeasurementUnits for the Depth, Height, and 

*  Width attributes of this object. Values include:</br></br> 0: Unknown 

*  (or not measured)</br> 1: inches</br> 2: feet</br> 3: millimeters</br 

* > 4: centimeters</br> 5: meters</br></br>This is an optional attribute 

* . However, if any of the Depth, Height, or Width attributes are define 

* d, then this attribute is REQUIRED.</br> 

*/
protected Integer measurementUnits ;




/**  
* Field weight
* This attribute defines the weight of the ManagedComponent using the un 

* its specified in the WeightUnits attribute. This is an optional attrib 

* ute. 

*/
protected String weight ;




/**  
* Field weightUnits
* This attribute defines the Units for the Weight attribute of this obje 

* ct. Values include:</br></br> 0: Unknown (Not Measured)</br> 1: ounces 

* </br> 2: pounds</br> 3: grams</br> 4: kilograms</br></br>This is an op 

* tional attribute. However, if Weight attribute is defined, then this a 

* ttribute is REQUIRED.</br> 

*/
protected Integer weightUnits ;




/**  
* Field width
* This attribute defines the width of the ManagedComponent using the uni 

* ts specified in the MeasurementUnits attribute. This is an optional at 

* tribute. 

*/
protected String width ;




/**  
* Field physicalConnector
*/
protected List<PhysicalConnector> physicalConnector ;




/**  
* Field hardware
*/
protected List<Hardware> hardware ;




/**  
* Field hardware1
*/
protected Hardware hardware1 ;




/**  
* Field physicalLink
*/
protected List<PhysicalLink> physicalLink ;




/**  
* Field physicalDevice
*/
protected PhysicalDevice physicalDevice ;




/**  
* Field device
*/
protected Device device ;




/**  
* Field equipmentHolder
*/
protected EquipmentHolder equipmentHolder ;




/**  
* Field commonPlatformEnumeration
*/
protected CommonPlatformEnumeration commonPlatformEnumeration ;


}