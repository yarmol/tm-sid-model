/**
* Hardware ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E2C3EF2015D-content.html">Hardware ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.physicalresource_abe.hardware_business_entity ;

/**
* This class represents an actual or potential end point of a topologica 
* l (physical) link, and corresponds directly to a physical port on a to 
* pology map. PhysicalPorts are always contained by another physical obj 
* ect - they can't exist by themselves. The two most common examples are 
*  PhysicalPorts on a Card and on a Chassis. 

Inheritance tree: |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware" href="_3E3F0EC000E93CDAD87C0261-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::ManagedHardware</a> |- 
 <a title="SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware" href="_3E3F0EC000E93CDAB5F60264-content.html">SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::Hardware ABE::Hardware</a> |- 
 SID Models::Resource Domain::Resource ABE::PhysicalResource ABE::PhysicalResource |- 
 SID Models::Resource Domain::Resource ABE::Resource |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public  class PhysicalPort extends ManagedHardware,Hardware,PhysicalResource,Resource,Entity,RootEntity {



/**  
* Field network
*/
protected Network network ;




/**  
* Field deviceInterface
*/
protected List<DeviceInterface> deviceInterface ;




/**  
* Field chassis
*/
protected Chassis chassis ;




/**  
* Field card
*/
protected Card card ;




/**  
* Field duplexMode
* This is an enumerated integer that defines the duplex mode of this por 

* t. Values are:</br></br> 0: Unknown</br> 1: Full Duplex</br> 2: Half D 

* uplex</br></br>This is a REQUIRED attribute.</br> 

*/
protected Integer duplexMode ;




/**  
* Field ifType
* This is an enumerated integer, and specifies the particular media type 

*  of the link. This attribute provides additional detail beyond that pr 

* ovided in the ifType of an ifEntry of a MIB (e.g., distinguishing betw 

* een 10Base and 100Base ethernet). Values include:</br></br> 0: Unknown 

* </br> 1: 10BaseT</br> 2: 100BaseT</br> 3: 10-100BaseT</br> 4: 1000Base 

* T</br> 5: 10000BaseT</br> 6: DS-0</br> 7: DS-1</br> 8: DS-3</br> 9: OC 

* -3</br>10: OC-12</br>11: OC-48</br>12: OC-192</br></br>This is a REQUI 

* RED attribute.</br> 

*/
protected Integer ifType ;




/**  
* Field portNumber
* This is a non-zero integer that uniquely identifies this PhysicalPort  

* instance from all other instances. This is a REQUIRED attribute. 

*/
protected Integer portNumber ;




/**  
* Field typeOfPPort
* This is an enumerated integer that defines the particular type of Phys 

* icalPort this instance is. Values include:</br></br>0: Unknown</br>1:  

* Ethernet</br>2: FastEthernet</br>3: Auto-Sensing</br>4: GigabitEtherne 

* t</br>5: FastGigabitEthernet</br>6: DS-0</br>7: DS-1</br>8: DS-3</br>9 

* : T1</br>10: T3</br>11: E1</br>12: E3</br>13: OC-3</br>14: OC-12</br>1 

* 5: OC-48</br>16: OC-192</br>17: RS-232C</br></br>This is a REQUIRED at 

* tribute.</br> 

*/
protected Integer typeOfPPort ;




/**  
* Field vendorPortName
* This is a string that contains the vendor-specific name of this port.  

* This is different from the commonName attribute, which represents a sy 

* stem-wide naming structure for all ManagedEntities. 

*/
protected String vendorPortName ;




/**  
* Field physicalConnector
*/
protected List<PhysicalConnector> physicalConnector ;




/**  
* Field resourcePort
*/
protected ResourcePort resourcePort ;


}